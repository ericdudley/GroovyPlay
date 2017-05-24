/**
 * Project Euler Problem 37 solution in Groovy.
 * @author Eric Dudley
 */

def isPrime(i) {
  if(i == 2)
    return true
  return (2..Math.sqrt(i)).every { i % it != 0 }
}

sum = 0
for(i in 8..1000000){
  if(i % 1000000 == 0)
    println "At: $i"
  s = i as String
  truncatable = true
  for(j in 1..s.size()){
    if(!isPrime((s.substring(s.size()-j,s.size())) as Integer) ||
     !isPrime((s.substring(0,j)) as Integer)){
      truncatable = false
      break
    }
  }
  if(truncatable){
    println i
    sum += i
  }
}
println "Final answer: $sum"
