/*
    3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен разности элементов двух
    входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
    оповестить пользователя.
    */

public class Task3 {
    public static void main(String[] args) {

        Integer[] arrayOne = new Integer[] {3,2,1};
//        Integer[] arrayTwo = new Integer[] {1,2,3};
        Integer[] arrayTwo = new Integer[] {1,2,0};
//        Integer[] arrayTwo = new Integer[] {1,2};
//        Integer[] arrayTwo = new Integer[] {};
//      Integer[] arrayTwo = null;

        print(differenceElement(arrayOne, arrayTwo));

    }

    public static Integer[] differenceElement(Integer[] arrayOne, Integer[] arrayTwo) {

        if (arrayOne == null) {
            throw new RuntimeException(String.format("arrayOne == null"));
        }

        if (arrayTwo == null) {
            throw new RuntimeException(String.format("arrayTwo == null"));
        }

        if (arrayOne.length != arrayTwo.length) {
            throw new RuntimeException(String.format("\nМассивы имеют разную длину: \n" +
                            "Длинна массива arrayOne: %d \n" +
                            "Длинна массива arrayTwo: %d",
                    arrayOne.length, arrayTwo.length));
        }

        Integer[] result = new Integer[arrayOne.length];

        for (int i = 0; i < result.length; i++) {

            result[i] = arrayOne[i] - arrayTwo[i];

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
