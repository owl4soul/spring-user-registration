package com.github.owl4soul.repository;

import com.github.owl4soul.model.User;
import com.github.owl4soul.utils.HibernateSessionFactoryUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;
import java.util.List;

//Data access object
public class UserDAO {

    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void merge(User user, User changed) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();

        String userName = changed.getUserName();
        String firstName = changed.getFirstName();
        String lastName = changed.getLastName();
        long phone = changed.getPhone();
        String email = changed.getEmail();

        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhone(phone);
        user.setEmail(email);
        user.setDateTime(LocalDateTime.now());
        session.merge(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

    public User findUserById(int id) {
        User user = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .get(User.class, id);
        return user;
    }

    public List<User> findAllUsers() {
        List<User> listUsers = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from User", User.class)
                .list();
        return listUsers;
    }

    public List<User> findByUsername(String likeName) {
        List<User> listNews = HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("from User u where u.userName like concat('%', :name, '%') ", User.class)
                .setParameter("name", likeName)
                .list();
        return listNews;
    }
}
