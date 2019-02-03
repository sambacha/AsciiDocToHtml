name := "AsciiDocToHtmlGui"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    "org.asciidoctor" % "asciidoctorj" % "1.6.1",
    "org.jsoup" % "jsoup" % "1.11.3"
)

