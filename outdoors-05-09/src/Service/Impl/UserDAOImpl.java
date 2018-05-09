package Service.Impl;

import Service.UserDAO;
import bean.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserDAOImpl implements UserDAO {
    @Qualifier("sessionFactory")
//    @Autowired
    private SessionFactory sessionFactory;


    //开启事务的问题
    @Override
    public void add(UserEntity userEntity) {
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();
        s.save(userEntity);
        tx.commit();
    }

    @Override
    public void delete(int id) {
        Session s = sessionFactory.openSession();
        Transaction tx = s.beginTransaction();

        String hql="delete UserEntity as p where p.id=?";

        Query query= s.createQuery(hql);

        query.setParameter(0,id);

        query.executeUpdate();

        tx.commit();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
