package com.example.swapi.clients

import com.example.swapi.model.PagebleModel
import com.example.swapi.model.People
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "people", url = "https://swapi.dev/api/people")
interface PeopleClient {

    @GetMapping
    fun createAll(): PagebleModel

    @GetMapping("/{id}")
    fun createById(@PathVariable id: Long): People
}