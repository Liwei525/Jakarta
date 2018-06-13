<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- import CSS -->
    <link rel="stylesheet" href="/css/common.css">
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <script>
        window.INIT_APP_DATA = {
            user : ${user![]},
            statusList : ${statusList![]}
        }
    </script>
</head>
<body>
<div id="app">
    <el-container style="height: 500px; border: 1px solid #eee">
        <el-aside width="200px" style="background-color: rgb(238, 241, 246)">
            <el-menu :default-openeds="['1', '3']">
                <el-submenu index="1">
                    <template slot="title"><i class="el-icon-message"></i>用户管理</template>
                    <el-menu-item-group>
                        <el-menu-item index="1-1">选项1</el-menu-item>
                        <el-menu-item index="1-2">选项2</el-menu-item>
                    </el-menu-item-group>
                </el-submenu>
            </el-menu>
        </el-aside>

        <el-container>
            <el-main>
                <el-form ref="form" :model="user" label-width="120px">
                    <el-form-item label="用户名">
                        <el-input width="120px" v-model="user.userName"></el-input>
                    </el-form-item>
                    <el-form-item label="昵称">
                        <el-input v-model="user.nickname"></el-input>
                    </el-form-item>
                    <el-form-item v-if="user.id > 0" label="最后登陆时间">
                        <el-input :disabled="true" v-model="user.lastLoginTimeDesc"></el-input>
                    </el-form-item>
                    <el-form-item label="密码">
                        <el-input placeholder="请输入密码" v-model="passWord"></el-input>
                    </el-form-item>

                    <el-form-item label="用户状态">
                        <el-select v-model="user.userStatusDesc" placeholder="请选择">
                            <el-option
                                    v-for="item in statusList"
                                    :key="item.code"
                                    :label="item.desc"
                                    :value="item.desc">
                            </el-option>
                        </el-select>
                    </el-form-item>

                    <el-form-item>
                        <el-button type="primary" @click="onSubmit">提交</el-button>
                        <el-button @click="backUserList">取消</el-button>
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
        data: function() {
            const statusList = window.INIT_APP_DATA.statusList;
            return {
                visible: false,
                user: window.INIT_APP_DATA.user,
                statusList: statusList,
                passWord: '',
            }
        },
        methods: {
            backUserList() {
                window.open('/user/list',_self);
            },
            onSubmit() {
                console.log('submit!');
                axios.post('/user/create', {
                    userName: this.user.userName,
                    userPsw: this.passWord,
                    nickname: this.user.nickname,
                })
                .then(function (res) {
                    console.log(res);
                })
                .catch(function (err) {
                    console.log(err);
                });
            },
        },
    })
</script>
</html>