public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static  void task1(){
        System.out.println("Task 1");
        int deposit = 0;
        int month = 0;
        while(deposit < 2459000){
            deposit = deposit + 15000 ;
            month = month + 1;
            System.out.println("Месяц "+ month + ", сумма накоплений равна " + deposit + " рублей");

        }
    }
    public static  void task2(){
        System.out.println("Task 2");
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
    public static  void task3(){
        System.out.println("Task 3");
        int people = 12000000;
        int year = 1;
        int deathsInYear = people/1000*8;
        int birthsInYear = people/1000*17;
        while(year <= 10){
            people = people + birthsInYear - deathsInYear;
            System.out.println("Год "+ year +", численность населения составляет " + people);
            year = year + 1;

        }
    }
}