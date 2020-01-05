package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Problem problem1 = new Problem();
        problem1.name1 = "Cosmin ";
        problem1.name2 = "Maria";
        problem1.a = 45.3;
        problem1.b = -21.4 ;

        System.out.println(problem1.getName1() + " give " + problem1.getA() + " egg " + " to " + problem1.getName2() +
                " she have " + problem1.getB() + " the total is ?");


        Solution solution = new Solution();
        solution.solutionName = "Inmultire";

        solution.multiplication(problem1.getA(),problem1.getB());
        solution.down(problem1.getA(),problem1.getB());
        solution.division(problem1.getA(),problem1.getB());
        solution.gathering(problem1.getA(),problem1.getB());




    }


}
