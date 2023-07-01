import scala.io.StdIn.readInt
object Q2 {
  def main(args: Array[String]): Unit = {

    //using if else statement
    /*
      def patternMatching(number: Int): Unit={
      if(number <= 0){
        println("Given number is Negative/Zero number.")
      }else if(number%2==0){
        println("Given number is Even number")
      }else{
        println("Given number is Odd number")
      }
    }
    */


    //using match
    def patternMatching(number :Int):Unit= number match {
      case number if number <= 0 => println("Given number is Negative/Zero number.")
      case number if number%2==0 => println("Given number is Even number")
      case number if number%2==1 => println("Given number is Odd number")
    }
    println("Enter your number : ")
    var number=readInt()
    patternMatching(number)
  }
}
