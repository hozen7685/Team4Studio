<template>
	<div class="wrapper">
		<HeadBlock><p>我的订单</p></HeadBlock>
		<!-- 订单列表部分 -->
<!-- 		<h3>未支付订单信息：</h3>
		<ul class="order">
			<li>
				<div class="order-info">
					<p>
						万家饺子（软件园E18店）
						<i class="fa fa-caret-down"></i>
					</p>
					<div class="order-info-right">
						<p>&#165;49</p>
						<div class="order-info-right-icon">去支付</div>
					</div>
				</div>
				<ul class="order-detailet">
					<li>
						<p>纯肉鲜肉（水饺） x 2</p>
						<p>&#165;15</p>
					</li>
					<li>
						<p>玉米鲜肉（水饺） x 1</p>
						<p>&#165;16</p>
					</li>
					<li>
						<p>配送费</p>
						<p>&#165;3</p>
					</li>
				</ul>
			</li>
		</ul> -->

		<h3>已支付订单信息：</h3>
		<ul class="order">
			<li>
				<div class="order-info">
					<p>
						{{$route.query.title}}
						<i class="fa fa-caret-down"></i>
					</p>
					<div class="order-info-right">
						<p>&#165;{{$route.query.total}}</p>
					</div>
				</div>
				<ul class="order-detailet">
					<li v-for="(item,index) in orderlist">
						<p>{{item.name}} x {{item.num}}</p>
						<p>&#165;{{xiaoji(index)}}</p>
					</li>
					<li>
						<p>配送费</p>
						<p>&#165;{{$route.query.fee}}</p>
					</li>
				</ul>
			</li>
		</ul>
		<FooterMenu></FooterMenu>
	</div>
</template>

<script>
	import FooterMenu from '../components/FooterMenu.vue'
	import HeadBlock from '../components/HeadBlock.vue'
	export default {
		name:'orderview',
		components:{FooterMenu,HeadBlock},
		data(){
			return{
				orderlist:[]
			}
		},
		methods:{
			xiaoji(i){
				return this.orderlist[i].unitPrice * this.orderlist[i].num
			}
		},
		created() {
		this.orderlist=JSON.parse(this.$route.query.arr)
		}	
	}
</script>

<style>
	@import url('../assets/css/orderList.css');
</style>
