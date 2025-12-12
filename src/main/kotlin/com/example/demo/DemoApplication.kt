package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.shell.core.command.annotation.Command

@SpringBootApplication
class DemoApplication {

    @Command(name = ["hello"], description = "say hello")
    fun hello() {
        println("hello, world")
    }

}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
