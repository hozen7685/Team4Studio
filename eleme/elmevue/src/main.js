import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
// 项目中公用的css文件 在main.js中导入
import './assets/css/reset.css'
import './assets/framework/font-awesome/css/font-awesome.min.css'

// import './vueres.js'
import axios from './axios'
// Vue.prototype.$axios = axios

createApp(App).use(router).mount('#app')
