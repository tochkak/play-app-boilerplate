package daos

import javax.inject.Inject

import com.mongodb.casbah.commons.MongoDBObject
import models.Entity
import org.bson.types.ObjectId
import ru.tochkak.plugin.salat.PlaySalat
import salat.dao.SalatDAO

class ExampleDAO @Inject()(
  playSalat: PlaySalat,
  mongoContext: MongoContext
) {

  import mongoContext._

  val dao = new SalatDAO[Entity, ObjectId](playSalat.collection("collection", "default")) {}

  def findById(id: ObjectId): Option[Entity] = {
    dao.findOne(
      MongoDBObject(
        "_id" -> id
      )
    )
  }
}
