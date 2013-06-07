package scala

import util.Random


class JsonCreator {

  def create(noOfDeviceTokens: Int) {

    val startJsonString: String = "{\n  \"messages\": [\n      {\n        \"deviceType\": \"android\", \n        \"deviceTokens\": ["
    val endJsonString: String = " ],\n      \"message\": \"hello to google user testing!123\"\n    }\n  ],\n  \"sourceAddress\": \"O2 Moments\"\n}"

    println(startJsonString)

    (1 to noOfDeviceTokens) foreach {
      times: Int =>
        generateRandomTokenAndAppendItToOutput
    }
    println(endJsonString)

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

