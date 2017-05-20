package com.chanairlines.model

case class SearchFlight(
    departureDate:String,
    arrivalDate:String,
    origin:String,
    destination:String,
    passengers:Int,
    roundTrip:Boolean)
    
case class Flight(
    flightCode:String,
    origin:String,
    destination:String,
    price:Double,
    currency:String,
    date:String)