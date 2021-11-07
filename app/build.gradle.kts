//plugins {
//    id 'com.android.application'
//    id 'kotlin-android'
//}
//
//android {
//    compileSdk 31
//
//    defaultConfig {
//        applicationId "com.godaddy.android.colorpicker"
//        minSdk 21
//        targetSdk 31
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary true
//        }
//    }
//
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//        targetCompatibility JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = '1.8'
//        useIR = true
//    }
//    buildFeatures {
//        compose true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion compose_version
//        kotlinCompilerVersion kotlin_version
//    }
//    packagingOptions {
//        resources {
//            excludes += '/META-INF/{AL2.0,LGPL2.1}'
//        }
//    }
//}
//
//dependencies {
//
//    implementation project(":color-picker")
//    implementation 'androidx.core:core-ktx:1.6.0'
//    implementation 'androidx.appcompat:appcompat:1.3.1'
//    implementation 'com.google.android.material:material:1.4.0'
//    implementation "androidx.compose.ui:ui:$compose_version"
//    implementation "androidx.compose.material:material:$compose_version"
//    implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"
//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.1'
//    implementation 'androidx.activity:activity-compose:1.3.1'
//    testImplementation 'junit:junit:4.+'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//}


plugins {
    id("org.jetbrains.compose") version "1.0.0-beta5"
    id("com.android.application")
    kotlin("android")
}

group = "me.godaddy"
version = "1.0"


dependencies {
    implementation(project(":color-picker"))
    implementation ("androidx.activity:activity-compose:1.3.1")
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.godaddy.android.colorpicker"
        minSdkVersion(21)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}