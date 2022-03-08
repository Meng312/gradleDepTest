plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.bundles.testDependencies)
    implementation(libs.groovy.core)
    implementation(libs.groovy.json)
    implementation(libs.groovy.nio)
    implementation("org.apache.groovy:groovy-sql:4.0.1")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}