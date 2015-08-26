package com.salesforce.blocker

import org.scalatra._
import scalate.ScalateSupport

class BlockerServlet extends BlockerStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
