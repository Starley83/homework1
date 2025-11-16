//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;  //задача 1
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4; // задача 2
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5; //задача 3
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19; //задача 4
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;  //задача 5
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2; // задача 6
        var boxer2 = 82.7;
        System.out.println("общая масса двух бойцов " + (boxer1 + boxer2) + "кг");
        System.out.println("второй боксер тежелее первого на " + (boxer2 - boxer1) + "кг");

        var a = boxer2 % boxer1; //задача 7
        System.out.println("остаток от деления между весами " + a);

        var hours = 640; // задача 8
        var staff = 640 / 8;
        System.out.println("всего работников в компании - " + staff + " человек"); //задача 8.1
        staff = staff + 94;
        hours = staff * 8;
        System.out.println("если в компании работает " + staff + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");
    }
}