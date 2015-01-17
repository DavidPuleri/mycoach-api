organization := "com.mycoach"

version := "0.1"

scalaVersion := "2.11.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.6"
  val sprayV = "1.3.2"
  Seq(
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "io.spray" %% "spray-testkit" % sprayV % "test",
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.slick" %% "slick" % "2.1.0",
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "org.specs2" %% "specs2-core" % "2.3.11" % "test",
    "com.typesafe.akka" %% "akka-slf4j" % akkaV,
    "ch.qos.logback" % "logback-classic" % "1.1.2",
    "io.spray" %% "spray-json" % "1.3.1",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
  )
}

assemblyJarName in assembly := "mycoach-api.jar"

Revolver.settings
