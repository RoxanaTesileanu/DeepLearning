/* working through the notes of D. J Wilkinson (2017): "Statistical Computing with Scala - A functional approach to data science", https://github.com/darrenjw/scala-course, ch. 4, Scala Breeze
*/

import breeze.stats.distributions._

object IntroBreeze {
val poi = Poisson(3.0)

val x = poi.sample(10) 
val pmfXs = x map {poi.probabilityOf(_)}

val gau = Gaussian(0.0, 1.0)

val y = gau.sample(20)

val logPdfYs= y map { gau.logPdf(_)}



}
