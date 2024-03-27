package week11;

public class _02_Methods {


    public static void main(String[] args) {
        System.out.println(TriangleArea(5, 10));
        //System.out.println(SquareArea(4));
    }

    public static int TriangleArea(int base, int height){
        return (base * height) / 2;
    }

    public static int SquareArea(int side){
        return (int) Math.pow(side, 2);
    }

}
