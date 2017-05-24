/**
 * Project Euler Problem 35 solution in Groovy.
 * @author Eric Dudley
 */

def isPrime(i) { (2..Math.sqrt(i)).every { i % it != 0 } }

String.metaClass.leftShift = {num ->
  rot = num % delegate.size()
  delegate.substring(rot,delegate.size()) + delegate.substring(0,rot)
}

count = 0
for(i in 1..1000000){
  if(i % 100000 == 0)
    println "At: $i"
  def s = i as String
  circular = true
  for(j in 0..s.size()){
    if(!isPrime(s as Integer)){
      circular = false
      break
    }
    s = s << 1
  }
  if(circular){
    count++
    println i
  }
}
println count
