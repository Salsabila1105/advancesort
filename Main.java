import java.util.Arrays;

public class Main {

    public static void main (String [] args) {
        int data[] = {11, 5,  21,  29, 10, 9, 17, 15, 32,};

        long startTime = System.nanoTime();
        int min = data[0];
        int index = 0;

        for(int j=0; j<data.length-1; j++) {
            for (int i=j; i<data.length; i++) {
                if (data[i] < min) {
                    min = data[i];
                    index = i;
                }

            }
            if(min<data[j]){
                data[index] = data[j];
                data[j] = min;
            }
            min = data[j+1];
        }
        long endTime = System.nanoTime();

        System.out.println("Hasil sorting : " + Arrays.toString(data));
        System.out.println("waktu sorting : " + (endTime - startTime) + " Nano Detik");
    }
}
