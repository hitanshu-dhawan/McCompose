package com.hitanshudhawan.mccompose.buildsrc

object Libs {

    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha02"

    object Accompanist {
        private const val version = "0.4.1"
        const val coil = "dev.chrisbanes.accompanist:accompanist-coil:$version"
    }

    object Kotlin {
        private const val version = "1.4.21"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object AndroidX {

        const val material = "com.google.android.material:material:1.2.0"

        const val navigation = "androidx.navigation:navigation-compose:1.0.0-alpha04"

        object Compose {
            private const val version = "1.0.0-alpha09"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val animation = "androidx.compose.animation:animation:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
        }
    }
}