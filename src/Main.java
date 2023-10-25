public class Main {
    public static void main(String[] args) {
        task8();
    }

    public static void task1(){
        byte b = 123;
        short s = 30000;
        int i = 3000000;
        long l = 1111111111L;

        float f = 213.222222f;
        double d = 213333.444444;

        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);

        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
    }

    public static void task2(){
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
    }

    public static void task3(){
        int classNumber1 = 23;
        int classNumber2 = 27;
        int classNumber3 = 30;
        int sumOfStudents = classNumber1 + classNumber2 + classNumber3;
        int sheets = 480;
        System.out.println(sheets / sumOfStudents);
    }

    public static void task4(){
        byte MINUTE = 1;
        int HOUR = 60 * MINUTE;
        int DAY = HOUR * 24; // minute in day;

        int work = 16 / (2 * MINUTE);

        int workInTwentyMinutes = 20 * MINUTE * work;
        System.out.println("За 20 минут машина произвела " + workInTwentyMinutes + " штук бутылок");

        int workInDay = DAY * work;
        System.out.println("За день машина произвела " + workInDay + " штук бутылок");

        int workInThreeDay = 3 * DAY * work;
        System.out.println("За 3 дня машина произвела " + workInThreeDay + " штук бутылок");

        int workInMonth = 30 * DAY * work;
        System.out.println("За месяц машина произвела " + workInMonth + " штук бутылок");
    }

    public static void task5(){
        byte wholePaint = 120;
        byte numberForClasses = 20;
        byte brownPaintForOneClass = 4;
        byte whitePaintForOneClass = 2;


        System.out.println("В школе, где " + numberForClasses + " классов, нужно " + wholePaint / whitePaintForOneClass + " банок белой краски и " + wholePaint / brownPaintForOneClass + " банок коричневой краски");
    }

    public static void task6(){
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;

        int weightInGramms = 5 * banana + 2 * milk + 2 * iceCream + 4 * egg;
        System.out.println(weightInGramms + " - вес в граммах");

        float weightInKilo = (float) weightInGramms / 1000;
        System.out.println(weightInKilo + " - вес в килограммах");
    }

    public static void task7(){
        short weight = 7000;

        System.out.println("Если в день худеть на 250 грамм, то можно похудеть за " + weight / 250);
        System.out.println("Если в день худеть на 500 грамм, то можно похудеть за " + weight / 500);
    }
    public static void task8(){
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int crisSalary = 76230;
        float increase = 1.1f;

        float newMashaSalary = mashaSalary * increase;
        float newDenisSalary = denisSalary * increase;
        float newCrisSalary = crisSalary * increase;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + (newMashaSalary - mashaSalary) + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newDenisSalary - denisSalary) + " рублей");
        System.out.println("Кристина теперь получает " + newCrisSalary + " рублей. Годовой доход вырос на " + (newCrisSalary - crisSalary) + " рублей");
    }
}