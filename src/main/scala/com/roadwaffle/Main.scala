package com.roadwaffle

import java.net.InetAddress


object Main extends App {

	val hostname = InetAddress.getLocalHost.getHostName

	println(s"Hello from $hostname")

}
