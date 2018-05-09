# Outdoors
一个struts2+spring+hibernate的Java Web项目

# 浏览
1. http://localhost:8080/pages/home.html访问主页
2. http://localhost:8080/manage/addUser?name=lyx-5&password=testpwd&&mail=773889885@qq.com 在数据库中的user表新增一条记录
3. http://localhost:8080/addresslist/deleteUser?id=10005在数据库中的user表删除id为10005的记录

# 项目结构
--- src
  --- action 控制操作数据库（调用DAOImpl）
    ManagerAction.java
	UserAction.java
  --- bean javabean包
  --- Service  DAO---data access object数据访问对象（实际访问数据库的地方）
    --- impl
	  UserDAOImpl.java 实现接口的类
	  ManagerDAOImpl.java
	UserDAO.java 接口
	ManagerDAO.java
  --- test
--- web
  --- static
    --- images 图片资源
	--- script 脚本
	--- style 样式表
	home.html
	contact.html
	...
  --- WEB---INF
    --- applicationContext.xml spring配置文件
	--- web.xml 项目配置文件

## 任务列表
1. 完善action包中的所有action类的删除操作、更新操作、新增操作，以及所有的异常处理