package com.example.swapi.service

import com.example.swapi.clients.PlanetsClient
import com.example.swapi.model.PagebleModel
import com.example.swapi.model.Planets
import org.springframework.stereotype.Service

@Service
class PlanetsService (private var client: PlanetsClient){

    fun createAll(): PagebleModel {
        return client.createAll()
    }

    fun createById(id: Long): Planets {
        return client.createById(id)
    }

}