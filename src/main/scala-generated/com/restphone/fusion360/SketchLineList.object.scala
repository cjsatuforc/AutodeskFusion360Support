
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * A list of sketch lines. 
 */
@JSName("adsk.fusion.SketchLineList")
class SketchLineList extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketch lines in the list.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch line using an index into the collection.
  */
  def item(index: uinteger): SketchLine = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * A list of sketch lines. 
 */
@JSName("adsk.fusion.SketchLineList")
object SketchLineList extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of sketch lines in the list.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified sketch line using an index into the collection.
  */
  def item(index: uinteger): SketchLine = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchLineListUtilities {
    
    def toSeq(xs: SketchLineList): IndexedSeq[SketchLine] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
