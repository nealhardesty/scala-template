package com.roadwaffle.demo

import org.scalatra._
import scalate.ScalateSupport

class DemoServlet extends DemoStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">howdy</a>.
      </body>
    </html>
  }

}
