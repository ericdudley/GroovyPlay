/**
 * Project Euler Problem 36 solution in Groovy.
 * @author Eric Dudley
 */

String.metaClass.isPalindromic = {
  def i = 0
  def j = delegate.size()-1
  while(i <= j)
    if(delegate[i++] != delegate[j--])
      return false
  true
}

sum = 0
for(i in 1..1000000){
  if((i as String).isPalindromic() && Integer.toBinaryString(i).isPalindromic())
    sum += i
}
println sum
