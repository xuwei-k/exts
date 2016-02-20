package com.sksamuel.scalax

import org.slf4j.{LoggerFactory, Logger}

trait Logging {
  protected val logger: Logger = LoggerFactory getLogger getClass.getName
}
