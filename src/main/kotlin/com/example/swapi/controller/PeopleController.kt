package com.example.swapi.controller

import com.example.swapi.model.PagebleModel
import com.example.swapi.model.People
import com.example.swapi.service.PeopleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/people")
class PeopleController(private val service: PeopleService) {

    @GetMapping
    fun createAll(): PagebleModel {
        return service.createAll()
    }

    @GetMapping("/{id}")
    fun createById(@PathVariable id: Long): People {
        return service.createById(id)
    }
}