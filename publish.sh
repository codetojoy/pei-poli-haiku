#!/bin/bash

set -e 

./refresh-haiku.sh
groovy VersionInfo.groovy 

mv tmp.info.html info.html 

git add -u . 
git commit -m "incremental refresh"
git push origin gh-pages

echo "Ready."
