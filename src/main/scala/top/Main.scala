package top

import java.util.Scanner
import db.MongoDBHandler

object Main {
  val db = new MongoDBHandler
  val taskManager = new TaskManager(db)

  def loop() = {
    val scanner = new Scanner(System.in)
    while(true) {
      val s = scanner.nextLine()
      s match {
        case "exit" =>
          System.exit(0)
        case "display" =>
          taskManager.display() foreach println
        case input if input.startsWith("addTask") =>
          val newTask = new Task(input.substring(7))
          newTask.saveTask(taskManager)
        case _ => println("Wrong input")
      }
    }
  }

  def main(args: Array[String]) {
    loop()
  }
}

//store dates

//allow tags to be specified -- done, doing, not picked up

//Task -- content,date,tag




//val format = new java.text.SimpleDateFormat("dd-MM-yyyy")
//format: java.text.SimpleDateFormat = java.text.SimpleDateFormat@9586200
//
//scala> format.format(new java.util.Date())
//res4: java.lang.String = 21-03-2011
//
//scala> format.parse("21-03-2011")
//res5: java.util.Date = Mon Mar 21 00:00:00 CET 2011