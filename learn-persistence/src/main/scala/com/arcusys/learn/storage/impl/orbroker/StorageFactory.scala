package com.arcusys.learn.storage.impl.orbroker

import com.arcusys.learn.scorm.manifest.storage._
import com.arcusys.learn.scorm.manifest.storage.impl.orbroker._
import com.arcusys.learn.scorm.tracking.storage._
import com.arcusys.learn.scorm.tracking.storage.impl.orbroker._
import com.arcusys.learn.quiz.storage._
import com.arcusys.learn.quiz.storage.impl.orbroker._
import com.arcusys.learn.questionbank.storage._
import com.arcusys.learn.questionbank.storage.impl.orbroker._
import com.arcusys.scorm.util.PropertyUtil
import com.arcusys.learn.storage.{DBType, StorageFactoryContract}
import com.arcusys.learn.scorm.tracking.states.storage.impl.orbroker.{ActivityStateStorageImpl, ActivityStateTreeStorageImpl}
import com.arcusys.learn.scorm.tracking.states.storage.{ActivityStateStorage, ActivityStateTreeStorage}
import org.postgresql.ds.PGPoolingDataSource
import com.arcusys.learn.filestorage.storage.FileStorage
import com.arcusys.learn.filestorage.storage.impl.orbroker.FileStorageImpl
import com.arcusys.learn.scorm.course.impl.orbroker.{PlayerScopeRuleStorageImpl, CourseStorageImpl}
import com.arcusys.learn.scorm.course.{PlayerScopeRuleStorage, CourseStorage}
import com.arcusys.learn.updater.StorageUpdater
import com.arcusys.learn.updater.impl.orbroker.StorageUpdaterImpl

object StorageFactory extends StorageFactoryContract {
  val initBroker = {
    if (!BrokerFactory.isInitialized) BrokerFactory.init(PropertyUtil.load("db"))
  }

  lazy val packageStorage: PackagesStorage = new PackagesStorageImpl
  lazy val activityStorage: ActivitiesStorage = new ActivitiesStorageImpl
  //lazy val organizationStorage: OrganizationsStorage = new OrganizationsStorageImpl
  lazy val resourceStorage: ResourcesStorage = new ResourcesStorageImpl
  lazy val questionCategoryStorage: QuestionCategoryStorage = new QuestionCategoryStorageImpl
  lazy val questionStorage: QuestionStorage = new QuestionStorageImpl
  lazy val quizStorage: QuizStorage = new QuizStorageImpl
  lazy val quizQuestionCategoryStorage: QuizQuestionCategoryStorage = new QuizQuestionCategoryStorageImpl
  lazy val quizQuestionStorage: QuizQuestionStorage = new QuizQuestionStorageImpl
  lazy val attemptStorage: AttemptStorage = new AttemptStorageImpl
  lazy val dataModelStorage: DataModelStorage = new DataModelStorageImpl
  lazy val userStorage: UserStorage = new UserStorageImpl
  lazy val activityStateTreeStorage: ActivityStateTreeStorage = new ActivityStateTreeStorageImpl
  lazy val activityStateStorage: ActivityStateStorage = new ActivityStateStorageImpl
  lazy val fileStorage: FileStorage = new FileStorageImpl
  lazy val courseStorage: CourseStorage = new CourseStorageImpl
  lazy val packageScopeRuleStorage: PackageScopeRuleStorage = new PackageScopeRuleStorageImpl
  lazy val playerScopeRuleStorage: PlayerScopeRuleStorage = new PlayerScopeRuleStorageImpl
  lazy val storageUpdater: StorageUpdater = new StorageUpdaterImpl

  def dbType = BrokerFactory.dbType
}
