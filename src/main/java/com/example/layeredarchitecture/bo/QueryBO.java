package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomerDTO;

public interface QueryBO {
    void customerOrderDetails(CustomerDTO customerDTO);
}
