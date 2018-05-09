package Service.Impl;

import Service.ManagerDAO;
import bean.ManagerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ManagerDAOImpl implements ManagerDAO {
    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(ManagerEntity managerEntity) {
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(managerEntity);
        tx.commit();
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
