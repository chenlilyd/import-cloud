# Import datomic cloud to dev-local




## Usage

Run the project directly, via `:exec-fn`:

    $ clojure -X:run-m source-cloud.edn local-target.edn


Build an uberjar:

    $ clojure -X:uberjar

Run that uberjar:

    $ java -jar import-cloud.jar  source-cloud.edn local-target.edn

## Sample configurations

Please see `sample-source-cloud.edn` and `sample-local-target.edn`
