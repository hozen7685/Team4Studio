<template>
		<div class="wrapper">
			<HeadBlock style="position: relative;"><i class="fa fa-map-marker"></i>沈阳市规划大厦<i class="fa fa-caret-down"></i></HeadBlock>
			<!-- search部分 -->
			<!-- 
			    搜索框部分（此块与search-fixed-top块宽度高度一致，用于当
				search-fixed-top块固定后，挡住下面块不要窜上去） 
			-->
			<div class="search">
				<!-- 当滚动条超过上面的定位块时，search-fixed-top块变成固定在顶部。 -->
				<div class="search-fixed-top" id="fixedBox">
					<!-- 搜索框部分中间的白框 -->
					<div class="search-box">
						<i class="fa fa-search"></i>搜索饿了么商家、商品名称
					</div>
				</div>
			</div>
			
			<!-- 点餐分类部分 -->
			<ul class="foodtype">
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl01.png">
					<p>美食</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl02.png">
					<p>早餐</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl03.png">
					<p>跑腿代购</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl04.png">
					<p>汉堡披萨</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl05.png">
					<p>甜品饮品</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl06.png">
					<p>速食简餐</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl07.png">
					<p>地方小吃</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl08.png">
					<p>米粉面馆</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl09.png">
					<p>包子粥铺</p>
				</li>
				<li onclick="location.href='businessList.html'">
					<img src="../assets/img/dcfl10.png">
					<p>炸鸡炸串</p>
				</li>
			</ul>
			
			<!-- 横幅广告部分 -->
			<div class="banner">
				<h3>品质套餐</h3>
				<p>搭配齐全吃得好</p>
				<a>立即抢购 &gt;</a>
			</div>
			
			<!-- 超级会员部分 -->
			<div class="supermember">
				<div class="left">
					<img src="../assets/img/super_member.png">
					<h3>超级会员</h3>
					<p>&#8226; 每月享超值权益</p>
				</div>
				<div class="right">
					立即开通 &gt;
				</div>
			</div>
			
			<!-- 推荐商家部分 -->
			<div class="recommend">
				<div class="recommend-line"></div>
				<p>推荐商家</p>
				<div class="recommend-line"></div>
			</div>
			
			<!-- 推荐方式部分 -->
			<ul class="recommendtype">
				<li>综合排序<i class="fa fa-caret-down"></i></li>
				<li>距离最近</li>
				<li>销量最高</li>
				<li>筛选<i class="fa fa-filter"></i></li>
			</ul>
			
			<!-- 推荐商家列表部分 -->
			<ul class="business">
				<li v-for="(business,index) in list">
					<img :src="business.imgsrc">
					<div class="business-info">
						<div class="business-info-h">
							<h3>{{business.name}}</h3>
							<div class="business-info-like">&#8226;</div>
						</div>
						<div class="business-info-star">
							<div class="business-info-star-left">
								<i class="fa fa-star"></i>
								<i class="fa fa-star"></i>
								<i class="fa fa-star"></i>
								<i class="fa fa-star"></i>
								<i class="fa fa-star"></i>
								<p>{{business.mark}} 月售{{business.sales}}单</p>
							</div>
							<div class="business-info-star-right">
								蜂鸟专送
							</div>
						</div>
						<div class="business-info-delivery">
							<p>&#165;{{business.less}}起送 | &#165;{{business.fee}}配送</p>
							<p>{{business.distance}}km | {{business.time}}分钟</p>
						</div>
						<div class="business-info-explain">
							<div>{{business.explain}}</div>
						</div>
					</div>
				</li>
			</ul>
			<FooterMenu></FooterMenu>
		</div>	
</template>

<script>
	import FooterMenu from '../components/FooterMenu.vue'
	import HeadBlock from '../components/HeadBlock.vue'
	export default{
		name:'IndexView',
		components:{
			FooterMenu,HeadBlock
		},
		data(){
			return{
				list:[]}
				},
		created() {
			//created配置项 是vue生命周期 钩子函数
			//一般完成与后端通信过程
			//1.向后端发送请求，获得本视图需要的数据
			//2.将后端发送回的数据赋值给data中的数据
			this.list = [{
						name:'添福来饺子馆',
						mark:3.8,
						sales:800,
						less:30,
						fee:5,
						distance:2.88,
						time:45,
						explain:'墨鱼水饺',
						imgsrc:require('../assets/img/sj01.png')
						// 动态路径配置时需要使用require
					},
					{
						name:'敏丁拌饭',
						mark:4.8,
						sales:3000,
						less:33,
						fee:3,
						distance:0.8,
						time:30,
						explain:'各种拌饭',
						imgsrc:require('../assets/img/sj02.png')
					},
					{
						name:'金拱门',
						mark:4.7,
						sales:1000,
						less:30,
						fee:9,
						distance:0.5,
						time:20,
						explain:'快餐',
						imgsrc:require('../assets/img/sj03.png')
					}
					]
		},
		// mounted挂载结束 生命周期
		mounted() {
			document.onscroll = function(){
					//获取滚动条位置
					let scroll =  document.documentElement.scrollTop;
					//获取视口宽度
					let height = document.documentElement.clientHeight;
					//获取顶部固定块
					let search = document.getElementById('fixedBox');
					//判断滚动条超过视口宽度的12%时，搜索块变固定定位
					if(search !=null){
						if(scroll>height*0.06){
						search.style.position = 'fixed';
						search.style.left = '0';
						search.style.top = '0';
					}else{
						search.style.position = 'static';
					}}
				}
		}
	}
	//vue生命周期2.0 beforecreate|created|beforemount|mounted|beforeupdate|updated|beforedestroy|destroyed
	//3.0 beforecreate|created|beforemount|mounted|beforeupdate|updated|beforeunmount|unmounted
	//最常用 created 在这个生命周期中编写的是请求后端代码获得视图数据
</script>

<style>
	/* vue项目css代码两种方式:1.样式代码不多,可以直接写在style 2.单独写css文件,在style中导入 */
	@import url('../assets/css/index.css');
/* 	header{
		position: relative;
	} */
</style>