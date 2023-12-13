package com.example.demo.model

import javax.persistence.*

/**
 * Model Class for Company
 */
@Entity
@Table(name = "company")
class Company(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long = 0,
        val name: String = "",
        val address: String = "",
        val city: String = "",
        val country: String = ""
) {
    // Add any additional properties or methods here
}
