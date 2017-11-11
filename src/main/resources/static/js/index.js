/**
 * Created by keji on 2017/11/11.
 */
var vm = new Vue({
    el: '#app',
    data: {
        options: {},
        selected:''
    },
    methods: {
        getOptionValue: function () {
            $.getJSON("/getOptions", function (r) {
                vm.options = r;
                console.log(vm.options);
            })
        }
    },
    created: function () {
        console.log("vue创建了");
        this.getOptionValue();
    }

})