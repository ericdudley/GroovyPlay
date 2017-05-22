/**
 * Project Euler Problem 34 solution in Groovy.
 * @author Eric Dudley
 */

Integer.metaClass.fact = {
  if(delegate == 0){
    return 1
  }
  answer = 1
  for(i in 1..delegate){
    answer *= i
  }
  answer
}

def answer = 0
for(i in 3..100000){
  def sum = (i as String).inject(0){result, j ->
    result + (j as Integer).fact()
  }
  if(sum == i){
    answer += i
    println i
  }
}
println "Answer: ${answer}"
