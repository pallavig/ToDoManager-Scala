package db

import top.Task

trait DBHandler {
  def getAllTasks():List[Task]

  def saveTask(task:Task)
}