<template>
	<div class="wrapper">
		<HeadBlock><p>确认订单</p></HeadBlock>
		<!-- 订单信息部分 -->
		<div class="order-info">
			<h5>订单配送至：</h5>
      <div class="order-info-address">
        <select id="dizhi">
          <option v-for="(addinfo,index) in uAddList">{{addinfo.add}} {{addinfo.conname}} {{addinfo.contel}}</option>
        </select>
      </div>
		</div>

		<h3>{{$route.query.title}}</h3>

		<!-- 订单明细部分 -->
		<ul class="order-detailed">
			<li v-for="(food,index) in foodlist">
				<div class="order-detailed-left">
					<img :src="food.imgsrc">
					<p>{{food.name}} x {{food.num}}</p>
				</div>
				<p>&#165;{{xiaoji(index)}}</p>
			</li>
			<li class="order-deliveryfee">
				<p>配送费</p>
				<p>&#165;{{$route.query.deli}}</p>
			</li>
		</ul>
		
		<!-- 合计部分 -->
		<div class="total">
			<div class="total-left">
				&#165;{{$route.query.sum}}
			</div>
			<div class="total-right" @click="gotopay">
				去支付
			</div>
		</div>
	</div>
</template>

<script>
  const axios = require('axios');
	import HeadBlock from '../components/HeadBlock.vue'
	export default {
		name:'confirmview',
		components:{HeadBlock},

    mounted() {
      var that = this;
      // let example = new URLSearchParams();

      axios.get(`http://localhost:8080/servletVue/confirmOrderView`, {params:{uid:that.uid}}).then(function (res){
        console.log(res);
        that.uAddList = res.data;
        console.log(that.uAddList);
      }).catch(function (res){
        console.log("失败了");
      })
    },
    data() {
			return {
        uid:114514,//需要前面页面传值
        uAddList:[],
				foodlist:[]
			}
		},
		created() {
			this.foodlist=JSON.parse(this.$route.query.arr);
		},
		methods:{
			xiaoji(i){
				return this.foodlist[i].unitPrice * this.foodlist[i].num
			},
			gotopay(){
			// 	this.$router.push({
			// 	path:'/payview',
			// 	query:{
			// 	sum:this.$route.query.sum,
			// 	title:this.$route.query.title,
			// 	deli:this.$route.query.deli,
			// 	arr:JSON.stringify(this.foodlist)
			// 	}
			// })
        axios.post(`http://localhost:8080/servletVue/confirmOrderView`, {params:{
            uid:114514,
            bid:7900,//需要前面页面传值
            daid:this.uAddList[document.getElementById("dizhi").selectedIndex].daid,
            ott:this.$route.query.sum//需要前面页面传值
        }}).then(function (res){
          console.log(res)}).catch(function (res){console.log("失败了");})},
		}
	}
</script>

<style>
	@import url('../assets/css/order.css');
</style>
