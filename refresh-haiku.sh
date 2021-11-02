#!/bin/bash

set -e 

SRC_DIR=../../peipoli_haiku
DEST_DIR=.

# --------- assert 

stat $SRC_DIR/data/generated/haikus.json > /dev/null 2>&1

stat $SRC_DIR/viz/index.html > /dev/null 2>&1

stat $SRC_DIR/viz/haiku.css > /dev/null 2>&1

stat $SRC_DIR/viz/app.js > /dev/null 2>&1
stat $SRC_DIR/viz/const.js > /dev/null 2>&1

stat $SRC_DIR/viz/info.html > /dev/null 2>&1
stat $SRC_DIR/viz/info.css > /dev/null 2>&1

stat $SRC_DIR/viz/other.html > /dev/null 2>&1

stat $SRC_DIR/viz/nav.css > /dev/null 2>&1
stat $SRC_DIR/viz/nav.js > /dev/null 2>&1

# --------- copy 

cp $SRC_DIR/data/generated/haikus.json $DEST_DIR/.

cp $SRC_DIR/viz/index.html $DEST_DIR/.

cp $SRC_DIR/viz/haiku.css $DEST_DIR/.

cp $SRC_DIR/viz/app.js $DEST_DIR/.
cp $SRC_DIR/viz/const.js $DEST_DIR/.

cp $SRC_DIR/viz/info.html $DEST_DIR/.
cp $SRC_DIR/viz/info.css $DEST_DIR/.

cp $SRC_DIR/viz/other.html $DEST_DIR/.

cp $SRC_DIR/viz/nav.css $DEST_DIR/.
cp $SRC_DIR/viz/nav.js $DEST_DIR/.
