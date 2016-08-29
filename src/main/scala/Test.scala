import org.apache.spark.sql.Dataset
import org.apache.spark.{SparkConf, SparkContext}

object Test extends App {
  println("Start ")

  val conf = new SparkConf()
    .setAppName("HW1")
  val sc = new SparkContext(conf)

  val sqlContext = new org.apache.spark.sql.SQLContext(sc)

  import sqlContext.implicits._

  case class Person(age: Int, name:String)

  val df = sqlContext.read.json("file:///home/zinjvi/repo/spark-test/src/main/resources/people.json")


  df.explain()


  println("Finish ")

}
