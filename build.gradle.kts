plugins {
    id 'java'
    id 'org.springframework.boot' version '3.3.4'
    id 'io.spring.dependency-management' version '1.1.6'
}

group = 'com.example'
version = '1.0.0'
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {

    // Spring Boot Core
    implementation 'org.springframework.boot:spring-boot-starter'

    // For Webhooks or REST Calls (if needed)
    implementation 'org.springframework.boot:spring-boot-starter-web'

    // Telegram Bot API
    implementation 'com.github.pengrad:java-telegram-bot-api:9.2.1'

    // Optional: JSON parser for handling webhook data
    implementation 'com.google.code.gson:gson:2.11.0'

    // Testing
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.named('test') {
    useJUnitPlatform()
}
