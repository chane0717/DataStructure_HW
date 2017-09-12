// file TestOverload.java

class A {  }

class B extends A {}

class C extends B {}

public class TestOverload {
public static void show(A O) { System.out.println("A"); }
public static void show(B O) { System.out.println("B"); }
public static void show(int O) { System.out.println(O); }
public static void show(String O) { System.out.println(O); }

public static void main(String args[]) {
  A X = new A();
  B Y = new B();
  C Z = new C();
  show(X);        // Prints "A"
  show(Y);        // Prints "B"
  show(Z);        // Prints "B" -- most specific match
  X = Y;
  show(X);        // Prints "A" -- uses static type, not dynamic.
  show(5+7);
  show("Data Structures");
} }  // end TestOverload
  
