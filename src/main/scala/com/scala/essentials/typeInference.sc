object typeInference {

  println("welcome to scala worksheet")
  val num = 5

  val decimal = 2.45677

  /*
    x as type as Double
   */
  var x = 1 + 2 + 3.456

  List(1, 2, 3, 4, 5)

  List(1, true)
  /*
    Checking the type as AnyVal
   */
  List(1, true, "String")

  /*
     Return type is inferred which is int
   */
  def add(x: Int) = {
    x * x
  }
  /*
    The return type is infered as Any
   */
  def functuion1(x: Int) = {
    if(x > 0) 1 else "String"
  }


}
