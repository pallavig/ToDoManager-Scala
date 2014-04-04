package top

import db.DBHandler

class TaskManager(db:DBHandler) {
  private var tasks:List[Task] = db.getAllTasks()
  def addTask(task:Task) = {
    tasks = tasks :+ task
    db.saveTask(task)
  }

  def display():List[Task] = {
    tasks
  }
}
