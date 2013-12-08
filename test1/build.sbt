name := "hello"

version := "1.0"

lazy val test1 = project.in(file(".")).dependsOn(test2)

lazy val test2 = RootProject(file("../test2"))