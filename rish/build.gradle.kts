plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "rikka.rish"

    defaultConfig {
        externalNativeBuild {
            ndkBuild {
                arguments += "-j${Runtime.getRuntime().availableProcessors()}"
            }
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    buildFeatures {
        prefab = true
    }

    externalNativeBuild {
        ndkBuild {
            path = file("src/main/cpp/Android.mk")
        }
    }
}

dependencies {
    implementation(project(":api"))
    implementation(libs.androidx.annotation)
    implementation("org.lsposed.libcxx:libcxx:30.0.16248370")
}

extra["publishLibrary"] = false
extra["POM_NAME"] = "RISH"
extra["POM_DESCRIPTION"] = "RISH"
