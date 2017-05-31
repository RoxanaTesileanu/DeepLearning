object MultipleInpNN {
def neural_network(myWeights: Array[Double], myInputs: Array[Double]): Double = {
val myPairs = myWeights zip myInputs
val myPairProd = for (p <- myPairs) yield {p._1 * p._2}
val dotProduct = myPairProd.sum
dotProduct
}

val myW = Array(0.1, 0.2, 0)
val myI = Array(8.5, 0.65, 1.2)
val myPred = neural_network(myW, myI)

def arrayOp(myWeights : Array[Double], myInputs : Array[Double],
f: (Double, Double) => Double) = {
val myPairs = myWeights zip myInputs
val myOp = for (p <- myPairs) yield {f(p._1, p._2)}
myOp
}

val elementwiseAddition = arrayOp(myW, myI, _ + _)

val elementwiseMultiplication = arrayOp(myW, myI, _ * _)

}
