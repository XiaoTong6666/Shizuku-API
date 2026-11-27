pluginManagement {
    repositories {
        google {
            content {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenLocal()
        mavenCentral()
    }
}

plugins {
    id("com.android.settings") version "9.5.3"
}

android {
    compileSdk {
        version = release(37) {
            minorApiLevel = 2
        }
    }
    minSdk = 23
    targetSdk {
        version = release(37)
    }
    ndkVersion = "30.0.16248370"
    buildToolsVersion = "37.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google {
            content {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenLocal()
        mavenCentral()
    }
}

include(":aidl", ":shared", ":api", ":provider", ":rish", ":demo", ":demo-hidden-api-stub", ":server-shared")
