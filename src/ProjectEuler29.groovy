/**
 * Project Euler Problem 29 solution in Groovy.
 * @author Eric Dudley
 */

arange = [
  min: 2,
  max: 100
]

brange = [
  min: 2,
  max: 100
]

Set<BigInteger> distinct = new TreeSet()

for(i in arange.min..arange.max){
  for(j in brange.min..brange.max){
    distinct << (i**j as BigInteger)
  }
}

println distinct.size()
