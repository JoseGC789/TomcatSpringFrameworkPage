#!/usr/bin/env bash

export CATALINA_OPTS="-Dcom.sun.management.jmxremote.port=9832 -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.local.only=false -Dcom.sun.management.jmxremote.rmi.port=9832 -Djava.rmi.server.hostname=localhost"