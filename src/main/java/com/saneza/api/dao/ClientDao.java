package com.saneza.api.dao;

import com.saneza.api.model.Client;
import com.saneza.api.model.FormFilters.ClientFilter;
import com.saneza.api.model.FormFilters.ClientForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Nostalgie Patrice
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */
@Mapper
public interface ClientDao {

    //query clients
    public List<Client> getAll(ClientFilter clientFilter);

    //get single client
    public Client getSingleClient(ClientFilter clientFilter);

    //create new client and save info to database
    public int createClient(ClientForm clientForm);

    //update client information
    public int updateClient(ClientForm clientForm);

    //count for pagination
    public int count(ClientFilter clientFilter);
}
