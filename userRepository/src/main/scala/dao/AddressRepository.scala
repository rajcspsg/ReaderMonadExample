package dao

import domain.Address

import scalaz.Reader

/**
  * Created by rajkumar on 7/1/17.
  */
trait  AddressRepository {
  def get(userId: Int): Address
}
object AddressRepository {
  val addressRepo = Repositories.addressRepo

  def getAddress(userId: Int) : Reader[Repositories, Address] = addressRepo map(_.get(userId))
}
