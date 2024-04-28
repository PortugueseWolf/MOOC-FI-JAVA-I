
# ABC

Let's practice creating and inheriting classes.

## Part 1 - Creating classes

Create the following three classes:

- Class A. Class should have no object variables nor should you specify a constructor for it. It only has the method public void a(), which prints a string "A".
- Class B. Class should have no object variables nor should you specify a constructor for it. It only has the method public void b(), which prints a string "B".
- Class C. Class should have no object variables nor should you specify a constructor for it. It only has the method public void c(), which prints a string "C".

```java
A a = new A();
B b = new B();
C c = new C();

a.a();
b.b();
c.c();
```

```markdown
A
B
C
```

## Part 2 - Class Inheritance

Modify the classes so that class B inherits class A, and class C inherits class B. In other words, class A will be a superclass for class B, and class B will be a superclass for class C.

```java
C c = new C();

c.a();
c.b();
c.c();
```

```markdown
A
B
C
```
