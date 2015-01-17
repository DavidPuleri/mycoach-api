package com.mycoach

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import com.typesafe.scalalogging.LazyLogging
import spray.can.Http

import scala.concurrent.duration._

object Boot extends App with LazyLogging {

  implicit val system = ActorSystem("main-actor")

  val service = system.actorOf(Props[MyServiceActor], "demo-service")

  implicit val timeout = Timeout(5.seconds)

  logger.error("Starting the application")

  IO(Http) ? Http.Bind(service, interface = "0.0.0.0", port = 8080)
}
