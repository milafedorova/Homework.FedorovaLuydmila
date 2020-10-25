package homework6;


public class ExeptionDemo {

    public static void sumInt(String[][] arrays) throws MyArraySizeException, MyArrayDataException {
        if (arrays.length != 4 || arrays[0].length != 4) {
            throw new MyArraySizeException("My array size is incorrect: " + arrays.length + " : " + arrays[0].length);
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int k = Integer.parseInt(arrays[i][j]);
                    sum = sum + k;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("My array data is incorrect. Number of element: " + i + " : " + j);
                }
            }
        }
        System.out.println(sum);
    }

    public static String[][] autoInt(String[][] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = String.valueOf(k);
                k = k + 1;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[][] array1 = new String[4][4];
        array1 = autoInt(array1);

        String[][] array2 = new String[4][5];
        array2 = autoInt(array2);

        String[][] array3 = new String[4][4];
        array3 = autoInt(array3);
        array3[1][2] = "abc";

        try {
            sumInt(array1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            sumInt(array2);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            sumInt(array3);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
