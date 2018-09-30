package com.epam.jdbctask.service.impl;

import com.epam.jdbctask.entity.Request;
import com.epam.jdbctask.entity.Tree;
import com.epam.jdbctask.entity.User;
import com.epam.jdbctask.service.DemoService;
import com.epam.jdbctask.service.ForestService;
import com.epam.jdbctask.service.RequestService;
import com.epam.jdbctask.service.UserServise;

public class DemoServiceImpl implements DemoService {

    public static void main(String[] args) {
        DemoServiceImpl demoService = new DemoServiceImpl();




        demoService.startDemo();
    }
    @Override
    public void startDemo() {

        ForestService forestService = new ForestServiceImpl();
        RequestService requestService = new RequestServiceImpl();
        UserServise userServise = new UserServiceImpl();

        System.out.println("Add a new user(\"User1\", \"Family1\", 1, \"login1\", \"password1\" );) and first forester");
        User user = new User("User1", "Family1", 1, "login1", "password1" );
        User user1 = new User("User2", "Family2", 0, "login2", "password2" );
        userServise.add(user);
        userServise.add(user1);
        userServise.displayAll();

        System.out.println("Add a new tree (\"elka\", \"default\", 1)");
        Tree tree = new Tree("elka", "default", 1);
        forestService.add(tree);
        forestService.displayAll();

        System.out.println("Add a new request:  ");
        Request request = new Request("plant", "undone", 1, 2, 2);
        requestService.add(request);
        requestService.displayAll();





    }
}
