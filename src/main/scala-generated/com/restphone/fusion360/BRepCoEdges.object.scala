
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * BRepCoEdge Collection. 
 */
@JSName("adsk.fusion.BRepCoEdges")
class BRepCoEdges extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of co-edges in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified co-edge using an index into the collection.
  */
  def item(index: uinteger): BRepCoEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  * BRepCoEdge Collection. 
 */
@JSName("adsk.fusion.BRepCoEdges")
object BRepCoEdges extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * The number of co-edges in the collection.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified co-edge using an index into the collection.
  */
  def item(index: uinteger): BRepCoEdge = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object BRepCoEdgesUtilities {
    
    def toSeq(xs: BRepCoEdges): IndexedSeq[BRepCoEdge] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
