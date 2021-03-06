
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * BRepVertex collection. 
 */
@JSName("adsk.fusion.BRepVertices")
class BRepVertices extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of vertices in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified vertex using an index into the collection.
  */
  def item(index: uinteger): BRepVertex = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * BRepVertex collection. 
 */
@JSName("adsk.fusion.BRepVertices")
object BRepVertices extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of vertices in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified vertex using an index into the collection.
  */
  def item(index: uinteger): BRepVertex = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object BRepVerticesUtilities {
    
    def toSeq(xs: BRepVertices): IndexedSeq[BRepVertex] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
