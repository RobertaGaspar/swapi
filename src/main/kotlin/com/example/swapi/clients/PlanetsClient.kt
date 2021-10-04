package com.example.swapi.clients

import com.example.swapi.model.PagebleModel
import com.example.swapi.model.Planets
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "planets", url = "https://swapi.dev/api/planets")
interface PlanetsClient {

    @GetMapping
    fun createAll(): PagebleModel

    @GetMapping("/{id}")
    fun createById(@PathVariable id: Long): Planets

}