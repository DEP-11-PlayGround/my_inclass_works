public class Demo6 {
    public static void main(String[] args) {
        float myFloat = 2.23f;
        myFloat = myFloat++;
        System.out.println(myFloat);
        System.out.println(--myFloat);

        byte myByte = 5;
        myByte = (byte) ~myByte;
        
// you cn use the bitwise complement operator only with integer data types
        float myFloat2 = 5.25f;
        // myFloat = (float) ~myFloat;
       
        System.out.println(~myFloat2);
    }
    
}
