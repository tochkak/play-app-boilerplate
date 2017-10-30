package services

import javax.inject.Inject

import daos.ExampleDAO
import models.Entity
import org.bson.types.ObjectId

class ExampleService @Inject()(
  exampleDAO: ExampleDAO
) {

  def findById(id: ObjectId): Option[Entity] = exampleDAO.findById(id)

}