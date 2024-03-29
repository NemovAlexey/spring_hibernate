package hiber.dao;

import hiber.model.User;
import jakarta.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private final SessionFactory sessionFactory;

    public UserDaoImp(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> listUsers() {
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User", User.class);
        return query.getResultList();
    }

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().persist(user);
    }

    @Override
    public User getUserByCar(String model, int series) {
        String hql = "from User u where u.car.model = :model and u.car.series = :series";
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(hql, User.class);
        query.setParameter("model", model).setParameter("series", series);
        return query.getSingleResult();
    }
}
