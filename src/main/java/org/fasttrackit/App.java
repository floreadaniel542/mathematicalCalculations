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
        problem1.a = 40;
        problem1.b = 20 ;

        System.out.println(problem1.name1 + " give " + problem1.a + " egg " + " to " + problem1.name2 + " she have "
                + problem1.b + " the total is ?");


        Solution solution = new Solution();
        solution.solutionName = "Inmultire";

        solution.multiplication(problem1.a,problem1.b);
        solution.down(problem1.a,problem1.b);
        solution.division(problem1.a,problem1.b);
        solution.gathering(problem1.a,problem1.b);




    }


}
