public class Main {
    public static void main(String[] args) {
        task1();
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
}