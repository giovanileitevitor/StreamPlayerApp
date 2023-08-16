@file:Suppress("UnstableApiUsage")
pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven { setUrl("https://oss.sonatype.org/content/repositories/snapshots/") }
        //maven(url = uri("https://oss.sonatype.org/content/repositories/snapshots/"))
    }
}


include(":app")
include(":feature-list-streams")
include(":core-shared")
include(":core-networking")
include(":core-shared-ui")
include(":core-navigation")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")