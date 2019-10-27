# Test-Java
Many examples in Java for the exam
<br />
## Three ways to overload a method
### 1. Number of parameters.

```java
add(int, int)
add(int, int, int)
```
### 2. Data type of parameters.

```java
add(int, int)
add(int, float)
````
### 3. Sequence of Data type of parameters.

```java
add(int, float)
add(float, int)
```
<br />
### Invalid case of method overloading
When I say argument list, I am not talking about return type of the method, for example if two methods have same name, same parameters and have different return type, then this is not a valid method overloading example. This will throw compilation error.

```java
int add(int, int)
float add(int, int)
```

## Static Değişkenler

```java
class Student{
int rollno;
String name;
String college="ITS";
}
```

Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created. All students have its unique rollnoand name, so instance data member is good in such case. Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.
<br />

## Static Metodlar
1. A static method belongs to the class rather thanobjectof a class.
2. A static method invoked without the need for creating an instance of a class.
3. static method can access static data member and can change the value of it.
<br />

### An important example

```java
class B{
    int xB=10;
    B(){
        metodB();
        System.out.println("B nin constr. calisti");}
    void metodB(){
        System.out.println("metodB:"+xB); 
    }
}
class C extends B {
    int xC=1;
    int xB=4;
    C() {
       System.out.println("C nin constr. calisti");
    }
    void metodC(){
       System.out.println("metodC");
    }
    @Override
    void metodB() {
       super.metodB();
       System.out.println("C sınıfındaki metodB:"+super.xB);
    }
}
public class Test{
    public static void main(String args[]) {
        B b=new B();
        C c=new C();
        System.out.println(b.xB);
        b.metodB();
        System.out.println(c.xB);
        c.metodB();
    }
}
```

### OUTPUT

```
metodB:10
B nin constr. calisti
metodB:10
C sınıfındaki metodB:10
B nin constr. calisti
C nin constr. calisti
10
metodB:10
4
metodB:10
C sınıfındaki metodB:10
```
