name := "spark-test"

version := "1.0"

scalaVersion := "2.11.8"

assemblyJarName in assembly := "apps.jar"

test in assembly := {}

parallelExecution in Test := false

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.1" % Provided,
  "org.apache.spark" %% "spark-sql" % "1.6.1" % Provided,
  "org.apache.spark" %% "spark-streaming" % "1.6.1" % Provided,
  "org.apache.spark" %% "spark-streaming-kafka" % "1.6.1" % Provided
)

run in Compile <<= Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run))
runMain in Compile <<= Defaults.runMainTask(fullClasspath in Compile, runner in (Compile, run))

    