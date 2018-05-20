#!/usr/bin/env bash
./gradlew clean jar
# TODO Add option to add --background to the command below
start-stop-daemon \
    --start \
    --make-pidfile \
    --pidfile $(pwd)/mingling.pid \
    --exec $(which java) \
    -- -jar $(readlink -f .)/build/libs/mingling.jar
