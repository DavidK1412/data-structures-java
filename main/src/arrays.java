public class arrays {
    public void print(){
        int arreglo[] = {25, 14};

        System.out.println("Posición cero: " + arreglo[0]);
        System.out.println("Posición uno: " + arreglo[1]);
    }

    //First exercise (Page 42), find the adition of an Array A and Array B
    public void arrayAdition(){
        int arrayA[] = {7, 44, 33, 22, 77, 88, 99, 55, 43, 79};
        int arrayB[] = {66, 33, 44, 544, 88, 33, 46, 83, 6, 8};
        // If the exercise proposes the adition in each position of the arrays.
        int[] arrayC = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        for (int value: arrayC){
            System.out.println("value = " + value);
        }

        // In other case, if the exercises want the total of all in one single number...
        int totalAdition = 0;
        for(int value: arrayC){
            totalAdition += value;
        }
        System.out.println("totalAdition = " + totalAdition);
    }

}
