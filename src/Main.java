import com.sun.jdi.VMOutOfMemoryException;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    public static  void task4(){
        System.out.println("Task 4");
        int deposit = 15000;
        int monthPlus = deposit/100*7;
        int month = 0;
        while(deposit < 12000000){
            deposit = deposit + monthPlus;
            monthPlus = deposit/100*7;
            month = month + 1;
            System.out.println("Денег: "+ deposit +" ; месяц" + month);

        }
    }
    public static  void task5(){
        System.out.println("Task 5");
        int deposit = 15000;
        int monthPlus = deposit/100*7;
        int month = 0;
        while(deposit < 12000000){
            deposit = deposit + monthPlus;
            monthPlus = deposit/100*7;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Денег: " + deposit + " ; месяц" + month);
            }
        }
    }
    public static  void task6(){
        System.out.println("Task 6");
        int deposit = 15000;
        int monthPlus = deposit/100*7;
        int month = 0;
        while(month < (9*12)){
            deposit = deposit + monthPlus;
            monthPlus = deposit/100*7;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Денег: " + deposit + " ; месяц" + month);
            }
        }
    }
    public static  void task7(){
        System.out.println("Task 7");
        int friday = 3;
        for (int i = 1; i<=31; i= i + 7){
                System.out.println(i);
        }
    }
}