
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Collection of the favorite materials. To add a material to the favorites list use the CopyTo method of the Material object. 
 */
@JSName("adsk.core.FavoriteMaterials")
trait FavoriteMaterials extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of Materials in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified Material using an index into the collection.
  */
  def item(index: Integer): Material = js.native
  /**
  * Returns the Material by it's internal unique ID.
  */
  def itemById(id: String): Material = js.native
  /**
  * Returns the specified Material using the name as seen in the user interface. This often isn't a reliable way of accessing a specific material because materials are not required to be unique.
  */
  def itemByName(name: String): Material = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * Collection of the favorite materials. To add a material to the favorites list use the CopyTo method of the Material object. 
 */
@JSName("adsk.core.FavoriteMaterials")
object FavoriteMaterials extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of Materials in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Returns the specified Material using an index into the collection.
  */
  def item(index: Integer): Material = js.native
  /**
  * Returns the Material by it's internal unique ID.
  */
  def itemById(id: String): Material = js.native
  /**
  * Returns the specified Material using the name as seen in the user interface. This often isn't a reliable way of accessing a specific material because materials are not required to be unique.
  */
  def itemByName(name: String): Material = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object FavoriteMaterialsUtilities {
    def toSeq(xs: FavoriteMaterials): IndexedSeq[Material] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
  }
           
