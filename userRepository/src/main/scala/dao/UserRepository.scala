package dao

import domain.User

import scalaz.Reader

/**
  * Created by rajkumar on 7/1/17.
  */
trait UserRepository {
  def get(userId: Int): User
  def find(email: String): User
  def update(user: User): User

}

object UserRepository {

  val userRepo = Repositories.userRepo
  //val userRepo = Reader[UserRepository, UserRepository] (identity)

  def getUser(userId: Int) : Reader[Repositories, User] = userRepo map (_.get(userId))

  //def getUser(userId: Int) : Reader[UserRepository, User] = userRepo map (_.get(userId))

  //def getUser(userId: Int) : Reader[UserRepository, User] = Reader[UserRepository, User] (_.get(userId))

  def findUser(email: String): Reader[Repositories, User] = userRepo map (_.find(email))

  //def findUser(email: String): Reader[UserRepository, User] = userRepo map (_.find(email))

  //def findUser(email: String): Reader[UserRepository, User] = Reader[UserRepository, User](_.find(email))

  def updateUser(user: User): Reader[Repositories, User] = userRepo map (_.update(user))

  //def updateUser(user: User): Reader[UserRepository, User] = userRepo map (_.update(user))

  //def updateUser(user: User): Reader[UserRepository, User] = Reader[UserRepository, User](_.update(user))
}
