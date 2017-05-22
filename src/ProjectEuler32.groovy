/**
 * Project Euler Problem 32 solution in Groovy.
 * @author Eric Dudley
 */

String.metaClass.pandigital = {
  set = [] as HashSet
  isPandigital = true
  delegate.each{
    if(set.contains(it) || it == "0")
      isPandigital = false
    else
      set << it
  }
  isPandigital && set.size() == 9
}

Set nums = [] as HashSet

for(i in 2..999){
  for(j in i..(999/i)*999){
    product = i * j
    gstr = "$i$j$product"
    if(gstr.pandigital()){
      nums << product
      println "$i * $j = $product"
    }

  }
}

println nums.sum()
