
object setexample {


  val fruit = Set("apple", "orange", "banana")

  var moreFruit = Set("kiwi", "pineapple")

  var nums = Set(1,2,3,4,5)

  var moreNums = Set(6, 7, 8, 9)

/*
  def foldLeft[B](z: B)(op: (B, A) => B): B = {
    var result = z
    this foreach (x => result = op(result, x))
    result
  }
 */
  val test = nums.foldLeft(Set.empty[Int])((set: Set[Int], value: Int) => {
    println("set ="+set +" value ="+value) ;  set + value.+(1)
  }
  )




}