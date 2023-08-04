public class Demo9 {
public static void main(String[] args) {
    
    String myStr1 = "Hello";
    String myStr2 = "java";
    int myInt = 20;
    int myInt2 = 23;
    char myChar = '!';
    

    System.out.println(myInt + myInt2);
    System.out.println(myInt + myInt2 + myChar); //add the value of ! too
    System.out.println("" + myInt + myInt2); //"" is a string so all behave as concatenation operators
    System.out.println(myInt + myInt2 + ""); // calculation happen left to right.
    System.out.println("" + ( myInt + myInt2 + myChar )); 

    String myStr = myStr1 + " " + myStr2 + " " + myInt + myInt2 + myChar ;
    System.out.println( myStr);

    

}    
}
