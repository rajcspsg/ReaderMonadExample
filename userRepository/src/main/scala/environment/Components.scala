package environment

import dao.Repositories
import service.{Configuration, EmailService}

/**
  * Created by rajkumar on 7/1/17.
  */

trait ConfigurationComponent {
  def config: Configuration
}

trait EmailServiceComponent {
  def emailService: EmailService
}


trait RepositoriesComponent {
  def repositories: Repositories
}

trait  Env extends  ConfigurationComponent with EmailServiceComponent with RepositoriesComponent

//trait RepositoriesComponent extends  UserRepo
