def matchString(x: String) = {
  x match {
    case "Dog" => x
    case "Cat" => x
    case _ => "Neither Dog or Cat"
  }
}

matchString("Dog")
matchString("Human")