/**
 * Project Euler Problem 40 solution in Groovy.
 * @author Eric Dudley
 */
champ = new StringBuilder()
j = 1
while(champ.length() < 1000000){
  champ.append(j)
  j++
}
prod = 1
for(i in 0..6){
  prod *= Character.getNumericValue(champ.charAt(10**i - 1))
}
println "Prod: $prod"
