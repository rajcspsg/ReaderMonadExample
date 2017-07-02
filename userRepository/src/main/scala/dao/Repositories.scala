package dao

import scalaz.Reader

/**
  * Created by rajkumar on 7/1/17.
  */
trait Repositories {

  def userRepo: UserRepository

  def addressRepo: AddressRepository

}

object Repositories {
  val repositories: Reader[Repositories, Repositories] = Reader[Repositories, Repositories] (identity)

  val userRepo: Reader[Repositories, UserRepository] = repositories map (_.userRepo)

  val addressRepo : Reader[Repositories, AddressRepository] = repositories map (_.addressRepo)
}
