/* Using the Breeze Linear Algebra Cheat Sheet 
https://github.com/scalanlp/breeze/wiki/Linear-Algebra-Cheat-Sheet
(after updating the dependencies in build.sbt to add the breeze library)
*/

import breeze.linalg._
import breeze.numerics._

// zero matrix of the form: a(2,3) 
val myZeros = DenseMatrix.zeros[Double](2,3)

// zero vector of length n
val myZeroVector= DenseVector.zeros[Double](3)

//vector of ones of length n
val myOnesVector= DenseVector.ones[Double](5)

// vector of a particular value x of lenght n 

val myFivesVector= DenseVector.fill(3){5.0}

// vector covering a range (from x to but not icluding y with given stepsize n)

val range3To11Vector = DenseVector.range(3, 11, 1)

// vector covering a range (from x to but not including y) with a given length n 

val range3To11Length15 = linspace(3,11,15) //similar to gnuplot

// identity matrix I(n,n)

val myI= DenseMatrix.eye[Double](4)

// diagonal matrix 

val diagMatrix = diag(DenseVector(1.0, 2.0, 3.0))

// matrix inline creation (each row within its own parantheses)

val myMatrix = DenseMatrix((1.0, 2.0), (3.0, 4.0))

// column vector inline creation

val colVector = DenseVector(1,2,3,4)

//row column inline creation (the transposed column vector)

val rowVector = DenseVector(1,2,3,4).t

//vector from function

val vectorFromFunc = DenseVector.tabulate(3){i => 2*i} // creates DenseVector(0, 2, 4)

//matrix from function  

val matrixFromFunc = DenseMatrix.tabulate(4,2){  // creates a(4,2)
case (i,j) => i+j
}

//vector creation from array

val vectFromArray = new DenseVector(Array(1,2,3,4))

// matrix creation form array

val matrixFromArr = new DenseMatrix(2,3, Array(11,21,12,22,31,32))


 

 













