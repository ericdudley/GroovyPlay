/**
 * Project Euler Problem 31 solution in Groovy.
 * @author Eric Dudley
 */

def recursive(total, curr_coin) // Total left, Index in coins array.
{
  if(total == 0)
    return 1
  sum = 0
  for(i in curr_coin..0)
    if(total >= coins[i])
      sum += recursive(total - coins[i], i)
  return sum
}
coins = [1,2,5,10,20,50,100,200]
println recursive(200, coins.size()-1)
