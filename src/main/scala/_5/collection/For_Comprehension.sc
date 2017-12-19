/*
  for-comprehensions with Option
  http://docs.scala-lang.org/style/control-structures.html#comprehensions
 */

case class People(
                   id: String,
                   firstName: String,
                   lastName: String,
                   age: Int,
                   countries: List[String],
                   gender: Option[String]
                 )


object PeopleRepository {
  private val peoples = Map(
    1 -> People("1", "John", "Doe", 30, List("TW", "USA"), Some("male")),
    2 -> People("2", "Janie", "Doe", 10, List("Japan"), Some("female")),
    3 -> People("3", "", "Doe", 50, List("TW"), None))

  def find(id: Int): Option[People] = peoples.get(id)

  def getAll = peoples.values
}

// List of People has TW passport
for {
  people <- PeopleRepository.getAll
  if (people.countries.contains("TW"))
} yield people

(for {
  people <- PeopleRepository.getAll
  country <- people.countries
} yield country).toSet