package com.saneza.api.dao;

import com.saneza.api.model.Appoitement;
import com.saneza.api.model.FormFilters.AppoitementFilter;
import com.saneza.api.model.FormFilters.AppoitementForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* Created by gatete rugamba
* on 10/19/2018
*/
@Mapper
public interface AppoitementDao
{
    //for many geting appoitements
    public List<Appoitement> getAppoitements(AppoitementFilter appoitementFilter);
    //for get appoitement
    public Appoitement getAppoitement(AppoitementFilter appoitementFilter);
    //for counting all
    public int countAll(AppoitementFilter appoitementFilter);
    //for inserting appoitement
    public int insertAppoitement(AppoitementForm appoitementForm);
//for updating the service wanted
    public int updateService(AppoitementForm appoitementForm);
//for set it to delete mode
    public int updateStatus(AppoitementForm appoitementForm);
}
