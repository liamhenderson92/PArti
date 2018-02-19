import org.scalatest.{MustMatchers, WordSpec}

class PartridgeSpec extends WordSpec with MustMatchers {

  "Partridge" when {

    "part is called" must {

      "return 'Lynn, I've pierced my foot on a spike!!' if empty args" in {
        Partridge.part(Array("")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "return 'Lynn, I've pierced my foot on a spike!!' if no matches found" in {
        Partridge.part(Array("Sausages", "Pies")) mustEqual "Lynn, I've pierced my foot on a spike!!"
      }

      "return win phrase with one exclamation point when given one match for terms" in {
        Partridge.part(Array("Grouse", "Partridge", "Pheasant")) mustEqual "Mine's a Pint!"
      }

      "return win phrase with two exclamation point when given two match for terms" in {
        Partridge.part(Array("Grouse", "Partridge", "Chat")) mustEqual "Mine's a Pint!!"
      }

      "return win phrase with four exclamation point when given four match for terms" in {
        Partridge.part(Array("Grouse", "Partridge", "Nomad", "Lynn", "Toblerone")) mustEqual "Mine's a Pint!!!!"
      }

      "return win phrase with five exclamation point when given six match for terms (with duplicate)" in {
        Partridge.part(Array("Grouse", "Partridge", "Nomad", "Lynn", "Toblerone", "Nomad")) mustEqual "Mine's a Pint!!!!!"
      }

      "return win phrase with eight exclamation point when given ten match for terms (with duplicates" in {
        Partridge.part(Array("Partridge", "Nomad", "Lynn", "Toblerone", "Partridge", "Nomad", "Lynn", "Toblerone")) mustEqual "Mine's a Pint!!!!!!!!"
      }
    }


  }
}