package com.chanairlines.flights

import org.scalatra.test.scalatest.ScalatraFlatSpec

class FlightsServletTest extends ScalatraFlatSpec {
  
  addServlet(classOf[FlightsServlet], "/*")
  
  "GET / in FlightServlet" should "return status 200 and body should include Hello, world!" in {
    get("/"){
      status should equal (200)
      body should include ("Hello, world!")
    }
  }
}