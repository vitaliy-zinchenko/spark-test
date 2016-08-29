name := "spark-test"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.1" % Provided,
  "org.apache.spark" %% "spark-sql" % "1.6.1" % Provided,
  "org.apache.spark" %% "spark-streaming" % "1.6.1" % Provided,
  "org.apache.spark" %% "spark-streaming-kafka" % "1.6.1" % Provided
)


    