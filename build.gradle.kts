import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.31"
}

group = "il.ac.technion.cs.softwaredesign"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    compile("com.google.inject", "guice", "4.2.2")
    compile("com.authzee.kotlinguice4", "kotlin-guice", "1.3.0")
}

tasks.withType<KotlinCompile> { kotlinOptions.jvmTarget = "1.8" }