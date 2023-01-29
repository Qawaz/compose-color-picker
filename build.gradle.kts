// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        val agpVersion = property("agp.version")
        val kotlinVersion = property("kotlin.version")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.android.tools.build:gradle:$agpVersion")
    }
}

group = "com.qawaz"
version = "0.5.1"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

plugins {
    id("com.diffplug.spotless") version "6.10.0"
}

apply("${project.rootDir}/gradle/spotless.gradle")