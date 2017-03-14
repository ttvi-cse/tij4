#Reusing class
- Two accomlist:
    + Composition
    - Inheritance
## Composing syntax
If you want the references
initialized, you can do it:
1. **At the point the objects are defined**. This means that they’ll always be initialized
before the constructor is called.
2. **In the constructor** for that class.
3. Right before you actually need to use the object. This is often called **lazy
initialization**. It can reduce overhead in situations where object creation is expensive
and the object doesn’t need to be created every time.
4. Using **instance initialization**.
## Inheritance syntax
#### Initializing the base class
#### Constructors with arguments
