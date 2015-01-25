
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * The base class for the classes that define how a chamfer can be defined. 
 */
@JSName("adsk.fusion.ChamferTypeDefinition")
trait ChamferTypeDefinition extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the feature that owns this chamfer type definition
  */
  val parentFeature: ChamferFeature = js.native
}
/** 
  * The base class for the classes that define how a chamfer can be defined. 
 */
@JSName("adsk.fusion.ChamferTypeDefinition")
object ChamferTypeDefinition extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
  /**
  * Returns the feature that owns this chamfer type definition
  */
  val parentFeature: ChamferFeature = js.native
}
// no utilities