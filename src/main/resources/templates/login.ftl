<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页</title>
    <link href="/css/common.css" rel="stylesheet">
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
</head>
<body>
<div id="app">
    <el-container style="height: 500px; border: 1px solid #eee">
        <el-container>
            <el-main>
                <el-form ref="form" :model="form" label-width="80px">
                    <el-form-item label="用户名">
                        <el-input v-model="form.userName"></el-input>
                    </el-form-item>
                    <el-form-item label="密码">
                        <el-input v-model="form.userPsw"></el-input>
                    </el-form-item>
                    <el-form-item>
                        <el-button type="primary" @click="onSubmit">立即登陆</el-button>
                        <el-button @click="backIndex">取消</el-button>
                    </el-form-item>
                </el-form>
            </el-main>
        </el-container>
    </el-container>
</div>
</body>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<!-- import axio -->
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
    new Vue({
        el: '#app',
        data() {
            return {
                form: {
                    userName: '',
                    userPsw: '',
                }
            }
        },
        methods: {
            backIndex() {
                window.open('/index', '_self');
            },
            onSubmit() {
                console.log('login submit!');
                axios.post('/login-in', {
                    userName: this.form.userName,
                    userPsw: this.form.userPsw,
                }).then(function (response) {
                    console.log(response);
                    if (response.data.code == 200) {
                        window.open('/user/list', '_self');
                    } else {
                        alert(response.data.msg);
                    }
                }).catch(function (error) {
                    console.log(error);
                });
            }
        }
    })
</script>
</html>