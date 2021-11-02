### PEI Poli Haiku

- Inspired by [this project](https://openparliament.ca/labs/haiku)
- Data-set is [here](./haikus.csv)
  - see License Details below
- All birthdays/signs found on [Wikipedia](https://wikipedia.org) or via public tweets.
  - sources listed in the data file

### Technical details

- original data-set is `./haikus.csv`
- this project requires Gradle and Groovy (and Java JDK)
- `./src/json-generator` produces `./data/generated/haikus.json` from `./haikus.csv`
- `./viz` is the project for the [web page](https://codetojoy.github.io/peipoli_haiku/index.html)
  - hosted via `gh-pages` 

### License details

- [This data file](./haikus.csv) is licensed under a [Creative Commons Attribution-ShareAlike 4.0 International License](http://creativecommons.org/licenses/by-sa/4.0/).
- The code and website are licensed via [Apache License Version 2.0](./LICENSE).

### Workflow for data update

* edit `./haikus.csv`
* `cd ~/src/json_generator`
    - `./run.sh` will run unit tests and generate the JSON files
* `cd ~/viz`
* `./server.sh` will run local HTTP server for testing
    - browse to `http://localhost:8000/test/SpecRunner.html` to run Jasmine tests for JS
* commit to master branch
* cd ~/../PrinceEdwardIsland-gh-pages
    - edit `refresh-haiku.sh` so that paths are correct
    - `./publish.sh` will copy files, run version info, and commit to `gh-pages`
