plugins {
    kotlin("jvm") version "2.2.21"
    kotlin("plugin.spring") version "2.2.21"
    id("org.springframework.boot") version "4.0.1"
    id("io.spring.dependency-management") version "1.1.7"
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("org.springframework.shell:spring-shell-starter-jansi:4.0.0-RC1")

    /*
    ***************************
    APPLICATION FAILED TO START
    ***************************

    Description:

    The Bean Validation API is on the classpath but no implementation could be found

    Action:

    Add an implementation, such as Hibernate Validator, to the classpath
     */
    runtimeOnly("org.hibernate.validator:hibernate-validator")

    /*
    java.lang.NoClassDefFoundError: jakarta/el/ELManager
    at org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator.buildExpressionFactory(ResourceBundleMessageInterpolator.java:189) ~[hibernate-validator-9.0.1.Final.jar:9.0.1.Final]
     */
    runtimeOnly("org.glassfish:jakarta.el:4.0.2")

    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

tasks.withType<org.springframework.boot.gradle.tasks.run.BootRun> {
    standardInput = System.`in`
}

