# CompilerConstruction

Recursive descent is a top-down parsing technique that constructs the parse tree from the top and the input is read from left to right.

## Running the compiler

```
$javac recursiveParser/Recursive.java
```
Enter the selection sets after compiling the main class

```
S -> BD    {b,c} 
B -> bB    {b}
B -> c     {c}
D -> de    {d}
```
```
$java recursiveParser.Recursive bcde
 input = bcde
 Accept

if failed:
$java recursiveParser.Recursive bcd
 input = bcd
 Expecting "e"
 Reject
```

 Make sure you have java and javac installed

## License
[MIT](https://choosealicense.com/licenses/mit/)
