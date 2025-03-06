package java_repo;
/*
 * Java is Platform Independent
 * c is Platform Dependent
 * Window(os) -> Hello.c -> checking the syntax + checking the semantics -> Generate .exe file (NAtive code) This is platform dependent
 * compiler is platform dependent
 * Window(os) -> Hello.java -> java compiler (javac = checking the syntax + checking the semantics) -> Generate .byte code -> Hello.class (Byte code) 
 * this byte code is platform independent
 * use JVM (Java Virtual Machine) to run the byte code
 * jvm = .jit (Just in time compiler) + Interpreter
 * Here, Hello.class is Platform Independent due to JVM
 * jvm is platform dependent
 * hello.class -> jvm -> Output Or Native Code (Platform Dependent)
 * c support static loading while java support dynamic loading
 * 
 * jvm vs jre vs jdk 
 * jdk = jre + Development tools
 * jre = jvm + Library
 * jvm = .jit + Interpreter
 * 
 * Window(os) -> Hello.c -> Compiler -> Hello.obj -> Linker -> Hello.exe -> Output
 * Window(os) -> Java Compiler -> Byte Code -> Java Virtual Machine -> Output
 * 
 * java compiler = javac.exe
 * jvm = java virtual machine = java.exe = jit + interpreter
 * jit read byte code and convert it into native code and use v table to run the code
 * interpreter is also program which read the byte code and convert it into native code line by line (slow  process)
 * 
 * installing process jdk 
 * open cmd
 * javac -version //javac
 * install jdk 
 * open cmd
 * java -version //java
 * 
 * setting path 2 way = temporary and permanent
 * temporary = In cmd -> set path = %path%;C:\Program Files\Java\jdk-15.0.1\bin
 * permanent = go to my computer -> properties -> advanced system settings -> environment variables -> system variables 
 * new -> path_name = path, path_value = %path%;C:\Program Files\Java\jdk-15.0.1\bin 
 * 
 * java language is case sensitive
 * Part =  character set , user defined words or identifiers, keywords, variables, constants, data types, literals , operators ,control statements, arrays, functions, classes, objects, packages, interfaces, annotations
 * 
 * Character set = alphabets, digits, special symbols, white spaces 
 * c flows ASCII character set so only 8 bit character set supported Only english language supported
 * java flows UNICODE character set so 16 bit character set supported (I18N) 
 * 
 * User defined words or identifiers = user defined names
 * Rules =
 * 1. A-Z, a-z, 0-9, _ , $
 * 2. First character should be a-z or A-Z or _ or $
 * 3. No white space
 * 4. No keyword
 * 5. No special symbol
 * 6. No length limit
 * 
 * conventions = camel case (first letter small and next word first letter capital)
 * class name should be start with capital letter
 * Method name should be start with small letter
 * variable name should be start with small letter
 * static final variable name should be in capital letter
 * 
 * 
 * 
 * Data types = boolean, byte, char, short, int, long, float, double
 * For allocating memory to the variable we use data types that how much memory we need to allocate
 * In data type 2 types = primitive data type and non primitive data type
 * Primitive data type = boolean, byte, char, short, int, long, float, double
 * User defined data type Or Non primitive data type = class, interface, array
 * 
 * boolean = 1 bit = true or false = false
 * byte = 1 byte = 8 bit = -128 to 127 = 0
 * char = 2 byte = 16 bit = 0 to 65535 = 'A' = blank space = 0
 * short = 2 byte = 16 bit = -2^15 to 2^15-1 = -32768 to 32767 = 0
 * int = 4 byte = 32 bit = -2^31 to 2^31-1 = -2147483648 to 2147483647 = 0
 * long = 8 byte = 64 bit = -2^63 to 2^63-1 = -9223372036854775808 to 9223372036854775807 = 0
 * float = 4 byte = 32 bit = 7 decimal digit = 1.2f = 0.0f
 * double = 8 byte = 64 bit = 15 decimal digit = 1.2 = 0.0
 * 
 * jshell = java shell = REPL = Read Evaluate Print Loop
 * byte b1
 * b1 = 10
 * b1
 * byte b2=128
 * b2
 * showing error because byte range is -128 to 127
 * 
 * keywords = Predefined words
 * 50 keywords = all are in small letter
 * 
 * | abstract   | assert     | boolean    | break      | byte       |
 * | case       | catch      | char       | class      | const      |
 * | continue   | default    | do         | double     | else       |
 * | enum       | extends    | final      | finally    | float      |
 * | for        | goto       | if         | implements | import     |
 * | instanceof | int        | interface  | long       | native     |
 * | new        | package    | private    | protected  | public     |
 * | return     | short      | static     | strictfp   | super      |
 * | switch     | synchronized | this     | throw      | throws     |
 * | transient  | try        | void       | volatile   | while      |
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

class Hello {
      int a=10;
      void show(){
            System.out.println("Hello World");

      }
}

public class basic {
      public static void main(String[] args) {
            System.out.println("Hello World");
            Hello obj = new Hello();
            obj.show();
            System.out.println(obj.a);
      }
}

class Student{
        int rollno;
        String name;
        void insertRecord(int r, String n){
                rollno = r;
                name = n;
        }
        void displayInformation(){
                System.out.println(rollno + " " + name);
        }


}

class Hello2{
   byte b1;
   short s1;
   int i1;
    long l1;
    float f1;
    double d1;
    char c1;
    boolean bl1;
    String str1;
    void show(){
          System.out.println("Hello World");
          System.out.println(b1);
          System.out.println(s1);
          System.out.println(i1);
          System.out.println(l1);
          System.out.println(f1);
          System.out.println(d1);
          System.out.println(c1);
          System.out.println(bl1);
          System.out.println(str1);
    }

}

class RunHello2{
      public static void main(String[] args) {
            Hello2 obj = new Hello2();
            obj.show();
      }
}      // RunHello2.java -> javac RunHello2.java -> java RunHello2



