public class Task2 {

     //2. Посмотрите на код, и подумайте сколько разных типов
    // исключений вы тут сможете получить ?
    //Код на который нужно посмотреть:
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}


/*
1.   ArrayIndexOutOfBoundsException         int j = 0; j < 5; j++
2.   NumberFormatException                  int val = Integer.parseInt(arr[i][j])  Так как во входящем массиве могут быть символы
3.   NullPointerException                   Если входящий массив: String[][] arr = null

 */



