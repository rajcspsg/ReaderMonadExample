name := "ReaderMonadExample"

version := "1.0"

scalaVersion := "2.12.1"


lazy val simpleReaderMonadSettings = Seq(name := "simpleReaderMonad", scalaVersion := "2.12.1", version := "1.0")
lazy val userRepositorySettings = Seq(name := "userRepository", scalaVersion := "2.12.1", version := "1.0")
lazy val monadTransformersSettings = Seq(name := "monadTransformers", scalaVersion := "2.12.1", version := "1.0")

lazy val simpleReaderMonad = (project in file("simpleReaderMonad")).settings(simpleReaderMonadSettings)

lazy val UserRepository = (project in file("userRepository")).settings(userRepositorySettings)

lazy val monadTransformers = (project in file("monadTransformers")).settings(monadTransformersSettings)

libraryDependencies ++= Seq("org.scalaz" %% "scalaz-core" % "7.2.13")

        