package action;

import Service.Impl.ManagerDAOImpl;
import bean.ManagerEntity;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class ManagerAction extends ActionSupport {
    private String name;
    private String password;
    @Autowired

    private ManagerDAOImpl manager;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ManagerDAOImpl getManager() {
        return manager;
    }

    public void setManager(ManagerDAOImpl manager) {
        this.manager = manager;
    }

    public String add()
    {
        ManagerEntity me = new ManagerEntity();
        me.setName(getName());
        me.setPassword(getPassword());
        manager.add(me);
        return SUCCESS;
    }
}
