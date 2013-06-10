package scala

import util.Random


class JsonCreator {

  val startJsonString: String = "{\n  \"messages\": [\n      {\n        \"deviceType\": \"android\", \n        \"deviceTokens\": ["
  val endJsonString: String = " ],\n      \"message\": \"hello to google user testing!123\"\n    }\n  ],\n  \"sourceAddress\": \"O2 Moments\"\n}"

  def create(noOfDeviceTokensPerJson: Int, noOfJson: Int) {
    (1 to noOfJson) foreach {
      json =>
        println(startJsonString)

        (1 to noOfDeviceTokensPerJson) foreach {
          times: Int =>
            generateRandomDeviceTokenAndAppendItToJson
        }

        println(endJsonString)
    }
  }

  def generateRandomDeviceTokenAndAppendItToJson() {
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

