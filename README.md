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

# Static Değişkenler

```java
classStudent{
introllno;
Stringname;
Stringcollege="ITS";
}
```

Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created. All students have its unique rollnoand name, so instance data member is good in such case. Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.
