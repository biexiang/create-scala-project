import sbt.util

name := "bx"

version := "0.1"

scalaVersion := "2.11.8"

showSuccess := false
logLevel := Level.Warn
logLevel in compile := util.Level.Error

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.2"

//load maven repo by just like above