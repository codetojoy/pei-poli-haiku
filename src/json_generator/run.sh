#!/bin/bash

set -e

SRC_CSV=../../haikus.csv
TARGET_DIR=../../data/generated
TARGET_FILE=$TARGET_DIR/haikus.json

stat $SRC_CSV > /dev/null 2>&1
stat $TARGET_DIR > /dev/null 2>&1

./gradlew clean test installDist
stat staging/bin/json_generator > /dev/null 2>&1

./staging/bin/json_generator $SRC_CSV $TARGET_FILE

echo "Ready."
