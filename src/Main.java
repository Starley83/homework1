//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// homework conditional operators if and else
        int age = 17;  //задача 1
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        //else {  // variant 1
        if (age < 18) {   //variant 2
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        int temp = -5;  //задача 2
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
        if (temp == 5) {
            System.out.println("На улице " + temp + " градусов, в условиях задачи не задано, но шапку лучше надеть.");
        }

        int speed = 47;  //задача 3
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф.");
        }
        if (speed == 60) {
            System.out.println("Если скорость " + speed + " по ПДД можно ездить спокойно, если спидометр не врет.");
        }

        int ageHuman = 4;  //задача 4
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад.");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу.");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет.");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу.");
        }

        int ageChild = 28;  //задача 5
        if (ageChild <= 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageChild > 5 && ageChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ",  то он может кататься на аттракционе без сопровождения взрослого.");
        }

        int seat = 150;  //задача 6
        if (seat <= 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else {
            if (seat > 60 && seat <= 102) {
                System.out.println("В вагоне есть стоячие места");
            } else {
                System.out.println("вагон уже полностью забит.");
                System.out.println("Мест нет.");
                System.out.println("Совсем нет.");
            }
        }
        int one = 5;  //задача 7
        int two = 1;
        int three = 5;
          if (one > two && one > three) {
            System.out.println("число one больше других");
        } else {
            if (two > three && two > one) {
                System.out.println("число two больше других");
            } else {
                if (three > one && three > two) {
                                           System.out.println("число three больше других");
                    } else {if (one==two) {
                    if (three==two) {
                        System.out.println("эти числа равны");
                    }
                } else {  System.out.println(" Числа one и two равны и больше three");
                    if (W) {
                        ;
                    } else {
                        System.out.println("число two больше других");
                    }
                }
            }
        }

    }
}