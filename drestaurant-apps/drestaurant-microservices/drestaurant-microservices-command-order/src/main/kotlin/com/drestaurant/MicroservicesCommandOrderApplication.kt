package com.drestaurant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class MicroservicesCommandOrderApplication

fun main(args: Array<String>) {
    runApplication<MicroservicesCommandOrderApplication>(*args)
}

