object functionexamples {
  println("Function in scala are Object and can be assigned to variables")

  println("Scala is functional programming language")

  println(
    s"1) Normal function" +
      s"2) Anonymous function " +
      s"3) Unit function ")

  /*
    abs function return Absolute value of the passed intergers
   */
  def abs(x: Int) = if (x < 0) -x else x
  abs(5)
  abs(-5)

  /*
    Factorial function impl with resursion
   */
  def fac(x: Int): Int = if (x == 1) 1 else x * fac(x - 1)

  /*
    Factorial without recusrion .
   */
  def factorial(x: Int): Int = {
    var r = 1
    for (arg <- 1 to x) r = r.*(arg)
    r
  }

  fac(4)
  fac(5)

  factorial(4)
  factorial(5)

  /*
    Scala function can be have name input parameters so that calling function is little more flexible
    also as you can see we can give the default value in function signature itself a
    and then i dont need to pass any parameters at all
   */
  def printName(firstName: String = "", lastName: String = "") =
    println(firstName + " " + lastName)

  printName(firstName = "Ankit", lastName = "Khare")
  printName()

  /*
    Variable length functions
    Sum will receive list of ints and it need to return the sum of all
   */

  def sum(x: Int*) = {
    var result = 0
    for (arg <- x) {
      result = result + arg
    }
    result
  }

  sum(1,2,3)
  sum(1,2,3,5,6,7)

}
