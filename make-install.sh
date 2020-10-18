#!/bin/sh
mvn clean package
sudo cp -v target/jad /usr/local/bin/jad
