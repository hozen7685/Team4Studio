<template>
	<div class="wrapper">
		<HeadBlock>
			<p>在线支付</p>
		</HeadBlock>
		<!-- 订单信息部分 -->
		<h3>订单信息：</h3>
		<div class="order-info">
			<p>{{$route.query.title}}<i class="fa fa-caret-down" id="showBtn"></i></p>
			<p>&#165;{{$route.query.sum}}</p>
		</div>
		<ul class="order-detailet" id="detailetBox">
			<li v-for="(foodlist,index) in foodlist">
				<p>{{foodlist.name}} x {{foodlist.num}}</p>
				<p>&#165;{{this.xiaoji(index)}}</p>
<!-- !!!!!!!!!!!!!!!!!!!不需要写foodlist[index]!!!!!!!!!!!!!!!!!!! -->
			</li>
			<li>
				<p>配送费</p>
				<p>&#165;{{$route.query.deli}}</p>
			</li>
		</ul>

		<!-- 支付方式部分 -->
		<ul class="payment-type">
			<li>
				<img src="../assets/img/alipay.png">
				<i class="fa fa-check-circle"></i>
			</li>
			<li>
				<img src="../assets/img/wechat.png">
			</li>
		</ul>
		<div class="payment-button">
			<button @click="confirm">确认支付</button>
		</div>
		<FooterMenu></FooterMenu>
	</div>

</template>

<script>
	export default {
		name: 'payview',
		components: {
			FooterMenu,
			HeadBlock
		},
		data() {
			return {
				foodlist:[]
			}
		},
		created() {
			this.foodlist=JSON.parse(this.$route.query.arr);
		},
		methods:{
			confirm() {
				console.log(this.foodlist);
				this.$router.push({
				path:'/orderview',
				query:{title:this.$route.query.title,
						total:this.$route.query.sum,
						fee:this.$route.query.deli,
						arr:JSON.stringify(this.foodlist)
						}
				})
			},
			xiaoji(i){
				return this.foodlist[i].unitPrice * this.foodlist[i].num
			}
		}
	}
	import FooterMenu from '../components/FooterMenu.vue'
	import HeadBlock from '../components/HeadBlock.vue'
</script>

<style>
	@import url('../assets/css/payment.css');
</style>
