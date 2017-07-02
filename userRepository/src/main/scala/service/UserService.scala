package service

import dao.{AddressRepository, UserRepository}

/**
  * Created by rajkumar on 7/1/17.
  */
object UserService {

  def getEmail(userId: Int) = for {
    user <- UserRepository.getUser(userId)
  } yield user.email

  def findAddress(email: String) = for {
      user <- UserRepository.findUser(email)
     address <- AddressRepository.getAddress(user.userId)
  } yield  address



}
