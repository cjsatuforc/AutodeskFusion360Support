
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  *   
 */
@JSName("adsk.fusion.SketchConicCurves")
class SketchConicCurves extends Base {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of conic curves in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified conic curve using an index into the collection.
  */
  def item(index: uinteger): SketchConicCurve = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}
/** 
  *   
 */
@JSName("adsk.fusion.SketchConicCurves")
object SketchConicCurves extends js.Object {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  def classType(): String = js.native
  /**
  * Returns the number of conic curves in the sketch.
  */
  val count: uinteger = js.native
  /**
  * Indicates if this object is still valid, i.e. hasn't been deleted or some other action done to invalidate the reference.
  */
  val isValid: Boolean = js.native
  /**
  * Function that returns the specified conic curve using an index into the collection.
  */
  def item(index: uinteger): SketchConicCurve = js.native
  /**
  * Returns a string indicating the type of the object.
  */
  val objectType: String = js.native
}

  object SketchConicCurvesUtilities {
    
    def toSeq(xs: SketchConicCurves): IndexedSeq[SketchConicCurve] = {
      val n = xs.count - 1
      (0 to n) map {xs.item(_)}
    }
             

  }
       
