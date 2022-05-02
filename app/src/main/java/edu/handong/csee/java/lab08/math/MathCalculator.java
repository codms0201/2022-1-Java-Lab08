package edu.handong.csee.java.lab08.math;

public class MathCalculator {
	/**
	 * This is a class of MathCalculator that creates methods of Math
	 */
	    private String name;
	    
	    /**
	     *  This method of asking user's name
	     */
	    public void setName(String name){
	        this.name = name;
	    }

	    /**
	     * This is method of showing name that you entered
	     * @return name that you get from terminal which is user of this claculator
	     */
	    public String getName(){
	        return name;
	    }
	    /**
	     * This is a method of calculator that finding the bigger number between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return more big one between a and b
	     */
	    public int getMax(int a, int b){
	        if (a>b) return a;
	        else return b;

	    }

	    /**
	     * This is a method of calculator that finding the smaller number between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return smaller one between a and b
	     */
	    public int getMin(int a, int b){
	        if (a>b) return b;
	        else return a;

	    }

	    /**
	     * This is a method of calculator that finding the absolute value
	     * @param x The number of variables to enter
	     * @return an absolute value of x
	     */
	    public int getAbs(int x){
	        if (x>0) return x;
	        else return -x;


	    }

	    /**
	     * This is a method of calculator that finding sum of between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return sum of a and b
	     */
	    public int getSum(int a, int b){
	        return a+b;

	    }

	    /**
	     * This is a method of calculator that finding difference between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return difference of a and b
	     */
	    public int getDiff(int a, int b){
	        if (a>b) return a-b;
	        else return b-a;

	    }

	    /**
	     * This is a method of calculator that finding product of between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return multiplication of a and b
	     */
	    public int getProduct(int a, int b){
	        return a*b;

	    }

	    /**
	     * This is a method of calculator that finding Quotient between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return a share of division between a and b
	     */
	    public int getQuotient(int a, int b){
	        return a/b;
	        
	    }

	    /**
	     * This is a method of calculator that finding Remainder between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return a remainder of division between a and b
	     */
	    public int getRemainder(int a, int b){
	        return a%b;

	    }

	    /**
	     * This is a method of calculator that finding Power between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return power of a
	     */
	    public int getPower(int a, int b){
	        double result = Math.pow(a, b);
	        return (int) result; 

	    }

	    /**
	     * This is a method of calculator that finding Factorial of number
	     * @param a The number of variables to enter
	     * @return factorial of a
	     */
	    public int getFactorial(int a){
	        int sum =1;
	        for (int i=a; i>=1; i--){
	            sum *= i;
	        }
	        return sum;

	    }

	    /**
	     * This is a method of calculator that finding Gcd between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return maximum commitment number between a and b
	     */
	    public int getGcd(int a, int b){
	       if (a%b == 0){
	           return b;
	       }
	       return getGcd(b, a%b);
	    }

	    /**
	     * This is a method of calculator that finding Lcm between two numbers
	     * @param a The first number of variables to enter
	     * @param b The second number of variables to enter
	     * @return minimum common multiple between a and b
	     */
	    public int getLcm(int a, int b){
	        return a*b/getGcd(a, b);
	    }

	    /**
	     * This is a method of calculator that finding square of number
	     * @param a The number of variables to enter
	     * @return a square root of a
	     */
	    public int getSquare(int a){
	        double result = Math.sqrt(a);
	        return (int) result;
	        
	    }

	    


}
