
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides information to create a chamfer that is defined by a single distance and has an equal offset from the edge. 
 */
@JSName("adsk.fusion.EqualDistanceChamferTypeDefinition")
class EqualDistanceChamferTypeDefinition extends ChamferTypeDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native
  /**
  * Returns the parameter controlling the distance. You can edit the distance by editing the value of the parameter object.
  */
  val distance: ModelParameter = js.native



}
/** 
  * Provides information to create a chamfer that is defined by a single distance and has an equal offset from the edge. 
 */
@JSName("adsk.fusion.EqualDistanceChamferTypeDefinition")
object EqualDistanceChamferTypeDefinition extends js.Object {
  /**
  * Returns the parameter controlling the distance. You can edit the distance by editing the value of the parameter object.
  */
  val distance: ModelParameter = js.native
}

  object EqualDistanceChamferTypeDefinitionUtilities {
    // no toSeq

  }
       
