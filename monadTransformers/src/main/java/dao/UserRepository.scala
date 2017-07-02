package dao

import domain.User

import scala.concurrent.{ExecutionContext, Future}
import scalaz.{Kleisli, Reader, ReaderT}

/**
  * Created by rajkumar on 7/1/17.
  */
trait UserRepository {
  def get(userId: Int): Future[User]
  def find(email: String): Future[User]
  def update(user: User): Future[User]

}

object Query {

  type Query[A] = ReaderT[Future, Env, A]

  def apply[A](run: Env => Future[A]): Query[A] = Kleisli[Future, Env, A](run)

  def lift[A](reader: Reader[Env, Future[A]]) = Query(reader.run)
}

object RepositoryQuery {

}

object UserRepository {

  import Query._
  import scalaz.contrib.std.scalaFuture._

  val userRepo = Repositories.userRepo
  //val userRepo = Reader[UserRepository, UserRepository] (identity)

  def getUser(userId: Int) (implicit ec: ExecutionContext): Reader[Repositories, Future[User]] = Query.lift(userRepo map (_.get(userId)))

  //def getUser(userId: Int) : Reader[UserRepository, User] = userRepo map (_.get(userId))

  //def getUser(userId: Int) : Reader[UserRepository, User] = Reader[UserRepository, User] (_.get(userId))

  def findUser(email: String): ReaderT[Future, Repositories, User] = userRepo map (_.find(email))

  //def findUser(email: String): Reader[UserRepository, User] = userRepo map (_.find(email))

  //def findUser(email: String): Reader[UserRepository, User] = Reader[UserRepository, User](_.find(email))

  def updateUser(user: User): Reader[Repositories, Future[User]] = userRepo map (_.update(user))

  //def updateUser(user: User): Reader[UserRepository, User] = userRepo map (_.update(user))

  //def updateUser(user: User): Reader[UserRepository, User] = Reader[UserRepository, User](_.update(user))
}
