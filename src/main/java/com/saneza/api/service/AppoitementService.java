package com.saneza.api.service;

import com.saneza.api.model.Appoitement;
import com.saneza.api.model.FormFilters.AppoitementFilter;
import com.saneza.api.model.FormFilters.AppoitementForm;

import java.util.List;
/**
 *created by gatete rugamba
 * on 10/19/2018
 */
public interface AppoitementService
{
    //for geting many appoitements
    public List<Appoitement> getAppoitements(AppoitementFilter appoitementFilter);
    //for get one appoitement
    public Appoitement getAppoitement(AppoitementFilter appoitementFilter);
    //for counting all in the list
    public int countAll(AppoitementFilter appoitementFilter);
    //for inserting new appoitement
    public void insertAppoitement(AppoitementForm appoitementForm);
}
