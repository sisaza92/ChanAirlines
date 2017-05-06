package com.chanairlines.flights

import org.scalatra._

class FlightsServlet extends ChanFlightsStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
