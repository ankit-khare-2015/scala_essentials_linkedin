package com.scala.essentials

object PatterMatching extends App {

  /*
    This method is a good example of totality where it will return string if valid or None
    if invalid
   */
  def greekAlphabet(letter: Some[Char]) = letter match {
    case Some('a') | Some('A') => "Alpha"
    case Some('b') | Some('B') => "Beta"
    case _                     => None
  }

  println("Greak Alphabet :=> " + greekAlphabet(Some('a')))

  /*
    This method return max of given two number
   */
  def max(x: Int , y: Int) =  x > y match  {
    case true  => x
    case false => y
  }

  println(max(1,2))

}
