name := "sample"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
    "org.mockito" % "mockito-core" % "1.9.5" % "test",
    "org.specs2" %% "specs2" % "2.3.10" % "test",
    "org.mongodb" % "mongo-java-driver" % "2.12.0-rc0",
    "org.mongodb" %% "casbah" % "2.5.0",
    "org.mockito" % "mockito-all" % "1.8.4"
)

transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)
