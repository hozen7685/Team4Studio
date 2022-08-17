import { createRouter, createWebHistory } from 'vue-router'
 import IndexView from '../views/IndexView.vue'

const routes = [
	{
		name:'index',
		path:'/',
		component:IndexView
	},
	{
		name:'businessinfo',
		path:'/businessinfo',
		component:()=>import('../views/BusinessInfo.vue')
	},
	{
		name:'businesslist',
		path:'/businesslist',
		component:()=>import('../views/BusinessList.vue')
	},{
		name:'payview',
		path:'/payview',
		component:()=>import('../views/PayView.vue')
	},{
		name:'orderview',
		path:'/orderview',
		component:()=>import('../views/OrderView.vue')
	},{
		name:'confirmview',
		path:'/confirmview',
		component:()=>import('../views/ConfirmView.vue')
	},{
		name:'login',
		path:'/login',
		component:()=>import('../views/Login.vue')
	},{
		name:'register',
		path:'/register',
		component:()=>import('../views/Register.vue')
	}
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
