package com.chanairlines.controller

import org.scalatra.test.specs2._

class ExampleTestSpec2 extends MutableScalatraSpec {
  addServlet(classOf[FlightsServlet], "/*")

  "GET / on HelloWorldServlet" should {
    "return status 200" in {
      get("/") {
        status must_== 200
        
      }
    }
  }
}