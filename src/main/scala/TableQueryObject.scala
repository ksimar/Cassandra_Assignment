
object TableQueryObject extends App {

  val userValues = new TableQuery
  userValues.userByEmail("simar@gmail.co")
  userValues.videoByName("kip")
  userValues.videosAfterYear(2015)
  userValues.videoById(1)


}
