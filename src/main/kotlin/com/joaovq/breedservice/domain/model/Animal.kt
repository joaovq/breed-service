package com.joaovq.breedservice.domain.model

import org.springframework.data.annotation.Id

data class Animal(
    @Id
    val id: Long,
    val name: String
)
