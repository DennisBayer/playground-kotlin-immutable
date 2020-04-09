plugins {
    application
    kotlin("jvm") version "1.3.71"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3")

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}

application {
    mainClassName = "MainKt"
}

tasks.test {
    testLogging {
        events("passed", "skipped", "failed")
    }
}
