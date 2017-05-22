/**
 * Project Euler Problem 33 solution in Groovy.
 * @author Eric Dudley
 */

class Fraction
{
  int n
  int d

  int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }

  @Override
  boolean equals(Object other)
  {
    Fraction f = other as Fraction
    n == f.n && d == f.d
  }

  boolean equivalent(Fraction f)
  {
    n * f.d == d * f.n
  }

  Fraction digitCancel()
  {
    def ns = n as String
    def ds = d as String
    for(i in 0..ns.size()-1){
      if(ds.contains(ns[i])){
        ds = ds.replaceFirst(ns[i], "")
        ns = ns.replaceFirst(ns[i], "")
        break
      }
    }
    new Fraction(n: ns as Integer, d: ds as Integer)
  }

  void reduce()
  {
    def gcd = GCD(n, d)
    n /= gcd
    d /= gcd
  }

  Fraction plus(Fraction f)
  {
    def n1 = n * f.d
    def d1 = d * f.d
    def n2 = f.n * d
    Fraction rf = new Fraction(n: n1 + n2, d: d1)
    rf.reduce()
    rf
  }

  Fraction multiply(Fraction f)
  {
    Fraction rf = new Fraction(n: n * f.n, d: d * f.d)
    rf.reduce()
    rf
  }

  @Override
  String toString()
  {
    "$n / $d"
  }
}

def fracs = []
for(i in 10..99)
  for(j = i + 1; j < 100; j++){
    Fraction f = new Fraction(n: i, d: j);
    Fraction f2 = f.digitCancel();
    if(f.equivalent(f2) && f != f2 && f.n % 10 != 0){
      fracs << f
      println f
    }
  }

println fracs.inject(new Fraction(n: 1, d: 1)){result, i -> result * i}
