package scala

import org.junit.Test

class JsonCreatorSpec {

  @Test
  def itCreatesJsonInAFile() {

    val noOfdeviceToken: Int = 2

    val jsonCreator = new JsonCreator

    jsonCreator.create(noOfdeviceToken)

  }
}
