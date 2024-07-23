

public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
        for (int i=1; i<=100; i++) {
            if(i%2!=0)
                continue;
            System.out.println("Уволен айтишник с id " + i);
        }
        // Решение с использованием только цикла while

        int j = 1;
        while (j<=100){
            if(j%2!=0) {
                j++;
                continue;
            }
            System.out.println("Уволен айтишник с id " + j);
            j++;
        }
    }
}
