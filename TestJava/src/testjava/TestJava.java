/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maen
 */

class GradeBook
{
    private String name;
    private double sum,grade,average;
    private int count;
  
    public GradeBook (String name)
    {
         this.name = name;
    }

    public void setName(String name)
    {
         this.name = name;
    }

    public String getName() 
    {
         return name;
    }

    public String displayMessage()
    {
        String S = "Total of the " + count + 
                  "grades entered is " + sum + "\n";
        S += "Class average is " + average;
        return S;
    }

    public double determineClassAverage()
    {
        while (grade != -1)
        {
            Scanner scan = new Scanner (System.in);
            System.out.print("Enter grade or -1 to quit: ");
            grade = scan.nextDouble();
            if (grade != -1) {
                sum += grade;
                count++; }
        }
        average = sum / count;
        return average;
    }
}

class deneme{
    public static int kare(int x){
      return x*x;
    }
}

// An exam question
class Base {
    int a = 1;
    void foo (){System.out.println("Base's print "+a);}
}
class Derived extends Base{
    int a = 2;
    @Override
    void foo(){
        //super.foo();
        System.out.println("Derived's print "+a);
    }
}
class Derived2 extends Derived{
    int a = 3;
    @Override
    void foo(){
        //super.foo();
        System.out.println("Derived2's print "+a);
        super.foo();
    }
}

class Test{
    int a;
    int b;
    Test(int i, int j){
        a=i;
        b=j;
    }
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}

// A nice question
class A{
    int xA=2;
    A(int i, int j){
        System.out.println("l:"+i+"ve"+j);
    }
    A(int i){
        this();
        System.out.println("2:"+i);
    }
    A(){
        System.out.println("3");
        this.metodA();
    }
    void metodA(){
        System.out.println("4:"+xA);
    }
}
class B1 extends A{
    int xB=12;
    B1(int m, int n){
        this(m,n,10);
        System.out.println("5:"+m+" ve "+n);
    }
    B1(int m){
        super(m);
        System.out.println("6:"+m);
    }
    B1(int m, int n, int k){
        super();
        System.out.println("7:"+m+" "+n+" ve"+k);        
    }
    @Override
    void metodA(){
        System.out.println("8:"+super.xA);
        super.metodA();
    }
}


public class TestJava {

    /**
     * @param args the command line arguments
     */
    
    
    /*static  String name = "cat";
    void TestJava(){
        name = "dog";
    }*/        
    // field that is accessible to all methods of this class
    //static int x = 1;  
    
    /*int x=6;
    public TestJava(){
        System.out.print("Hello ");
    }
    public TestJava(int y){
        this();
        int x=9;
        System.out.print("x:"+this.x);
    }*/
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TestJava a = new TestJava(3);       
        
        //for class A and B1
        /*A a = new A(5);
        System.out.println("a yaratildi");
        B1 b = new B1(1, 2);
        System.out.println("b yaratildi");
        b.metodA();*/
                
        //method();
        
        // Test Class
        /*Test obj = new Test(10, 20);
        obj.meth(obj);
        System.out.println(obj.a+" "+obj.b);*/
        
        /*Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter number 1 : ");       
        number1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        number2 = input.nextInt();
        
        if (number1 == number2)
            System.err.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.err.printf("%d != %d\n", number1, number2);*/
        
        // Prefix and Postfix increment
        /*int c;
        c = 5;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);        
        c = 5;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);   */
        
        
        //The program takes the Grades of the students in the class till the user enters -1 to quit
        /*double grade = 0; double sum = 0; int count = 0;
        GradeBook grd1 = new GradeBook("Csc 243 Introduction to Object Oriented Programming");
   
        System.out.println("Welcome to the Grade book for ");
        System.out.println(grd1.getName());
        System.out.println();
        grd1.determineClassAverage();
        System.out.println();
        System.out.println(grd1.displayMessage());*/
        
        // Getting Random numbers
        /*Random randomNumber = new Random();
        int face;
        for (int counter =1; counter<=20; counter++){
            face = 1 + randomNumber.nextInt(6);
            
            System.out.printf("%d ", face);
            if (counter % 5 == 0)
                System.out.println();
        }*/
        
        /*int x = 5; // method's local variable x shadows field x

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); // useLocalVariable has local x
        useField(); // useField uses class Scope's field x

        System.out.printf("%nlocal x in main is %d%n", x);*/
        
        // Try static method
        //System.out.println("Square of 5 = " + deneme.kare(5));
        
        /*Derived2 derived2 = new Derived2();
        derived2.foo();*/
        
        // Which ones have error
        /*float[] f = new float(3);  //error
        float f2[] = new float[ ]; //error
        float[]f1 = new float[3];
        float f3[] = new float[3];
        float f5[] = {1.0f, 2.0f, 2.0f};*/
        
        
    }
    
    // void to Constructor is a ne method not a constructor
    /*public static void method(){
        TestJava animal = new TestJava();
        System.out.println("Pet "+animal.name);        
        animal.TestJava();
        System.out.println("Pet "+animal.name);
    }*/
    
    /*
    // create and initialize local variable x during each call
    public static void useLocalVariable() {
        int x = 25; // initialized each time useLocalVariable is called

        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n",
            x);
        ++x; // modifies this method's local variable x
        System.out.printf("local x before exiting method useLocalVariable is %d%n",
            x);
    }

    // modify class Scope's field x during each call
    public static void useField() {
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 10; // modifies class Scope's field x
        System.out.printf("field x before exiting method useField is %d%n", x);
    }
    */
}
