package com.scala.essentials


import io.StdIn._

object ReadConsole extends App{

  var done = false

  while(!done) {
    val name = readLine("Please enter the name of studen:")
    println("Please enter the score :")
    val score = readDouble()
    println("You received : "+ (if(score >90) "A" else "B" ))
    println("Please enter true to continue and false to end")
    done =readBoolean()
  }

}
