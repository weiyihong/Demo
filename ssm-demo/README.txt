1.这是一个使用ssm(springMVC、spring、mybatis)搭建一个demo
2.拉取代码后在mysql数据库执行(Demo\ssm-demo\sql)中的sql脚本
  修改 Demo\ssm-demo\demo-parent\demo-web\src\main\resources 文件夹中的 jdbc.properties 文件，连接到数据库
3.使用 eclipse 导入 maven 项目(one\ssm-demo\demo-parent)即可直接编译运行
4.运行后在浏览器输入 
  http://localhost/test/list;
  若显示:[{"SEX":"0","USER_ID":1,"USER_NAME":"test1"},{"SEX":"1","USER_ID":2,"USER_NAME":"test2"}]
  即表示项目搭建成功。