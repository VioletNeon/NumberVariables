public class Main {
    public static void main(String[] args) {
        int characters = 1_767_088_132;
        System.out.println("Значение переменной characters с типом int равно " + characters);

        byte apples = 15;
        System.out.println("Значение переменной apples с типом byte равно " + apples);

        short cities = 23_456;
        System.out.println("Значение переменной cities с типом short равно " + cities);

        long stars = 3_759_231_937L;
        System.out.println("Значение переменной stars с типом long равно " + stars);

        float liters = 154.565f;
        System.out.println("Значение переменной liters с типом float равно " + liters);

        double lengthDifference = 1_789.565_232;
        System.out.println("Значение переменной lengthDifference с типом double равно " + lengthDifference);

        float degrees = 27.12f;
        long grainsOfSand = 987_678_965_549L;
        float depthLevel = 2.786f;
        short blocks = 569;
        short xCoordinate = -159;
        short employees = 27_897;
        byte mathTeachers = 67;

        System.out.println("\n" + "Инициализированы переменные со значениями и типами:" + "\n" +
                "degrees с типом float равно " + degrees + ";\n" +
                "grainsOfSand с типом long равно " + grainsOfSand + ";\n" +
                "depthLevel с типом float равно " + depthLevel + ";\n" +
                "blocks с типом short равно " + blocks + ";\n" +
                "xCoordinate с типом short равно " + xCoordinate + ";\n" +
                "employees с типом short равно " + employees + ";\n" +
                "mathTeachers с типом byte равно " + mathTeachers + ";"
        );

        byte firstClassPupilsCount = 23;
        byte secondClassPupilsCount = 27;
        byte thirdClassPupilsCount = 30;
        short sheetsPurchased = 480;
        byte allPupils = (byte) (firstClassPupilsCount + secondClassPupilsCount + thirdClassPupilsCount);
        short sheetsForOnePupil = (short) (sheetsPurchased / allPupils);

        System.out.println("\n" + "Учеников в классах:" + "\n" +
                "У Людмилы Павловны " + firstClassPupilsCount + " ученика;" + "\n" +
                "У Анны Сергеевны " + secondClassPupilsCount + " учеников;" + "\n" +
                "У Екатерины Андреевны " + thirdClassPupilsCount + " учеников;" + "\n\n" +
                "Всего куплено листов бумаги " + sheetsPurchased + ";" + "\n" +
                "На каждого ученика рассчитано " + sheetsForOnePupil + " листов бумаги." + "\n"
        );

        byte productivityPerMinute = 16 / 2;
        byte twentyMinutes = 20;
        byte dayHours = 24;
        byte minutesInHour = 60;

        short minutesInDay = (short) (dayHours * minutesInHour);
        short minutesInThreeDay = (short) (dayHours * minutesInHour * 3);
        int minutesInMonth = minutesInDay * 30;

        short producedForTwentyMinutes = (short) (productivityPerMinute * twentyMinutes);
        short producedForOneDay = (short) (productivityPerMinute * minutesInDay);
        int producedForThreeDay = productivityPerMinute * minutesInThreeDay;
        int producedForMonth = productivityPerMinute * minutesInMonth;

        System.out.println("За 20 минут машина произвела " + producedForTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + producedForOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + producedForThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + producedForMonth + " штук бутылок");

        byte allCansOfPaint = 120;
        byte cansOfWhitePaintForOneClassroom = 2;
        byte cansOfBrownPaintForOneClassroom = 4;

        byte allCansOfPaintForOneClass = (byte) (cansOfBrownPaintForOneClassroom + cansOfWhitePaintForOneClassroom);
        byte classrooms = (byte) (allCansOfPaint / allCansOfPaintForOneClass);
        byte allCansOfWhitePaint = (byte) (classrooms * cansOfWhitePaintForOneClassroom);
        byte allCansOfBrownPaint = (byte) (classrooms * cansOfBrownPaintForOneClassroom);

        System.out.println("\n" + "В школе, где " + classrooms + " классов, нужно " + allCansOfWhitePaint + " банок белой краски и " + allCansOfBrownPaint + " банок коричневой краски." + "\n");

        byte bananas = 5;
        short milkOneHundredMlBottle = 2;
        byte iceCream = 2;
        byte eggs = 4;

        byte bananaWeightInGrams = 80;
        byte milkWeightInGramsByOneBottle = 105;
        byte iceCreamWeightInGrams = 100;
        byte eggWeightInGrams = 70;

        short breakfastWeightInGrams = (short) ((bananas * bananaWeightInGrams) + (milkOneHundredMlBottle * milkWeightInGramsByOneBottle) + (iceCream * iceCreamWeightInGrams) + (eggs * eggWeightInGrams));
        float breakfastWeightInKilograms = (float) (breakfastWeightInGrams / 1000);

        System.out.println("Вес завтрака в граммах: " + breakfastWeightInGrams + " грамм");
        System.out.println("Вес завтрака в килограммах: " + breakfastWeightInKilograms + " килограмм");

        byte necessaryWeightLossInKilograms = 7;
        float minWeightLossInKilogramsPerDay = 250f / 1000f;
        float maxWeightLossInKilogramsPerDay = 500f / 1000f;

        byte daysForWeightLossByMin = (byte) (necessaryWeightLossInKilograms / minWeightLossInKilogramsPerDay);
        byte daysForWeightLossByMax = (byte) (necessaryWeightLossInKilograms / maxWeightLossInKilogramsPerDay);
        byte averageDaysWeightLoss = (byte) ((daysForWeightLossByMin + daysForWeightLossByMax) / 2);

        System.out.println("\n" + "В среднем, чтобы добиться результата похудения, спортсмену потребуется " + averageDaysWeightLoss + " день." + "\n");

        byte monthInYear = 12;
        byte percentageBonus = 10;
        int salaryMashaPerMonth = 67_760;
        int salaryDenisPerMonth = 83_690;
        int salaryKristinaPerMonth = 76_230;

        int salaryMashaAfterIncreasePerMonth = salaryMashaPerMonth + ((salaryMashaPerMonth * percentageBonus) / 100);
        int salaryDenisAfterIncreasePerMonth = salaryDenisPerMonth + ((salaryDenisPerMonth * percentageBonus) / 100);
        int salaryKristinaAfterIncreasePerMonth = salaryKristinaPerMonth + ((salaryKristinaPerMonth * percentageBonus) / 100);

        int salaryMashaBeforeIncreasePerYear = monthInYear * salaryMashaPerMonth;
        int salaryDenisBeforeIncreasePerYear = monthInYear * salaryDenisPerMonth;
        int salaryKristinaBeforeIncreasePerYear = monthInYear * salaryKristinaPerMonth;

        int salaryMashaAfterIncreasePerYear = monthInYear * salaryMashaAfterIncreasePerMonth;
        int salaryDenisAfterIncreasePerYear = monthInYear * salaryDenisAfterIncreasePerMonth;
        int salaryKristinaAfterIncreasePerYear = monthInYear * salaryKristinaAfterIncreasePerMonth;

        int salaryDifferenceMasha = salaryMashaAfterIncreasePerYear - salaryMashaBeforeIncreasePerYear;
        int salaryDifferenceDenis = salaryDenisAfterIncreasePerYear - salaryDenisBeforeIncreasePerYear;
        int salaryDifferenceKristina = salaryKristinaAfterIncreasePerYear - salaryKristinaBeforeIncreasePerYear;


        System.out.println("Маша теперь получает " + salaryMashaAfterIncreasePerMonth + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisAfterIncreasePerMonth + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaAfterIncreasePerMonth + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + " рублей.");
    }
}