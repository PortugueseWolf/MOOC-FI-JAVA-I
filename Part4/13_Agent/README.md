
# Agent

The exercise template defines an Agent class, having a first name and last name. A print method is defined for the class that creates the following string representation.

```java
Agent bond = new Agent("James", "Bond");
bond.print();
```

Sample output

```markdown
My name is Bond, James Bond
```

Remove the class' print method, and create a public String toString() method for it, which returns the string representation shown above.

The class should function as follows.

```java
Agent bond = new Agent("James", "Bond");

bond.toString(); // prints nothing
System.out.println(bond);

Agent ionic = new Agent("Ionic", "Bond");
System.out.println(ionic);
```

Sample output

```markdown
My name is Bond, James Bond
My name is Bond, Ionic Bond
```
