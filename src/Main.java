public class Main {
    public static void main(String[] args) {
        task5();
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
        byte brownPaintForOneClass = 4;
        byte whitePaintForOneClass = 2;

        int numberForClasses = wholePaint / (brownPaintForOneClass + whitePaintForOneClass);

        System.out.println("В школе, где " + numberForClasses + " классов, нужно " + whitePaintForOneClass * numberForClasses + " банок белой краски и " + brownPaintForOneClass * numberForClasses + " банок коричневой краски");
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
        int daysWith500Gramms = weight / 500;
        int daysWith250Gramms = weight / 250;

        System.out.println("Если в день худеть на 250 грамм, то можно похудеть за " + daysWith250Gramms + " дней.");
        System.out.println("Если в день худеть на 500 грамм, то можно похудеть за " + daysWith500Gramms + " дней.");
        System.out.println("В среднем можно похудеть за " + (daysWith500Gramms + daysWith250Gramms) / 2 + " день.");
    }
    public static void task8(){
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int crisSalary = 76230;
        float increase = 1.1f;

        int mashaSalaryForYear= mashaSalary * 12;
        int denisSalaryForYear = denisSalary * 12;
        int crisSalaryForYear = crisSalary * 12;

        float newMashaSalaryForYear = mashaSalaryForYear * increase;
        float newDenisSalaryForYear = denisSalaryForYear * increase;
        float newCrisSalaryForYear = crisSalaryForYear * increase;

        float mashaDiff = newMashaSalaryForYear -  mashaSalaryForYear;
        float denisDiff = newDenisSalaryForYear - denisSalaryForYear;
        float crisDiff = newCrisSalaryForYear - crisSalaryForYear;

        System.out.println("Маша теперь получает " + newMashaSalaryForYear + " рублей. Годовой доход вырос на " + (mashaDiff) + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalaryForYear + " рублей. Годовой доход вырос на " + (denisDiff) + " рублей");
        System.out.println("Кристина теперь получает " + newCrisSalaryForYear + " рублей. Годовой доход вырос на " + (crisDiff) + " рублей");
    }
}