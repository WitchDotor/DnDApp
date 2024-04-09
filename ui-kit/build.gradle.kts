plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.example.ui_kit"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(project(":core"))

    // Android native
    api(libs.androidx.appcompat)
    implementation(libs.androidx.material3)

    // Compose
    implementation(libs.androidx.ui.graphics.android)
    implementation(libs.androidx.material3.android)
    api("androidx.compose.material3:material3")
    api(libs.androidx.compose.bom)
    api("androidx.compose.ui:ui")
    api("androidx.compose.ui:ui-tooling")
    api("androidx.compose.ui:ui-graphics")
    api("androidx.compose.material3:material3")
    implementation (libs.material3)
}