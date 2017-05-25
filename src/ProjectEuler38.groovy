/**
 * Project Euler Problem 38 solution in Groovy.
 * @author Eric Dudley
 */

max = 0
maxmult = 0
for(i in 1..10000){
  Set nums = [1,2,3,4,5,6,7,8,9] as HashSet
  mult = 0
  length = 0
  for(j in 1..4){
    num = i * j
    str = num as String
    length += str.size()
    for(ch in str){
      nums.remove(Integer.valueOf(ch as Integer))
    }
    if(nums.size() == 0){
      mult = j
      break
    }
  }
  if(nums.size() == 0 && mult > 1 && length == 9){
    println "Valid: $i"
    if(i >= max){
      max = i
      maxmult = mult
    }
  }
}
println "Max: $max"
for(i in 1..maxmult){
  println "$max * $i = ${max * i}"
}
