<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录页</title>
    <link href="/css/common.css" rel="stylesheet">
</head>
<style>
    <#--window.INIT_APP_DATA = {-->
        <#--user :${user!''}-->
    <#--}-->
</style>
<body>
<div id="app">
    <button v-on:click="counter += 1">Add 1</button>
    <p>The button above has been clicked {{ counter }} times.</p>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/vue@2.5.16/dist/vue.js"></script>
<script>
    new Vue({
        el: '#app',
        data: {
            counter: 0
        },
        computed: {},
        methods: {},
        mounted: function () {
        }
    })
</script>
</html>