#!/bin/bash

set -x
set -e

NAME=cache2k-benchmark

SERVER="tc-bigmemory-11.eur.ad.sag"
SERVER="tc-perf-013.eur.ad.sag"

mvn clean verify -DskipTests

scp jmh-suite/target/benchmarks.jar $SERVER:${NAME}/jmh-suite/target
scp launch.sh $SERVER:${NAME}

ssh -tt $SERVER << 'EOF'
  export JAVA=/usr/java/java-1.8.0/bin/java
  NAME=cache2k-benchmark
  cd ${NAME}
  nohup ./launch.sh &> result.txt &
  tail -f result.txt
EOF
