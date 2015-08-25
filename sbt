#!/bin/bash

# Yet another sbt launcher wrapper script...

# Stuff to configure
SBT_LAUNCHER_URL="https://repo.typesafe.com/typesafe/ivy-releases/org.scala-sbt/sbt-launch/0.13.9/sbt-launch.jar"
SBT_OPTS="-Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256M"
SBT_LAUNCH=$(dirname $0)/sbt-launch.jar

# Download sbt-launcher if necessary
if [ \! -s "$SBT_LAUNCH" ]; then
	curl -L -o $SBT_LAUNCH "$SBT_LAUNCHER_URL"
fi

# Do it
java $SBT_OPTS -jar $SBT_LAUNCH "$@"
