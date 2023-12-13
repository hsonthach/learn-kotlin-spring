package com.example.demo.service

import com.example.demo.model.Company
import com.example.demo.dao.CompanyDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService @Autowired constructor(private val companyDao: CompanyDao) {

    fun getAllCompanies(): List<Company> {
    
        return companyDao.findAll()
        
    }
}
