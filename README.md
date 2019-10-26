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
