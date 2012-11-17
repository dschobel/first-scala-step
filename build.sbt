name := "first-scala-step"

organization := "io.das"

version := "1.3"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.8" % "test",
    "org.mockito" % "mockito-all" % "1.9.0" % "test",
    "junit" % "junit" % "4.8.2" % "test"
)

EclipseKeys.withSource := true
