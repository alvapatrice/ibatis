package com.saneza.api.service.impl;

import com.saneza.api.common.utils.ReturnUtil;
import com.saneza.api.dao.AppoitementDao;
import com.saneza.api.model.Appoitement;
import com.saneza.api.model.FormFilters.AppoitementFilter;
import com.saneza.api.model.FormFilters.AppoitementForm;
import com.saneza.api.service.AppoitementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *created by gatete rugamba
 * on 10/19/2018
 * */
@Service
public class AppoitementServiceImpl implements AppoitementService
{

    @Autowired
    private AppoitementDao appoitementDao;

    @Override
    public List<Appoitement> getAppoitements(AppoitementFilter appoitementFilter) {
        appoitementFilter.setPaginationDates();
        appoitementFilter.setPaginationOffset();
        return appoitementDao.getAppoitements(appoitementFilter);
    }

    @Override
    public Appoitement getAppoitement(AppoitementFilter appoitementFilter) {
        return appoitementDao.getAppoitement(appoitementFilter);
    }

    @Override
    public int countAll(AppoitementFilter appoitementFilter) {
        return appoitementDao.countAll(appoitementFilter);
    }

    @Override
    public String insertAppoitement(AppoitementForm appoitementForm) {

        int result=0;
       result=appoitementDao.insertAppoitement(appoitementForm);


        if(result>0){
            return ReturnUtil.resultSuccess();
        }
        else {
            return ReturnUtil.resultSuccess("fail to save it");
        }
    }

    @Override
    public String updateService(AppoitementForm appoitementForm) {
        int result=0;
        result=appoitementDao.updateService(appoitementForm);

        if(result>0){
            return ReturnUtil.resultSuccess();
        }
        else {
            return ReturnUtil.resultSuccess("fail to save it");
        }
    }

    @Override
    public String updateStatus(AppoitementForm appoitementForm) {
        int result=0;
        result=appoitementDao.updateStatus(appoitementForm);
        if(result>0){
            return ReturnUtil.resultSuccess();
        }
        else {
            return ReturnUtil.resultSuccess("fail to save it");
        }
    }
}
