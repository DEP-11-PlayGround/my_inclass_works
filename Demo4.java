public class Demo4 {
    public static void main(String[] args) {
        byte myByte = 10; //00001010
        int myInt = ~myByte; //1111 0101
        //byte myByte2 =~myByte; gives error because myByte become int

        System.out.println(Integer.toBinaryString(myInt));

        byte myByte2 = -5;
        myByte2 = (byte) ~myByte2;
        int result = myByte2++ + ~++myByte2;
        System.out.printf( "result=%s, myByte=%s \n", result, myByte2);
    }
}
