package action;

import Service.Impl.UserDAOImpl;
import bean.UserEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserAction extends ActionSupport {
    private int id;
    private String name;
    private String mail;
    private String tel;
    private String password;

    private UserDAOImpl user;

    public UserDAOImpl getUser() {
        return user;
    }

    public void setUser(UserDAOImpl user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String add()
    {
        UserEntity me = new UserEntity();
        me.setName(getName());
        me.setMail(getMail());
        me.setTel(getTel());
        me.setPassword(getPassword());
        user.add(me);
        return SUCCESS;
    }

    public String delete()
    {
        user.delete(getId());
        return SUCCESS;
    }
}
