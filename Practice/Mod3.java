// method with parameter with return type
public class Mod3 {
    static int modNumber(int num1, int num2){
        int result = num1 % num2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(modNumber(205, 30));
    }
}
