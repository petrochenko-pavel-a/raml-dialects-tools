# Raml Dialects Tools


![Build Status](https://api.travis-ci.org/petrochenko-pavel-a/raml-dialects-tools.svg)

This project contains Java implementation of
  
  * RAML Vocabularies 
  * RAML Dialects

Project goal is to provide lightweight pure Java implementation for Dialects and Vocabularies specifications, as well as to provide facilities for parsing and serialization of user
defined dialects.  

## Project modules

* `org.raml.dialects.core` contains a minimal kernel which supports parsing of RAML Dialects files in JSON/JSONLD formats to java beans as well as their serialization back to JSONLD or JSON
* `org.raml.dialects.yaml` adds YAML as a storage format to the kernel
* `org.raml.vocabularies` contains top level models for RAML vocabularies (see ./org.raml.vocabularies/README.MD)
* `org.raml.dialects.toplevel` contains top level models for RAML Dialects
* `org.raml.dialect2java` contains a code which allows to generate java beans for a dialect
* `org.raml.dialects2javaMaven` contains a maven plugin which can be used to generate java beans for dialect


*Java Version requirements:* `org.raml.dialects.core` is Java 1.6 to allow kernel to work on Android , other modules may require Java 1.8 to work properly.

Examples: 
 * [Using maven plugin](./examples/dialect2java)
 * [Vocabularies](https://github.com/petrochenko-pavel-a/raml-dialects-tools/tree/master/org.raml.vocabularies)  


## Usage:
 Good examples of using API may be found [here](./examples/dialect2java/src/test/java/org/aml/example/simple/dialects2java/BasicTest.java) 
 
 ## Notes:
 
 * If you need to parse from yaml you should have `org.raml.dialects.yaml` module on your class path
 * `org.raml.vocabularies` is not refactored to new core yet so vocabularies are limited to yaml format.
 
  
