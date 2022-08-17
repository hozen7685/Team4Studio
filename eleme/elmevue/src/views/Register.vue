<template>
	<div class="wrapper">
		<HeadBlock>用户注册</HeadBlock>
		<ul class="user-info">
			<li><p>手机号码：</p><input v-model="id" type="text" placeholder="手机号码"></li>
			<li><p>密码：</p><input type="password" placeholder="密码"></li>
			<li><p>确认密码：</p><input v-model="pwd" type="password" placeholder="确认密码"></li>
			<li><p>性别：</p><input name="gender" type="radio" checked>男<input name="gender" type="radio">女</li>
		</ul>
		<div class="register" @click="gotoindex">注册</div>
		<FooterMenu></FooterMenu>
	</div>
</template>

<script>
	import FooterMenu from '../components/FooterMenu.vue'
	import HeadBlock from '../components/HeadBlock.vue'
	export default {
		name:'register',
		components:{FooterMenu,HeadBlock},
		data(){
			return{
				id:'',pwd:''
			}
		},
		methods: {
			gotoindex() {
				localStorage.setItem(id,this.id);
				localStorage.setItem(pwd,this.pwd);
				this.$router.push({
					path:'/login'})
			}
		}
	}		
</script>

<style>
	@import url('../assets/css/register.css');
</style>