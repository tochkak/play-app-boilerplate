name := "app-name"
organization := "ru.tochkak"
version := "0.1"

scalaVersion := "2.12.4"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  "ru.tochkak" %% "play-plugins-salat" % "1.7.2",
  specs2 % Test
)

scalacOptions ++= Seq("-deprecation", "-feature")

fork            in run := true
sources         in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false
packageName     in Universal := "services"
