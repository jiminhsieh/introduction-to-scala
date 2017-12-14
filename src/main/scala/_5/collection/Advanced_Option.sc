/*
  Advanced Option
  @see http://danielwestheide.com/blog/2012/12/19/the-neophytes-guide-to-scala-part-5-the-option-type.html
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

PeopleRepository.find(5)

for {
  people <- PeopleRepository.find(2)
  gender <- people.gender
} yield gender
// Some(female)
for {
  people <- PeopleRepository.find(3)
  gender <- people.gender
} yield gender
// None
for {
  people <- PeopleRepository.find(4)
  gender <- people.gender
} yield gender