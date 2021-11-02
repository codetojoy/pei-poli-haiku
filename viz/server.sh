#!/bin/bash

set -e

cp ../data/generated/haikus.json . 

python3 -m http.server
