package com.example.demo.controller

import com.example.demo.model.Company
import com.example.demo.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController(@Autowired private val companyService: CompanyService) {

    @GetMapping("/companies")
    fun getAllCompanies(): List<Company> {
        return companyService.getAllCompanies()
    }
}