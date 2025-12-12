plugins {
    kotlin("jvm") version "2.2.21"
    kotlin("plugin.spring") version "2.2.21"
    id("org.springframework.boot") version "4.0.0"
    id("io.spring.dependency-management") version "1.1.7"
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("org.springframework.shell:spring-shell-starter-jansi:4.0.0-M2")
//    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.withType<org.springframework.boot.gradle.tasks.run.BootRun> {
    standardInput = System.`in`
}

