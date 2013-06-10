package scala

import org.junit.Test

class JsonCreatorSpec {

  @Test
  def itCreatesJsonsWithSpecifiedNumberOfDeviceTokens() {

    val noOfDeviceTokenPerJson: Int = 2
    val noOfJson: Int = 1

    val jsonCreator = new JsonCreator

    jsonCreator.create(noOfDeviceTokenPerJson, noOfJson)

  }
}
