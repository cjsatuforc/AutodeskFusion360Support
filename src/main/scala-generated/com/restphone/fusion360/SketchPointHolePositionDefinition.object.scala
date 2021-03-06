
package com.restphone.fusion360

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import com.restphone.fusion360.Fusion360EnumTypeAliases._
import com.restphone.fusion360.Fusion360TypeAliases._
      
/** 
  * Provides positioning information for a hole that is positioned by a sketch point. 
 */
@JSName("adsk.fusion.SketchPointHolePositionDefinition")
class SketchPointHolePositionDefinition extends HolePositionDefinition {
  /**
  * Returns a string indicating the type of the object. All classes implement this static function. The returned string matches the string returned by ObjectType.
  */
  override def classType(): String = js.native


  /**
  * Returns the sketch point that defines the center of the hole.
  */
  val sketchPoint: SketchPoint = js.native
}
/** 
  * Provides positioning information for a hole that is positioned by a sketch point. 
 */
@JSName("adsk.fusion.SketchPointHolePositionDefinition")
object SketchPointHolePositionDefinition extends js.Object {
  /**
  * Returns the sketch point that defines the center of the hole.
  */
  val sketchPoint: SketchPoint = js.native
}

  object SketchPointHolePositionDefinitionUtilities {
    // no toSeq

  }
       
