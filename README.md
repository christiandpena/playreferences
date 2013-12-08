playreferences
==============

Sample Play framework application with references to an external (not sub-module) project.

After much searching, I was unable to find a clear answer on how to reference an external project in a Play framework application. In .NET/C#/Visual Studio, it is simply a matter of adding a reference to a DLL or project. ScalaIDE also behaves the same way, but the dependencies are not resolved at runtime within the Play application due to the use of the SBT build tool. The SBT tool is the tool actually building the Scala application. It generates the ScalaIDE project files (similar to the .NET SLN file) based upon the dependencies configured within the SBT configuration files, so SBT must be first configured correctly, not ScalaIDE. 

The code provides a brief sample of a library shared between a console application and a Play framework application. All dependencies are defined in the build.sbt files in the respective projects. 

Project test2 is a shared library containing the case class Person. 

Project test1 is a console application using the Person class.

Project test3 is a play framework application using the Person class.

