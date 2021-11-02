#!/bin/bash

set -e 

./refresh-haiku.sh
groovy VersionInfo.groovy 

mv tmp.info.html info.html 

echo "Ready."
