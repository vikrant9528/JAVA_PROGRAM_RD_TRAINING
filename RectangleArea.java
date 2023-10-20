import java.util.*;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        float len = sc.nextFloat();
        System.out.println("enter the width");
        float wid = sc.nextFloat();
        float area = (len*wid);
        System.out.println("the area is" + area);
        sc.close();
    }
    
}

