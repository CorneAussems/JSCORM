package com.arcusys.learn.quiz.storage

import com.arcusys.learn.quiz.model._

trait QuizQuestionStorage 
{
  def getCount(quizID:Int): Int
  def getByID(id: Int): Option[QuizQuestion]
  def getByCategory(quizID: Int, categoryID: Option[Int]): Seq[QuizQuestion]
  def createFromQuestionBankAndGetID(quizID: Int, categoryID: Option[Int], questionID: Int): Int
  def createExternalAndGetID(quizID: Int, categoryID: Option[Int], title:String, url: String): Int
  def createPlainAndGetID(quizID: Int, categoryID: Option[Int], title: String, text: String): Int
  def modifyExternal(id: Int, title:String, url: String)
  def delete(id: Int)
  def move(id: Int, parentID:Option[Int], siblingID: Option[Int], moveAfterTarget: Boolean): QuizQuestion
  def getAll: Seq[QuizQuestion]
  def renew()
}
