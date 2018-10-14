package com.saneza.api.controller;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.model.Client;
import com.saneza.api.model.FormFilters.ClientFilter;
import com.saneza.api.model.FormFilters.ClientForm;
import com.saneza.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nostalgie Patrice
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */


@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    //create new client(registration, create by salon)
    @PostMapping("/create.do")
    public String createClient(ClientForm clientForm){
        //TODO validate the form before calling for operation

        return clientService.createNewClient(clientForm);
    }

    //query the list of clients(it supports pagination by default)
    @PostMapping("/getList.do")
    public String getClientList(ClientFilter clientFilter){
        Map<String,Object> resultMap= new HashMap<>();
        List<Client> clients=clientService.getClientsList(clientFilter);
        resultMap.put("data",clients);
        resultMap.put("totalCount",clientService.countAll(clientFilter));
        resultMap.put("page",clientFilter.getPage());

        return ReturnUtil.resultSuccess(resultMap);
    }
    //query client information
    @PostMapping("/getInfo.do")
    public String getClientInfo(ClientFilter clientFilter){
        Map<String,Object> resultMap= new HashMap<>();
        Client client=clientService.getSingleClient(clientFilter);
        resultMap.put("data",client);
        return ReturnUtil.resultSuccess(resultMap);
    }
}
