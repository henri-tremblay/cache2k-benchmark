#!/bin/bash

set -x
set -e

SERVER="tc-bigmemory-11.eur.ad.sag"

ssh -tt $SERVER pkill java
