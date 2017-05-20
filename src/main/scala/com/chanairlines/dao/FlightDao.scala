package com.chanairlines.dao

import com.chanairlines.model.Flight
object FlightDao {
  
  var all = List(
      Flight("CHNALN001", "MDE", "BOG", 349000, "COP", "14:30 26-05-2017"),
      Flight("CHNALN002" ,"BOG" ,"MED" ,485767.56, "COP" , "12:10 28-05-2017"),
      Flight("CHNALN003" ,"BOG" ,"MED" ,489623.00, "COP" , "05:40 15-06-2017")
      )
}