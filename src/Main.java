//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 52357; //задача 1
        byte b = 15;
        short C = 150;
        long d = 3150456789L;
        float e = 5.67584f;
        double f = 9.19056789;
        System.out.println("значение переменной a c типом int равно " + a);
        System.out.println("значение переменной b c типом byte равно " + b);
        System.out.println("значение переменной C c типом short равно " + C);
        System.out.println("значение переменной d c типом long равно " + d);
        System.out.println("значение переменной e c типом float равно " + e);
        System.out.println("значение переменной f c типом double равно " + f);

        float g = 27.12f;  //задача 2
        long h = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        byte LP = 23;  //задача 3
        byte AS = 27;
        byte EA = 30;
        short list = 480;
        int anyone = list / (LP + AS + EA);
        System.out.println("на каждого ученика расссчитано " + anyone + " листов бумаги");

        byte bottles = 16;  //задача 4
        byte time = 2;
        int bottlesPerMinute = bottles / time;
        int period = 20;
        int bottlesPerPeriod = bottlesPerMinute * period;
        System.out.println("За 20 минут машина произвела " + bottlesPerPeriod + " штук бытулок");
        period = 60 * 24;
        bottlesPerPeriod = bottlesPerMinute * period;
        System.out.println("За сутки машина произвела " + bottlesPerPeriod + " штук бытулок");
        period = period * 3;
        bottlesPerPeriod = bottlesPerMinute * period;
        System.out.println("За трое суток машина произвела " + bottlesPerPeriod + " штук бытулок");
        period = period * 10;
        bottlesPerPeriod = bottlesPerMinute * period;
        System.out.println("За месяц (30 дней) машина произвела " + bottlesPerPeriod + " штук бытулок");

        byte paint = 120; //задача 5
        byte white = 2;
        byte brown = 4;
        int paintForClass = white + brown;
        int numberOfClasses = paint / paintForClass;
        int numberOfWhite = white * numberOfClasses;
        int numberOfBrown = brown * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhite + " банок белой краски и " + numberOfBrown + " банок коричневой краски.");

        byte weightOfBanan = 80; // задача 6
        byte weightOfMilk = 105;
        byte weightOfPlombir = 100;
        byte weightOfEgg = 70;
        int weightOfCoctail = weightOfBanan * 5 + weightOfMilk * 2 + weightOfPlombir * 2 + weightOfEgg * 4;
        float KG = (float) weightOfCoctail / 1000;
        System.out.println("Вес коктейля " + weightOfCoctail + " грамм");
        System.out.println("Вес коктейля " + KG + " килограмм");

        short goal = 7000; //задача 7
        short minWeight = 250;
        short maxWeight = 500;
        int minGoal = goal / minWeight;
        int maxGoal = goal / maxWeight;
        int midGoal = (minGoal + maxGoal) / 2;
        System.out.println("при похудении на 250 грамм, время похудения " + minGoal + " дней");
        System.out.println("при похудении на 500 грамм, время похудения " + maxGoal + " дней");
        System.out.println("В среднем, время похудения составило " + midGoal + " дней");

        int payMasha = 67760;  //задача 8
        int payDenis = 83690;
        int payKristina = 76230;
        int newPayMasha = payMasha + payMasha / 10;
        int newPayDenis = payDenis + payDenis / 10;
        int newPayKristina = payKristina + payKristina / 10;
        int deltaMasha = payMasha * 12 / 10;
        int deltaDenis = payDenis * 12 / 10;
        int deltaKristina = payKristina * 12 / 10;
        System.out.println("Маша теперь получает " + newPayMasha + " рублей. Годовой доход вырос на " + deltaMasha + " рублей");
        System.out.println("Денис теперь получает " + newPayDenis + " рублей. Годовой доход вырос на " + deltaDenis + " рублей");
        System.out.println("Кристина теперь получает " + newPayKristina + " рублей. Годовой доход вырос на " + deltaKristina + " рублей");
    }
}