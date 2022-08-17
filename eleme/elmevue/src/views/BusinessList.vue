<template>
	<div class="wrapper">
		<HeadBlock><p>商家列表</p></HeadBlock>
		<!-- 商家列表部分 -->
		<ul class="business">
			<li v-for="(business,index) in list" @click="jump(index)">
				<div class="business-img">
					<img :src="business.imgsrc">
					<div v-show="business.num>0" class="business-img-quantity">{{business.num}}</div>
				</div>
				<div class="business-info">
					<h3>{{business.name}}</h3>
					<p>&#165;{{business.less}}起送 | &#165;{{business.fee}}配送</p>
					<p>{{business.explain}}</p>
				</div>
			</li>
		</ul>
		<FooterMenu></FooterMenu>
	</div>
</template>

<script>
	import FooterMenu from '../components/FooterMenu.vue'
	import HeadBlock from '../components/HeadBlock.vue'
	export default {
		name:'businesslist',
		components:{FooterMenu,HeadBlock},
	data(){
		return{
			list:[]
		}
	},
	methods:{
		jump(i){
			// console.log(JSON.stringify(this.list[i]));
			this.$router.push({
				path:'/businessinfo',
				query:{
					imgsrc:this.list[i].imgsrc,
					num:this.list[i].num,
					name:this.list[i].name,
					less:this.list[i].less,
					fee:this.list[i].fee,
					explain:this.list[i].explain
				}
			})
		}
	},
	created(){
		this.list = [{
			imgsrc:require('../assets/img/sj01.png'),
			num:3,
			name:'万家饺子（软件园E18店）',
			less:15,
			fee:3,
			explain:'各种饺子炒菜',
		},{
			imgsrc:require('../assets/img/sj02.png'),
			num:null,
			name:'小锅饭豆腐馆（全运店）',
			less:10,
			fee:9,
			explain:'特色美食'
		},{
			imgsrc:require('../assets/img/sj03.png'),
			num:null,
			name:'麦当劳麦乐送（全运路店）',
			less:15,
			fee:3,
			explain:'汉堡薯条'
		},{
			imgsrc:require('../assets/img/sj04.png'),
			num:null,
			name:'米村拌饭（浑南店）',
			less:15,
			fee:3,
			explain:'各种炒菜拌饭'
		},{
			imgsrc:require('../assets/img/sj05.png'),
			num:null,
			name:'申记串道（中海康城店）',
			less:15,
			fee:3,
			explain:'烤串炸串'
		},{
			imgsrc:require('../assets/img/sj06.png'),
			num:null,
			name:'半亩良田排骨米饭',
			less:15,
			fee:3,
			explain:'排骨米饭套餐'
		},{
			imgsrc:require('../assets/img/sj07.png'),
			num:null,
			name:'茶兮鲜果饮品（国际软件园店）',
			less:15,
			fee:3,
			explain:'甜品饮品'
		},{
			imgsrc:require('../assets/img/sj08.png'),
			num:null,
			name:'唯一水果捞（软件园E18店）',
			less:15,
			fee:3,
			explain:'新鲜水果'
		},{
			imgsrc:require('../assets/img/sj09.png'),
			num:null,
			name:'满园春饼（全运路店）',
			less:15,
			fee:3,
			explain:'各种春饼'
		}
		];
		// console.log(sessionStorage.getItem(this.list[0].name));
		for (let i = 0; i < this.list.length; i++) {
			if(sessionStorage.getItem(this.list[i].name)!=null)
			{this.list[i].num=parseInt(sessionStorage.getItem(this.list[i].name))}
			};
	}
	}
</script>

<style>
	@import url('../assets/css/businessList.css');
</style>
