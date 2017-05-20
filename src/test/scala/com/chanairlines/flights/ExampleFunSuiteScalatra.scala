package com.chanairlines.flights

import org.scalatra.test.scalatest._
import org.scalatest.FunSuiteLike

class ExampleFunSuiteScalatra extends ScalatraSuite with FunSuiteLike {
  // `HelloWorldServlet` is your app which extends ScalatraServlet
  addServlet(classOf[FlightsServlet], "/*")

  test("simple get") {
    get("/path/to/something") {
      status should equal (200)
      body should include ("hi!")
    }

    get("/path/to/something", ("param1" -> "value"), ("param2" -> "value2")) {
      status should equal (200)
      body should include ("hi!")
    }

    get("/path/to/something",
        Map("param1" -> "value", "param2" -> "value2"),
        Map("Header1" -> "header_value", "Header2" -> "header_value2")) {
      status should equal (200)
      body should include ("hi!")
    }
  }
}