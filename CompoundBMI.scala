// Atom: Compound Expression
// CompoundBMI.scala
val lbs = 150.0
val height = 68.0
var idealWeight = 0.0
val weightStatus:Unit = {
    val bmi = lbs /  (height * height) * 703.07
    if (bmi < 18.5) { "Underweight" }
    else if (bmi < 25) { "Normal Weight" }
    else if (bmi == 22) { idealWeight = bmi * (height * height) / 703.07}
    else { "Overweight" }
}
println(weightStatus)
if (idealWeight != 0) {
    println(idealWeight)
}