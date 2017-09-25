object higherOrderFnc {

  /*
    double is the value which has a function thats take Int & return Int * 2
   */
  val double = (x: Int) => x * 2

  /*
    triple is the value which has a function thats take Int & return Int * 3
   */
  val triple = (x: Int) => x * 3

  /*
    Higher order function takes the x as Int and y:Int => Int as the function
   */
  def higherOrder(x: Int , y: Int => Int) = y(x)

  /*
    Calling higher order function with 6 and double as the function paramter
   */
  higherOrder(6,double)

  higherOrder(6,triple)

  /*
    In thi sexample it take fnction as input and return function as out
   */
  def sayHello = (name:String) => {"hello" + " " + name }

  var message = sayHello("Dubious")


  /*
    Clojers the function has value which is decelared outside the function
    y in this case
   */
  var  y  = 5

  val multipler = (x: Int ) =>  x * y

  multipler(10)


}