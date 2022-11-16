### Exercise 1 :- Write a program which will calculate a interest on the assets

1. Declares a higher-order function.Additionally, it takes another function operation as a parameter. The operation parameters and return type are also defined in the declaration.
2. The higher order function returns the result of operation invocation with the supplied arguments.
3. Declares a function that matches the operationsignature.
4. Invokes the higher-order function passing the paramters.
5. Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?

```
public class JavaExample {

    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
    public static void main(String args[]) {
    	JavaExample obj = new JavaExample();
    	obj.calculate(2000, 5, .08, 12);
    }
}

```
