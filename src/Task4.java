/*      *4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
        каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
        Если длины массивов не равны, необходимо как-то оповестить пользователя.
        Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше. */

public class Task4 {

    public static void main(String[] args) {

        Integer[] arrayOne = new Integer[] {3,2,1};
        Integer[] arrayTwo = new Integer[] {1,2,3};
//        Integer[] arrayTwo = new Integer[] {1,2,0};
//        Integer[] arrayTwo = new Integer[] {1,2};
//        Integer[] arrayTwo = new Integer[] {};
//      Integer[] arrayTwo = null;

        print(differenceElement(arrayOne, arrayTwo));

    }


    public static Integer[] differenceElement(Integer[] arrayOne, Integer[] arrayTwo) {

        if (arrayOne == null) {
            throw new RuntimeException(String.format("arrayOne пуст (arrayOne == null)"));
        }

        if (arrayTwo.length == 0) {
            throw new RuntimeException(String.format("Длинна массива arrayTwo равна нулю"));
        }

        if (arrayOne.length != arrayTwo.length) {
            throw new RuntimeException(String.format("\nМассивы имеют разную длину: \n" +
                            "Длинна массива arrayOne: %d \n" +
                            "Длинна массива arrayTwo: %d",
                    arrayOne.length, arrayTwo.length));
        }

        Integer[] result = new Integer[arrayOne.length];

        for (int i = 0; i < result.length; i++) {

            if (arrayTwo[i] == 0) {
                throw new RuntimeException(
                        String.format("Отмена действия " +
                                "%d элемент массива arrayTwo равен 0", i));
            }

            result[i] = arrayOne[i] / arrayTwo[i];

        }

        return result;
    }

    public static void print(Integer[] array) {
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

