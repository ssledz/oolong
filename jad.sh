#!/bin/sh
java=java
if test -n "$JAVA_HOME"; then
    java="$JAVA_HOME/bin/java"
fi
exec "$java" -jar target/oolong-1.0-SNAPSHOT-jar-with-dependencies.jar "$@"
exit 1