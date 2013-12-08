name := "Test3"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings

lazy val test3 = project.in(file(".")).dependsOn(test2)

lazy val test2 = RootProject(file("../test2"))