<template>
	<header>
		<!-- vue插槽，预留一个位置由父组件使用时插入内容 -->
		<slot></slot>
	</header>
</template>

<script>
	export default {
		name: 'HeadBlock'
	}
</script>

<style>
	header {
		width: 100%;
		height: 12vw;
		background-color: #0097FF;
		display: flex;
		align-items: center;
		font-size: 3.5vw;
		font-weight: 700;
		color: #fff;
		position: fixed;
		left: 0;top: 0;
		z-index: 999;
	}
	header p{
		margin: 0 auto;
	}
	.wrapper header .icon-location-box {
		width: 3.5vw;
		height: 3.5vw;
		margin: 0 1vw 0 3vw;
	}

	.wrapper header .location-text {
		font-size: 4.5vw;
		font-weight: 700;
		color: #fff;
	}

	.wrapper header .location-text .fa-caret-down {
		margin-left: 1vw;
	}
</style>
