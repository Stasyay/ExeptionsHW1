
//1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения:
public class Task1 {

    public static void main(String[] args) {

        //№1
//        metodOne();

       //№2
//        metodTwo();

        //№3
//        metodThree();

        //#4
        metodFour();

    }

    //№1
    public static int metodOne() {
        return 10/0;
    }

    //№2
    public static int metodTwo() {
        int[] array = new int[] {1,2,3};
        return array[array.length];
    }

     public static int metodThree() {
        int [] array = null;
        return array.length;
    }
    public static Integer metodFour() {
        return Integer.parseInt("568kk");
    }

}
