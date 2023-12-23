package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.bo.QueryBO;
import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.model.CustomerDTO;

public class QueryBOImpl implements QueryBO {
    QueryDAO queryDAO = new QueryDAOImpl();
    @Override
    public void customerOrderDetails(CustomerDTO customerDTO) {
        queryDAO.customerOrderDetails(customerDTO);
    }
}
