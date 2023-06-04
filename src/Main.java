public class Main {
    public static void main(String[] args) {
        System.out.println(permission(21, 22));
        System.out.println(permission(17, 25));
        System.out.println(permission(22, 30));
        System.out.println(permission(41, 12));
        System.out.println(permission(16, 28));
    }



    public static String permission(int age, int temperature){
        if(age<45 && age>20 && temperature>-20 && temperature>25){
            return "Можно идти гулять";
        } else if ((age<20 && age>15)&& (temperature>0 &&temperature<28)) {
            return "Можно идти гулять";
        } else if (age>=45 && temperature>-10 && temperature<25) {
            return "Можно идти гулять";
        } else;
            return "Оставайтесь дома";

    }
}