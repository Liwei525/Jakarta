<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <!-- import CSS -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <script>
        window.INIT_APP_DATA = {
            userList : ${userList![]},
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
            <el-header style="text-align: right; font-size: 12px">
                <span>王小虎</span>
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
                            prop="lastLoginTime"
                            label="最后登陆时间"
                            width="333">
                    </el-table-column>
                    <el-table-column
                            label="操作"
                            width="333">
                        <template scope="scope">
                            <el-button type="primary" icon="el-icon-edit" @click="editUser(scope.row)" >修改</el-button>
                        </template>
                    </el-table-column>
                </el-table>
            </el-main>
        </el-container>
    </el-container>
</div>
</body>
<style>
    .el-header {
        background-color: #B3C0D1;
        color: #333;
        line-height: 60px;
    }

    .el-aside {
        color: #333;
    }
</style>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
    new Vue({
        el: '#app',
        data: function() {
            const userList = window.INIT_APP_DATA.userList;
            const statusList = window.INIT_APP_DATA.statusList;
            return {
                visible: false,
                userList: userList,
                statusList: statusList,
            }
        },
        methods: {
            editUser(row) {
                const id = row.id;
                window.open('/user/' + id);
            }
        }
    })
</script>
</html>