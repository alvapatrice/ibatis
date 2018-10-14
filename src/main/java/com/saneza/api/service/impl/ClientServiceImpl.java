package com.saneza.api.service.impl;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.dao.ClientDao;
import com.saneza.api.model.Client;
import com.saneza.api.model.FormFilters.ClientFilter;
import com.saneza.api.model.FormFilters.ClientForm;
import com.saneza.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Nostalgie Patrice
 * on 10/14/2018
 * Make it work, make it right, make it fast.
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDao clientDao;

    @Override
    public List<Client> getClientsList(ClientFilter clientFilter) {
        clientFilter.setPaginationDates();
        clientFilter.setPaginationOffset();

        return clientDao.getAll(clientFilter);
    }

    @Override
    public Client getSingleClient(ClientFilter clientFilter) {

        return clientDao.getSingleClient(clientFilter);
    }

    @Override
    public String createNewClient(ClientForm clientForm) {
        //track insert results
        int result=0;

        //TODO check for duplicates and form validation

        //set birthday from string to date
        clientForm.birthdayStrToBirthdayDate();

        //set create time to current time
        clientForm.setCreateTime(new Date());

        //set update time to current time
        clientForm.setUpdateTime(new Date());

        //set initial credits
        clientForm.setCredit(5);

        //TODO add hash to the password

        result=clientDao.createClient(clientForm);

        if(result>0){
            return ReturnUtil.resultSuccess();
        }else {
            return ReturnUtil.resultFail("Database insertion failure");
        }
    }

    @Override
    public String updateClient(ClientForm clientForm) {
        return null;
    }

    @Override
    public Client login(String username, String pwd) {
        return null;
    }

    @Override
    public int countAll(ClientFilter clientFilter) {
        return clientDao.count(clientFilter);
    }
}
