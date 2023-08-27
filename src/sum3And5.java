public class sum3And5 {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i < 500; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum += i;
                counter++;
            }
        if (counter == 5){
            break;
        }
        }
    System.out.println("sum = " + sum);
    }

}
