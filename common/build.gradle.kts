plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

group = "com.github.picture2pc.common"
version = "${rootProject.version}.0"

dependencies {
    implementation(compose.ui)
    implementation(compose.foundation)
    implementation(compose.material3)
    implementation(compose.runtime)
}
