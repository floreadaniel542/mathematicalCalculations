package org.fasttrackit;

public class Problem extends Solution {

   double a;
   double b;
   String name1;
   String name2;

    Problem() {
         a = 14;
         b = 4;
         name1 = " Cosmin ";
         name2 = " Maria ";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Problem{" +
                "a=" + a +
                ", b=" + b +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
