public class Main {
    public static void main(String[] args) {
        int amountTiket = 18783; // стоимость билета
        int rubMill = 20; // Количество рублей за 1 милю
        int bonusMill = amountTiket / rubMill;
        System.out.println(" За билет стоимостью " + amountTiket + " Начислено бонусных миль " + bonusMill);
    }
}


