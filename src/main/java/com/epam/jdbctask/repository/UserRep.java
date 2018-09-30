package com.epam.jdbctask.repository;
import com.epam.jdbctask.entity.User;

public interface UserRep extends BasicDAO<User> {

    User findByLogin(String login);


}
