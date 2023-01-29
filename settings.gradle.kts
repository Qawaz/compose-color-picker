pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        kotlin("multiplatform").version(kotlinVersion).apply(false)
        kotlin("android").version(kotlinVersion).apply(false)
        id("org.jetbrains.dokka").version(kotlinVersion).apply(false)
        id("com.android.application").version(extra["agp.version"] as String).apply(false)
        id("com.android.library").version(extra["agp.version"] as String).apply(false)
        id("org.jetbrains.compose").version(extra["compose.jb.version"] as String).apply(false)
    }
}
rootProject.name = "ComposeColorPicker"
include (":app")
include (":desktop")
include (":jsApp")
include (":color-picker")
