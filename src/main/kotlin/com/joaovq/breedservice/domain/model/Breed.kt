package com.joaovq.breedservice.domain.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDate

data class Breed(
    @Id
    val id: Long,
    val name: String,
    val animal: Animal,
    @CreatedDate val createdAt: LocalDate,
    @LastModifiedDate val lastModified: LocalDate
)
