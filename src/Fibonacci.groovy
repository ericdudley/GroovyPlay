static/* public by default */ void main(String... args) // ... Variable arguments
{
	if(args.length != 1){
		System.err.println('''Usage: groovy Fibonacci.groovy n
	n - Length of sequence to print out.''')
		System.exit(1)
	}
	BigInteger a = 0 // BigInteger for when numbers get huge
	BigInteger b = 1
	BigInteger c = 0
	for(def i=0; i<(args[0] as int); i++){ // as int coercion
		c = a + b
		a = b
		b = c
		println "[${i+1}] $c" // GString interpolation
	}
}
