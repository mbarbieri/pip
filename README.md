# pip

Demo app to pick a random PiP attendee to win a JetBrains license

## Installation

Install [Leiningen](http://leiningen.org/) and run

    $ lein uberjar

## Usage

Run

    $ java -jar target/uberjar/pip-1.0.0-standalone.jar <csv-file>

where `csv-file` is the attendees file in this format:

```csv
Mario,Rossi
Paolo,Bianchi
Luca,Neri
```

## Examples

    $  java -jar target/uberjar/pip-1.0.0-standalone.jar pip.csv

## License

Copyright © 2016 Matteo Barbieri

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
