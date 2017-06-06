/* working through the notes of D. J Wilkinson (2017): "Statistical Computing with Scala - A functional approach to data science", https://github.com/darrenjw/scala-course, ch. 4, Scala Breeze
*/

import breeze.stats.distributions._
import breeze.linalg._

object IntroBreeze {
val poi = Poisson(3.0)

val x = poi.sample(10) 
val pmfXs = x map {poi.probabilityOf(_)}

val gau = Gaussian(0.0, 1.0)

val y = gau.sample(20)

val logPdfYs= y map { gau.logPdf(_)}


val v= DenseVector(y.toArray) // create a Vector out of the sample
val exBitVect= v >:> 0.0 // returns the indexes of the elements for which the Boolean expression is true

val exBooleanResult = (v >:> 0.0).toArray //returns the Boolean result for each element of the array

val m = new DenseMatrix(5,4,linspace(1.0,20.0, 20).toArray) // the elements are arranged column-by-column


}
