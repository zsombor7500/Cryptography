import Dependencies._

ThisBuild / scalaVersion     := "2.13.15"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
    .settings(
        name := "Cryptography",
        libraryDependencies += munit % Test
    )

val AkkaVersion = "2.10.0"
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
libraryDependencies ++= Seq(
    "ch.qos.logback" % "logback-classic" % "1.5.8",
    "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
    "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
    "org.scalatest" %% "scalatest" % "3.2.15" % Test
)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
