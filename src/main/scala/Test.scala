import org.apache.spark.{SparkConf, SparkContext}

object Test {
  def main(args: Array[String]) {
    println("Start ")

    val conf = new SparkConf()
      .setAppName("HW1")
      .setMaster("local[*]")
    val sc = new SparkContext(conf)

    val count = sc.parallelize(Seq(1, 2, 3, 4)).count()

    println(count);
  }
}
