package com.gaurav.customerservices.dao;

import com.gaurav.customerservices.entity.Customer;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    private EntityManager entityManager;

    public CustomerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Customer> findAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Customer> resultList = session.createNamedQuery("customer.find_all", Customer.class).getResultList();
        if (resultList.isEmpty()) {
            session.save(new Customer("Zack", "Anderson"));
            session.save(new Customer("Cody", "Anderson"));
            session.save(new Customer("Zoella", "Sugg"));
        }

        return session.createNamedQuery("customer.find_all", Customer.class).getResultList();

    }
}
