import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.7.0"
ThisBuild / resolvers += "jitpack" at "https://jitpack.io"

val engineVersion = "0.0.5"
val editorVersion = "0.0.2"

lazy val commonDependencies = Seq(
  "com.github.optical002" % "aether-flow" % engineVersion
)


lazy val game = (project in file("game"))
  .settings(
    name := "game",
    libraryDependencies ++= commonDependencies,
    assembly / mainClass := Some("Main"),
    assembly / assemblyMergeStrategy := {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case x => MergeStrategy.first
    },
  )

lazy val editor = (project in file("editor"))
  .settings(
    name := "editor",
    libraryDependencies ++= commonDependencies ++ Seq(
      "com.github.optical002" % "aether-flow-editor" % editorVersion
    ),
  ).dependsOn(game)

