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
    implementation("org.apache.groovy:groovy-sql:3.0.8")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}