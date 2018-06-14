<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- import CSS -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <script>
        window.INIT_APP_DATA = {
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
            <el-header style="text-align: right; font-size: 12px; background-color: #B3C0D1; line-height: 60px;">
                <el-button type="primary" icon="el-icon-search" @click="userListSearch()" >搜索用户</el-button>
                <el-button type="primary" icon="el-icon-edit" @click="editUser(0)" >新建用户</el-button>
            </el-header>

            <el-main>
                <el-table
                        :data="userList"
                        style="width: 100%">
                    <el-table-column
                            prop="userName"
                            label="账号"
                            width="333">
                    </el-table-column>
                    <el-table-column
                            prop="nickname"
                            label="昵称"
                            width="333">
                    </el-table-column>
                    <el-table-column
                            prop="userStatusDesc"
                            label="账号状态"
                            width="333">
                    </el-table-column>
                    <el-table-column
                            prop="lastLoginTimeDesc"
                            label="最后登陆时间"
                            width="333">
                    </el-table-column>
                    <el-table-column
                            label="操作"
                            width="333">
                        <template scope="scope">
                            <el-button type="primary" icon="el-icon-edit" @click="editUser(scope.row.id)" >修改</el-button>
                        </template>
                    </el-table-column>
                </el-table>
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
                userList: [],
                statusList: statusList,
            }
        },
        methods: {
            userListSearch() {
                axios.post('/user/ajax/list', {
                })
                .then(function (res) {
                    console.log(res);
                    this.userList = res.data.data;
                })
                .catch(function (err) {
                    console.log(err);
                })
            },
            editUser(id) {
                window.open('/user/page/' + id);
            }
        }
    })
</script>
</html>