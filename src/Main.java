public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Объявите переменные типа int, byte, short, long, float, double:");
        int int1 = 40000;
        byte byte1 = 22;
        short short1 = 32000;
        long long1 = 900000000L;
        float float1 = 3.757857f;
        double double1 = 3.75525257857827d;
        System.out.println("Значение переменной int1 с типом int равно " + int1);
        System.out.println("Значение переменной byte1 с типом byte равно " + byte1);
        System.out.println("Значение переменной short1 с типом short равно " + short1);
        System.out.println("Значение переменной long1 с типом long равно " + long1);
        System.out.println("Значение переменной float1 с типом float равно " + float1);
        System.out.println("Значение переменной double1 с типом double равно " + double1);
        System.out.println();
        System.out.println("Задача 2. Инициализируйте переменные:");
        float float2 = 27.12f;
        long long2 = 987678965549L;
        float float3 = 2.786f;
        int int2 = 569;
        int int3 = -159;
        int int4 = 27897;
        byte byte2 = 67;
        System.out.println(float2 + " - это переменная типа float");
        System.out.println(long2 + "- это переменная типа long");
        System.out.println(float3 + " - это переменная типа float");
        System.out.println(int2 + " - это переменная типа int");
        System.out.println(int3 + " - это переменная типа int");
        System.out.println(int4 + " - это переменная типа int");
        System.out.println(byte2 + " - это переменная типа byte");
        System.out.println();
        System.out.println("Задача 3. Про учителей:");
        int pupilsOfLyudmilaPavlovna = 23;
        int pupilsOfAnnaSergeevna = 27;
        int pupilsOfEkaterinaAndreevna = 30;
        int sheetsOfPaper = 480;
        int sheetsPerPupils = sheetsOfPaper / (pupilsOfLyudmilaPavlovna + pupilsOfAnnaSergeevna + pupilsOfEkaterinaAndreevna);
        System.out.println("На каждого ученика расчитано по " + sheetsPerPupils + " листов бумаги.");
        System.out.println();
        System.out.println("Задача 4. Про производительность машины для изготовления бутылок:");
        int Efficiency2min = 16;
        int Efficiency20min = Efficiency2min * 10;
        int EfficiencyDay = Efficiency20min * 72;
        int Efficiency3Day = EfficiencyDay * 3;
        int EfficiencyMonth = EfficiencyDay * 30;
        System.out.println("За 2 минуты машина произвела " + Efficiency2min + " штук бутылок.");
        System.out.println("За 20 минут машина произвела " + Efficiency20min + " штук бутылок.");
        System.out.println("За сутки машина произвела " + EfficiencyDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + Efficiency3Day + " штук бутылок.");
        System.out.println("За месяц машина произвела " + EfficiencyMonth + " штук бутылок.");
        System.out.println();
        System.out.println("Задача 5. Про ремонт школы:");
        int totalPaints = 120;
        int paintsFor1Grade = 2 + 4;
        int numberOfClasses = totalPaints / paintsFor1Grade;
        int generalWhitePaint = numberOfClasses * 2;
        int generalBrownPaint = numberOfClasses * 4;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                generalWhitePaint + " банок белой краски и " + generalBrownPaint + " банок коричневой краски");
        System.out.println();
        System.out.println("Задача 6. Про рецепт спортсменов:");
        int bananas = 5;
        int bananaWeightGram = 80;
        int Milk = 200;
        float MilkWeightGram = (float) 105 / 100;
        int IceCreamSundae = 2;
        int IceCreamSundaeWeightGram = 100;
        int RawEggs = 4;
        int RawEggsWeightGram = 70;
        float breakfastWeightGram =
                bananas * bananaWeightGram +
                        Milk * MilkWeightGram +
                        IceCreamSundae * IceCreamSundaeWeightGram +
                        RawEggs * RawEggsWeightGram;
        float breakfastWeightKilogram = breakfastWeightGram / 1000;
        System.out.println("Вес спортзавтрака - " + (int) breakfastWeightGram + " г." +
                " а если перевести в килограммы, то - " + breakfastWeightKilogram + " кг.");
        System.out.println();
        System.out.println("Задача 7. Про диету:");
        int excessWeightKilogram = 7;
        int excessWeightGram = excessWeightKilogram * 1000;
        int dietDays250 = excessWeightGram / 250;
        int dietDays500 = excessWeightGram / 500;
        int averageDietDays = (dietDays250 + dietDays500) / 2;
        System.out.println("Спортсмену нужно похудеть на " + excessWeightGram + " г.,");
        System.out.println("если он будет худеть по 250 г. в день, то потребуется " + dietDays250 + " дней,");
        System.out.println("если он будет худеть по 500 г. в день, то потребуется " + dietDays500 + " дней.");
        System.out.println("В среднем процесс похудения займет около " + averageDietDays + " дня.");
        System.out.println();
        System.out.println("Задача 8. Мы представили, что работаем в БОЛЬШОЙ компании:");
        int salaryMashaMonth = 67760;
        int salaryDenisMonth = 83690;
        int salaryChristinaMonth = 76230;
        int salaryMashaMonthNew = (int) (salaryMashaMonth * 1.1);
        int salaryDenisMonthNew = (int) (salaryDenisMonth * 1.1);
        int salaryChristinaMonthNew = (int) (salaryChristinaMonth * 1.1);
        int annualDifferenceMasha = salaryMashaMonthNew * 12 - salaryMashaMonth * 12;
        int annualDifferenceDenis = salaryDenisMonthNew * 12 - salaryDenisMonth * 12;
        int annualDifferenceChristina = salaryChristinaMonthNew * 12 - salaryChristinaMonth * 12;
        System.out.println("Маша теперь получает " + salaryMashaMonthNew + " рублей. " +
                "Годовой доход вырос на " + annualDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisMonthNew + " рублей. " +
                "Годовой доход вырос на " + annualDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryChristinaMonthNew + " рублей. " +
                "Годовой доход вырос на " + annualDifferenceChristina + " рублей");
    }
}