package com.example.demo.dao

import com.example.demo.model.Company
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyDao : JpaRepository<Company, Long> {
}
