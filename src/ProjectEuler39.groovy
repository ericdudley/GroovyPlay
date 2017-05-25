/**
 * Project Euler Problem 39 solution in Groovy.
 * @author Eric Dudley
 */

max = 0
maxcount = 0
for(i in 1..1000){
  count = 0
  for(c in 1..i)
    for(a in 1..c){
        b = i - a - c
        if(a + b + c == i &&
           a + b > c && b + c > a && a + c > b &&
           b == Math.sqrt(c**2 - a**2))
          count++
    }
  if(count >= maxcount){
    println i
    maxcount = count
    max = i
  }
}
println "Max: $max"
