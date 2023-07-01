object Q3 {
  def main(args: Array[String]): Unit = {
    def toUpper(upper :String): String ={
      upper.toUpperCase()
    }

    def toLower(lower :String): String ={
      lower.toLowerCase()
    }

    def formatNames(name :String)(formatFunc: String => String ) : String ={
      formatFunc(name)
    }

    var name=List("Benny","Niroshan","Saman","Kumara")
    println(formatNames(name.head)(toUpper))
    println(name(1).head+formatNames(name(1).charAt(1).toString)(toUpper)+name(1).drop(2))
    println(formatNames(name(2))(toLower))
    println(name.last.init+formatNames(name.last.last.toString)(toUpper))
  }
}
