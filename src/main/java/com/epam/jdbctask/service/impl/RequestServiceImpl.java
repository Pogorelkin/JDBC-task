package com.epam.jdbctask.service.impl;

import com.epam.jdbctask.entity.Request;
import com.epam.jdbctask.repository.impl.RequestDAOImpl;
import com.epam.jdbctask.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private RequestDAOImpl requestDAO;

    @Override
    public List<Request> displayAll() {
        return this.requestDAO.findAll();
    }

    @Override
    public void add(Request obj) {
        requestDAO.add(obj);

    }

    @Override
    public void deleteById(Long idObj) {
        requestDAO.deleteById(idObj);

    }

    @Override
    public void update(Long idObj, Request obj) {
        requestDAO.update(idObj,obj);

    }

    @Override
    public Request findById(Long idObj) {
        return this.requestDAO.findById(idObj);
    }
}


