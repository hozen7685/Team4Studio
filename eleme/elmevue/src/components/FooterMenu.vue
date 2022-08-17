<template>
	<ul class="footer">
		<li @click="gotoindex">
			<i class="fa fa-home"></i>
			<p>首页</p>
		</li>
		<li @click="gotobl">
			<i class="fa fa-compass"></i>
			<p>发现</p>
		</li>
		<li @click="gotoov">
			<i class="fa fa-file-text-o"></i>
			<p>订单</p>
		</li>
		<li @click="gotologin">
			<i class="fa fa-user-o"></i>
			<p>我的</p>
		</li>
	</ul>
</template>

<script>
	export default{
		name:'footmenu',
		methods:{
			gotoindex(){
				this.$router.push({path:'/'})
			},
			gotobl(){
				this.$router.push({path:'/businesslist'})
			},
			gotoov(){
				this.$router.push({path:'/orderview'})
			},
			gotologin(){
				this.$router.push({path:'/login'})
			}
		}
	}
</script>

<style>
	@import url('../assets/css/footermenu.css');
</style>