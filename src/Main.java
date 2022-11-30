public class Main {

    public static void main(String[] args) {
//write your code here
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);


        var sportsmen1 = 78.2;
        var sportsmen2 = 82.7;
        var totalWeigh = sportsmen1 + sportsmen2;
        System.out.println("Общий вес двух бойцов " + totalWeigh + " кг.");
        var weightDifference = sportsmen2 - sportsmen1;
        System.out.println("Разница в весе двух бойцов " + weightDifference + " кг.");

        var difference = sportsmen2 % sportsmen1;
        System.out.println("Разница в весе двух бойцов " + difference + " кг.");


        var totalTime = 640;
        var workingTime = 8;
        var numberOfEmployees = totalTime / workingTime;
        System.out.println("Всего работников в компании – " + numberOfEmployees + " человек ");

        numberOfEmployees = numberOfEmployees + 94;
        totalTime =  workingTime * numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");


    }
}