package com.epam.jdbctask.service.impl;

import com.epam.jdbctask.repository.impl.UserDAOImpl;
import com.epam.jdbctask.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.epam.jdbctask.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServise {
    @Autowired
    private UserDAOImpl userDAO;

    @Override
    public List<User> displayAll() {
        return this.userDAO.findAll();
    }

    @Override
    public void add(User obj) {
        userDAO.add(obj);

    }

    @Override
    public void deleteById(Long idObj) {
        userDAO.deleteById(idObj);

    }

    @Override
    public void update(Long idObj, User obj) {
        userDAO.update(idObj, obj);

    }

    @Override
    public User findById(Long idObj) {
        return this.userDAO.findById(idObj);
    }
}
