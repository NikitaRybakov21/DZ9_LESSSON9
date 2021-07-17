package com.github;

public class Exception  {

    public static void main(String[] args) {
        String[][] array = new String[4][5];

        array[0][0] = "50";

        System.out.println(inputArray(array));
    }
    private static int inputArray(String[][] array){
        int sum = 0;
        try {
            if (array.length == 4) {
                for (int i = 0; i < 4; i++) {
                    if (!(array[i].length == 4)) throw new MyArraySizeException();
                }
            } else throw new MyArraySizeException();
        }
        catch (MyArraySizeException e){
          System.err.println("Ошибка ввода массива: неверная длина");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Ошибка формата записи в ячейке "+i+" "+j);
                }

            }
        }

      return sum;
    }
}
