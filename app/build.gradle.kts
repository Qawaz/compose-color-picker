
plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group = "com.godaddy"
version = "1.0"


dependencies {
    implementation(project(":color-picker"))
    implementation ("androidx.activity:activity-compose:1.7.2")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.navigation:navigation-runtime-ktx:2.7.1")
    implementation("androidx.navigation:navigation-compose:2.7.1")
    implementation(compose.material)
}

android {
    namespace = "com.godaddy.android.colorpicker"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.godaddy.android.colorpicker"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    packaging {
        resources.excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}