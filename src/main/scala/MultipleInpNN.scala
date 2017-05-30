object MultipleInpNN {
def neural_network(myWeights: Array[Double], myInputs: Array[Double]): Double = {
val myPairs = myWeights zip myInputs
val myPairProd = for (p <- myPairs) yield {p._1 * p._2}
val dotProduct = myPairProd.sum
dotProduct
}
}
