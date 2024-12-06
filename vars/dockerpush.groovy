#!/usr/bin/env groovy
def call(String name = 'docker-url') {
  echo "Building a docker"
    echo "docker build -t ${name} ."
    echo "docker push ${name}"
}
