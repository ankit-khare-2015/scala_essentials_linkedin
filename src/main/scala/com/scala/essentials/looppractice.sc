object looppractice {
  var x = 10

  /*
    Plain while loop printing from 10 to 0
   */
  while (x >= 0 ) {

    println(s"x = ${x}")
    x = x.-(1)
  }

  println("while blast off")

  var y = 10

  /*
    Do While loop printing from 10 to 0
   */
  do {
    println(s"x = ${y}")
    y = y.-(1)
  }  while (y >= 0)
  println("do while blast off")


  /*
    For loop printing from 10 to 0 however look at the
    the way the number is reduced each time the loop executes
   */

  for(c <- 10 to 0 by -1) {
    println(s"c = ${c}")
  }

  /*
    Cmprehensiove for loop
    the output of the loop is alwys a collection or a tuple
   */
  for (num <- 10 to 0 by -1) yield num +1
  /*
    For loop returing the collection of tuple
   */
  for (num <- 10 to 0 by -1) yield (num,num+1)

  val word = "Monday"

  /*
    For loop the important thing to notice is that
    until function is used if you need to make sure that
    you want to ommit the upper bound since the index starts from
    the 0
   */
  for(x <- 0  until word.length ) {
    println(word(x))
  }



}