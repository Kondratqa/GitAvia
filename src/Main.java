public class Main {
    public static void main(String[] args) {
        int amountiket = 18783; // стоимость билета
        int rubmill = 20; // Количество рублей за 1 милю
        int bonusMill = amountiket / rubmill;
        System.out.println(" За билет стоимостью " + amountiket + " Начислено бонусных миль " + bonusMill);
    }
}


