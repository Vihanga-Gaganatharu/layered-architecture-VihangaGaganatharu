package com.example.layeredarchitecture.dao.custom;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    boolean save(T dto) throws SQLException, ClassNotFoundException;

    boolean update(T dto) throws SQLException, ClassNotFoundException;

    void delete(String id) throws SQLException, ClassNotFoundException;

    boolean exit(String id) throws SQLException, ClassNotFoundException;

    String generateId()throws SQLException, ClassNotFoundException;

    T search(String newValue)throws SQLException, ClassNotFoundException;
}
