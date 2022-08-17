<template>
	<div class="wrapper">
		<HeadBlock style="position: relative;">用户登录</HeadBlock>
		<ul class="user-info">
			<li><p>手机号码：</p><input v-model="id" type="text" placeholder="手机号码"></li>
			<li><p>密码：</p><input v-model="pwd" type="password" placeholder="密码"></li>
		</ul>
		<div class="login" @click="gotoindex">登录</div>
		<div class="register" @click="gotoregis">注册</div>
		<FooterMenu></FooterMenu>
	</div>
</template>

<script>
	import FooterMenu from '../components/FooterMenu.vue'
	import HeadBlock from '../components/HeadBlock.vue'
	export default {
		name:'login',
		components:{FooterMenu,HeadBlock},
		data(){
			return{
				id:'',pwd:''
			}
		},
		methods: {
			gotoindex() {
				if(this.id==localStorage.getItem(id)&&this.pwd==localStorage.getItem(pwd))
				{this.$router.push({path:'/'})}
				else{alert('用户名或密码错误')}
			},
			gotoregis(){
				this.$router.push({
					path:'/register'})
			}
		},
		}	
</script>

<style>
	@import url('../assets/css/login.css');
</style>