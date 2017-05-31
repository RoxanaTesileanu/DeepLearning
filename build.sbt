name := "DeepLearning"
scalaVersion := "2.11.10"
libraryDependencies ++= Seq(
"org.specs2" % "specs2-core_2.11" % "3.5" % "test",
"org.scalanlp" % "breeze_2.11" % "0.13.1")

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

/* References:
Joshua Suereth, Matthew Farwell, 2016, sbt in Action - The Simple Scala Build Tool, Manning
Resolver scalaz-stream at: https://github.com/etorreborre/specs2/issues/347
*/


