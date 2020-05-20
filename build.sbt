ThisBuild / scalaVersion := "2.13.2"
ThisBuild / organization := "com.github.asakaev"

lazy val leftpad = (project in file("."))
  .settings(name := "left-pad")
