//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// homework conditional operators if and else
        int age = 19;  //задача 1
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {  // variant 1
            //if (age < 18) {   //variant 2
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        int temp = -7;  //задача 2
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }


        int speed = 90;  //задача 3
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " придется заплатить штраф.");
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
        int one = 3;  //задача 7
        int two = 2;
        int three = 1;
        if (one > two && one > three) {
            System.out.println("число one=" + one + " больше других");
        } else {
            if (two > three && two > one) {
                System.out.println("число two=" + two + " больше других");
            } else {
                if (three > one && three > two) {
                    System.out.println("число three=" + three + " больше других");
                } else {
                    System.out.println("невозможно найти одно наибольшее число, возможно числа равны между собой, попробуйте ввести другие значения");
                }

            }
        }
    }
}