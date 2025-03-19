public class App {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                int aux = array[i];
                array[i] = array[i + 1];
                array[i + 1] = aux;
                System.out.println (array[i]);
            }
        }
            // for (int j = 1; j < array.length; j++) {

    }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] array = { 3, 4, 7, 1, 0, 9, 2, 87, 43 };
        bubblueSort(array);


    }
}
