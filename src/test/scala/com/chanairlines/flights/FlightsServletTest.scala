package com.chanairlines.controller

import org.scalatra.test.scalatest.ScalatraFlatSpec

class FlightsServletTest extends ScalatraFlatSpec {
  
  addServlet(classOf[FlightsServlet], "/*")
  val json = "{}";
  "GET / in FlightServlet" should "return status 200 and body should include Hello, world!" in {
    get("/"){
      status should equal (200)
      body should include ("Hello, world!")
    }
  }
  
  "POST /search in FlightServlet" should "return status 200 and body should include JSON with flights" in {
    post("/search"){
      status should equal (200)
      body should include ("{}")
    }
  }
}