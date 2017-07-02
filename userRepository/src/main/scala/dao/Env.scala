package dao

import service._

import scalaz.Reader

/**
  * Created by rajkumar on 7/1/17.
  */
trait Env {

  def config: Configuration

  def emailService: EmailService

  def repositories: Repositories

}

object Env {
  val env = Reader[Env, Env] (identity)

  val config: Reader[Env, Configuration] = env map (_.config)

  val emailService : Reader[Env, EmailService] = env map (_.emailService)

  val repositories : Reader[Env, Repositories] = env map (_.repositories)
}
