/**
 * Project Euler Problem 30 solution in Groovy.
 * @author Eric Dudley
 */

pow = 5
max = 10000000
sum = 0
for(i in 2..max){ // Start at 2
  mysum = 0
  (i as String).each({ // Each character
    mysum += (it as Integer)**pow
  })
  sum += mysum == i ? i : 0
}
println "Sum is: $sum"
