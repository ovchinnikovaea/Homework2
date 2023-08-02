public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);

        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);

        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);

        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);

        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        var Weight1 = 78.2;
        var Weight2 = 82.7;
        var resultWeight = Weight1 + Weight2;
        System.out.println("Общий вес двух бойцов " + resultWeight + " кг");

        var difference = resultWeight % Weight1;
        System.out.println("Разница между весами бойцов " + difference + " кг");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        var Weight1 = 78.2;
        var Weight2 = 82.7;
        var difference1 = Weight2 - Weight1;
        System.out.println("Разница весов спортсменов " + difference1 + " кг");

        var resultWeight = Weight1 + Weight2;
        var difference2 = resultWeight % Weight1;
        System.out.println("Разница весов спортсменов " + difference2 + " кг");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        var allWorkTime = 640;
        var workTimeOneWorker = 8;
        var Workers = allWorkTime / workTimeOneWorker;
        System.out.println("Всего работников в компании — " + Workers + " человек");

        Workers = Workers + 94;
        var allWorkTime2 = Workers * workTimeOneWorker;
        System.out.println("Если в компании работает " + Workers + " человек, то всего " + allWorkTime2 + " часов работы может быть поделено между сотрудниками");
    }
}
