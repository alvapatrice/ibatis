package com.saneza.api.service;

import com.saneza.api.model.Client;
import com.saneza.api.model.FormFilters.ClientFilter;
import com.saneza.api.model.FormFilters.ClientForm;

import java.util.List;

/**
 * Created by Nostalgie Patrice
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */

public interface ClientService {

    //get the list of all client(support pagination)
    public List<Client> getClientsList(ClientFilter clientFilter);

    //get single client(by id, phone, username, password, email)
    public Client getSingleClient(ClientFilter clientFilter);

    //create a new client
    public String createNewClient(ClientForm clientForm);

    //update client information
    public String updateClient(ClientForm clientForm);

    //login into client's account
    public Client login(String username, String pwd);

    public int countAll(ClientFilter clientFilter);
}
