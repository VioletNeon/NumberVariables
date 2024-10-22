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
                "На каждого ученика рассчитано " + sheetsForOnePupil + " листов бумаги."
        );

    }
}