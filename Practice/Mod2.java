// method with parameter without return type
public class Mod2 {
    static void modNumber(int num1, int num2){
        int result = num1 % num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        modNumber(105, 20);
    }
}
