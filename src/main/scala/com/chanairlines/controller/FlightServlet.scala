package com.chanairlines.controller

import org.scalatra._
// JSON-related libraries
import org.json4s.{DefaultFormats, Formats}

// JSON handling support from Scalatra
import org.scalatra.json._
import com.chanairlines.dao.FlightDao

class FlightsServlet extends ChanFlightsStack with JacksonJsonSupport {
  // Sets up automatic case class to JSON output serialization, required by
  // the JValueResult trait.
  protected implicit val jsonFormats: Formats = DefaultFormats
  
   // Before every action runs, set the content type to be in JSON format.
  before() {
    contentType = formats("json")
  }
  
  get("/") {
    FlightDao.all
  }
  
    post("/search") {
      val jsonString = request.body
      // deserialize the JSON ....
      response.addHeader("ACK", "JSON OK")
  }

}