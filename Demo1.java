public class Demo1{
    public static void main(String[] args) {
        int x = 1;
        x++;
        System.out.println(x); //2
        
        ++x;
        System.out.println(x); //3

        System.out.println();

        int y = 1;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);

        //int a=10, b=5 // this is bad practice
        int a = 10;
        int b = 5;

        int result = a++ + a++ + b + b + ++a +b++;
        System.out.printf("result=%s, a=%s, b=%s \n", result, a, b);

        
        int result = ++x + ++y + x - y + x++ - --y;
        result = result + x++ + y--;
        result = x + result + y; 
        System.out.printf("result=%s, x=%s, y=%s \n", result, x, y);
    }
}