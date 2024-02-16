pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven ("https://www.jitpack.io")
    }
}

rootProject.name = "Notes App"
include(":app")
