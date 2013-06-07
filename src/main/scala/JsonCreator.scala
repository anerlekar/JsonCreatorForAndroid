package scala

import util.Random


class JsonCreator {

  def create(noOfDeviceTokens: Int) {
    println("{\n  \"messages\": [\n      {\n        \"deviceType\": \"android\", \n        \"deviceTokens\": [")

    (1 to noOfDeviceTokens) foreach {
      times: Int =>
        generateRandomTokenAndAppendItToOutput
    }
    println(" ],\n      \"message\": \"hello to google user testing!123\"\n    }\n  ],\n  \"sourceAddress\": \"O2 Moments\"\n}")

  }

  def generateRandomTokenAndAppendItToOutput() {
    val randomlyGeneratedDeviceToken = new StringBuilder()

    randomlyGeneratedDeviceToken.append("          \"")

    (1 to 162) foreach {
      times: Int =>
        randomlyGeneratedDeviceToken.append(Random.alphanumeric.head)
    }
    randomlyGeneratedDeviceToken.append("\",")
    println(randomlyGeneratedDeviceToken)
  }

}

