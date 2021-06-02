plugins {
     java
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
dependencies {
    compile("org.scala-lang:scala-library:2.12.6")
    compile("com.typesafe.akka:akka-stream_2.12:2.5.14")
    compile("com.typesafe.akka:akka-stream-typed_2.12:2.5.14")
    compile("org.postgresql:postgresql:42.2.8")
    compile("org.mongodb:mongo-java-driver:3.11.1")
    compile("com.bmuschko:gradle-docker-plugin:6.1.3")
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")
    compile("com.zaxxer:HikariCP:3.4.1")
    compile("ch.qos.logback:logback-classic:1.2.3")
    compile("net.logstash.logback:logstash-logback-encoder:5.2")
    compile ("cd.go.plugin:go-plugin-api:14.4.0")
    compile("com.google.code.gson:gson:2.3.1")
    compile("org.cloudfoundry:cloudfoundry-client-lib:1.1.3")
}
repositories {
    mavenCentral()
    jcenter()
}