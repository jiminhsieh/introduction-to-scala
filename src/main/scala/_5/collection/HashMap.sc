val countryCode =
  Map("Taiwan" -> 886,
    "United States" -> 1,
    "Japan" -> 81)
val countryCode1 =
  Map(("Taiwan", 886),
    ("United States", 1),
    ("Japan", 81))

// 886
countryCode("Taiwan")
// Some(886)
countryCode.get("Taiwan")
// NoSuchElementException
countryCode("Canada")
// None
countryCode.get("Canada")
// add
countryCode + ("China" -> 86)
// delete
countryCode - ("Japan")
// update
countryCode + ("Taiwan" -> 5566)
countryCode.getOrElse("China", 0)