package top

import db.DBHandler

case class Task(task:String) {
  def saveTask(taskManager:TaskManager) = {
    taskManager.addTask(this)
  }
}