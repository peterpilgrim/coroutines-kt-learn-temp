// apply(plugin = "java-library")

plugins {
    kotlin("jvm") version "1.7.20"
}

group = "uk.co.xenonique.learn"
version = "1.0.0"


object Versions {
    val arrow_kt_core_version="1.1.2"
    val guava_version = "30.1-jre"
    val kotlin_version = "1.6.10"
    val kotlinx_version = "1.6.4"
//    val kotlin_version = "1.7.10"
//    val kotlin_version = "1.5.32"
    val junit_version="5.7.2"
    val kluent_version = "1.68"
    val scala_test_version="3.2.9"
    val scala_version = "2.13"
    val scala_xml_version="2.0.1"
    val scalatestplus_junit_version="1.0.0-M2"
    val scalatestplus_junit_jdk_version="2.13"
}

object Deps {
    val arrow_kt_stack = "io.arrow-kt:arrow-stack:${Versions.arrow_kt_core_version}"
    val arrow_kt_core = "io.arrow-kt:arrow-core:${Versions.arrow_kt_core_version}"

    val guava = "com.google.guava:guava:${Versions.guava_version}"

    // Use Scalatest for testing our library
    val junit_jupiter_api = "org.junit.jupiter:junit-jupiter-api:${Versions.junit_version}"
    val junit_jupiter_engine="org.junit.jupiter:junit-jupiter-engine:${Versions.junit_version}"
    val junit_jupiter_vintage="org.junit.vintage:junit-vintage-engine:${Versions.junit_version}"

    val kotlin_bom = "org.jetbrains.kotlin:kotlin-bom"
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib"
    val kotlin_stdlib_jdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin_version}"
    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin_version}"

    val kluent = "org.amshove.kluent:kluent:${Versions.kluent_version}"

    val kotlin_test = "org.jetbrains.kotlin:kotlin-test"
    val kotlin_test_junit = "org.jetbrains.kotlin:kotlin-test-junit"

    val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinx_version}"

    val scala_library = "org.scala-lang:scala-library:${Versions.scala_version}.6"

    val scala_test = "org.scalatest:scalatest_${Versions.scala_version}:${Versions.scala_test_version}"

    // Need scala-xml at test runtime
    // https://mvnrepository.com/artifact/org.scala-lang.modules/scala-xml
    val scala_xml = "org.scala-lang.modules:scala-xml_${Versions.scala_version}:${Versions.scala_xml_version}"

    val scalatestplus_junit = "org.scalatestplus:scalatestplus-junit_${Versions.scalatestplus_junit_jdk_version}:${Versions.scalatestplus_junit_version}"

}


allprojects {
    repositories {
        mavenCentral()
	    gradlePluginPortal()
    }
}


dependencies {
    implementation(platform(Deps.kotlin_bom))
    implementation(Deps.kotlin_stdlib)

    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
    implementation(Deps.kotlinx_coroutines_core)

    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-reflect
    implementation(Deps.kotlin_reflect)

    // Commented out
//    implementation(platform( Deps.arrow_kt_stack))

    // Commented out
//    implementation(Deps.arrow_kt_core)

    testImplementation(Deps.junit_jupiter_api)
    testImplementation(Deps.junit_jupiter_engine)
    testImplementation(Deps.kluent)
}


tasks.withType<Test> {
    useJUnitPlatform()
    this.testLogging {
        this.showStandardStreams = true
        this.events("PASSED", "SKIPPED", "FAILED")
    }
}

