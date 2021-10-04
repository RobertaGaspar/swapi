package com.example.swapi.service

import com.example.swapi.clients.PeopleClient
import com.example.swapi.model.PagebleModel
import com.example.swapi.model.People
import org.springframework.stereotype.Service
import java.net.IDN

@Service
class PeopleService (private var client: PeopleClient){

    fun createAll(): PagebleModel {
        return client.createAll()
    }

    fun createById(id: Long): People {
        return client.createById(id)
    }

}