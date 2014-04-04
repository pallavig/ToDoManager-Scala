package db

import com.mongodb.casbah.commons.MongoDBObject
import com.mongodb.casbah.MongoConnection
import top.Task

class MongoDBHandler extends DBHandler{

  val mongoConnection = MongoConnection()
  val tasksCollection = mongoConnection("test")("tasks")

  def getAllTasks(): List[Task] = {
    tasksCollection.find().toList.map { dbObject=>
      new Task(dbObject.get("task").toString)
    }
  }

  def saveTask(task: Task): Unit = {
    val taskDescription = task.task
    val mongoObject = MongoDBObject("task" -> taskDescription)
    tasksCollection.insert(mongoObject)
  }
}