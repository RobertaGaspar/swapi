package com.example.swapi.controller

import com.example.swapi.model.PagebleModel
import com.example.swapi.model.Planets
import com.example.swapi.service.PlanetsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/planets")
class PlanetsController(private val service: PlanetsService) {

    @GetMapping
    fun createAll(): PagebleModel {
        return service.createAll()
    }

    @GetMapping("/{id}")
    fun createById(@PathVariable id: Long): Planets {
        return service.createById(id)
    }
}
