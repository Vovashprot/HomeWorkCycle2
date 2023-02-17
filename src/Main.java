public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static  void task1(){
        int deposit = 0;
        int month = 0;
        while(deposit < 2459000){
            deposit = deposit + 15000 ;
            month = month + 1;
            System.out.println("Месяц "+ month + ", сумма накоплений равна " + deposit + " рублей");

        }
    }
    public static  void task2(){
        int i = 0;
        while(i <= 10){
            System.out.print(i+" ");
            i = i + 1 ;
        }
        System.out.println("");
        for (i = 10; i>=0; i--){
            System.out.print(i+" ");
        }

    }
}