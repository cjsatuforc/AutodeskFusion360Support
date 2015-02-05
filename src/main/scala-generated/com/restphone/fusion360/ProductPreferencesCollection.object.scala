
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A collection that provides access to product specific preference objects. 
 */
@JSName("adsk.core.ProductPreferencesCollection")
class ProductPreferencesCollection extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of ProductPreference objects.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified ProfductPreferences object using an index into the collection.
  */
  def item(index: uinteger): ProductPreferences = js.native
  /**
  * Returns the ProductPreference object with the specified name.
  */
  def itemByName(name: String): ProductPreferences = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A collection that provides access to product specific preference objects. 
 */
@JSName("adsk.core.ProductPreferencesCollection")
object ProductPreferencesCollection extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of ProductPreference objects.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified ProfductPreferences object using an index into the collection.
  */
  def item(index: uinteger): ProductPreferences = js.native
  /**
  * Returns the ProductPreference object with the specified name.
  */
  def itemByName(name: String): ProductPreferences = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object ProductPreferencesCollectionUtilities {
    
    def toSeq(xs: ProductPreferencesCollection): IndexedSeq[ProductPreferences] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
