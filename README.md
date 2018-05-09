# Outdoors
一个struts2+spring+hibernate的Java Web项目

# 浏览
1. http://localhost:8080/pages/home.html访问主页
2. http://localhost:8080/manage/addUser?name=lyx-5&password=testpwd&&mail=773889885@qq.com 在数据库中的user表新增一条记录
3. http://localhost:8080/addresslist/deleteUser?id=10005在数据库中的user表删除id为10005的记录

# 项目结构
--- src<br>
  --- action 控制操作数据库（调用DAOImpl）<br>
    ManagerAction.java<br>
	UserAction.java<br>
  --- bean javabean包<br>
  --- Service  DAO---data access object数据访问对象（实际访问数据库的地方）<br>
    --- impl<br>
	  UserDAOImpl.java 实现接口的类<br>
	  ManagerDAOImpl.java<br>
	UserDAO.java 接口<br>
	ManagerDAO.java<br>
  --- test<br>
--- web<br>
  --- static<br>
    --- images 图片资源<br>
	--- script 脚本<br>
	--- style 样式表<br>
	home.html<br>
	contact.html<br>
	...<br>
  --- WEB---INF<br>
    --- applicationContext.xml spring配置文件<br>
	--- web.xml 项目配置文件<br>

## 任务列表
1. 完善action包中的所有action类的删除操作、更新操作、新增操作，以及所有的异常处理<br>