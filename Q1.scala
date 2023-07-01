import scala.io.StdIn.readDouble
object Q1 {
  def main(args: Array[String]): Unit = {

    //using if else statement

   /* def interest(depositAmount :Double): Double ={
      if(depositAmount<=20000){
        return depositAmount*2/100
      }else if(depositAmount<=200000){
        return depositAmount*4/100
      }else if(depositAmount<=2000000){
        return depositAmount*3.5/100
      }else{
        return depositAmount*6.5/100
      }
    }*/

    //using match

    def interest(depositAmount: Double): Double= depositAmount match {
      case depositAmount if depositAmount <=20000 => depositAmount*2/100
      case depositAmount if depositAmount <=200000 => depositAmount*4/100
      case depositAmount if depositAmount <=2000000 => depositAmount*3.5/100
      case _ => depositAmount*6.5/100
    }

    println("Enter the deposit amount :")
    var amount=readDouble()
    println("Interest Paid at Maturity : "+BigDecimal(interest(amount)).setScale(2,BigDecimal.RoundingMode.HALF_UP))
  }

}
