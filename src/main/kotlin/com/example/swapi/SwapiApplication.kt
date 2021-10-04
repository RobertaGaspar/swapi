package com.example.swapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class SwapiApplication

fun main(args: Array<String>) {
	runApplication<SwapiApplication>(*args)
}
