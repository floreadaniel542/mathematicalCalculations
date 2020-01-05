package org.fasttrackit;

public class Solution  {

     String solutionName;

    Solution(){
        solutionName = " Ecuation ";
    }

    public double multiplication(double a,double b) {

        double result = a * b;

        System.out.println("Result is : " + result  );


       return result ;
    }

    public double division (double a,double b) {

        double result = a / b;

        System.out.println("Result is : " + result  );


        return result ;
    }



    public double down (double a,double b) {

        double result = a - b;

        System.out.println("Result is : " + result  );


        return result ;
    }
    public double gathering(double a,double b) {

        double result = a + b;

        System.out.println("Result is : " + result  );


        return result ;
    }

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "solutionName='" + solutionName + '\'' +
                '}';
    }
}
