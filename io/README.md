##1. The File class
#### A directory lister
#### Directory utilities
#### Checking for and creating directories

##2. Input and output
- Everything derived from the **InputStream** or **Reader** classes has basic methods called **read()** for reading
a single byte or array of bytes.
- __ **OutputStream** or **Writer** __ **write()**
#### Type of InputStream
1. An array of bytes. **ByteArrayInputStream**
2. A String object. **StringBufferInputStrream**
3. A file. **FileInputStream**
4. A "pipe," **PipedInputStream**
5. A sequence of other streams **SequenceInputStream**
6. Other
#### Type of OutputStream
1. An array of bytes **ByteArrayOutputStream**
2. A file **FileOutputStream**
3. A pipe **PipedOutputStream**
#### Adding attributes and useful interfaces
- the abstract "filter" class is the base class for all the decorators.
- decorator must have same interface as the object it decorates, but can extend the interface*
- **FilterInputStream** and **FilterOutputStream**
#### Reading from InputStream with FilterInputStream
1. **DataInputStream** (read primitive data and String object)
2. **BufferedInputStream** (use buffer)
3. **LineNumberInputStream** (keep track line)
4. **PushbackInputStream** (push back a single char)
#### Writing to an OutputStream with FilterOutputStream
1. **DataOutputStream** (like datainputstream)
2. **PrintStream** (provide formated)
3. **BufferedOutputStream** (use buffer)

##3. Reader and Writer
- **InputStream** and **OutputStream** provide in the form of byte0oriented I/O
- provide Unicode-compliant, character-based I/O
- Adapter class **InputStreamReader** and **OutputStreamReader**

Sources and sink
1. **InputStream** - **Reader**
2. **OutputStream** - **Writer**
3. **FileInputStream** - **FileReader**
4. **FileOutputStream** - **FileWriter**
5. **StringBufferlnputStream** **StringReader**
6. no corresponding class - **StringWriter**
7. **ByteArrayInputStream** - **CharArrayReader**
8. **ByteArrayOutputStream** - **CharArrayWriter**
9. **PipedInputStream** - **PipedReader**
10. **PipedOutputStream** - **PipedWriter**

Modifying stream behavior
1. **FilterInputStream** - **FilterReader**
2. **FilterOutputStream** - **FilterWriter**
3. **BufferedInputStream** - **BufferedReader**
4. **BufferedOutputStream** - **BufferedWriter**
5. **DataInputStream** - **DataInputStream**
6. **PrintStream** - **PrintWriter**
7. **LineNumberInputStream** - **LineNumberReader**
8. **StreamTokenizer** - **StreamTokenizer**
9. **PushbacklnputStream** - **PushbackReader**

##4. Typical uses of I/O streams
#### Buffered input file
#### Input from memory
#### Formatted memory input
#### Basic file output
#### Storing and recovering data

##5. File reading & writing utilities

##6. Standard I/O
#### Reading from standard input
```
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
stdin.readLine()
```
#### Changing System.out to a PrintWriter
```
PrintWriter out = new PrintWriter(System.out, true);
out.print("hello world")
```

##7. Process control
##8. New I/O
##9. Compression
##10. Object serialization
##11. XML
##12. Preferences
##13. Summary