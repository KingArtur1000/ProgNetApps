public class Main {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Земля", 6);
        Planet planet2 = new Planet("Земля", 6);
        Planet planet3 = new Planet("Марс", 1);

        Continent continent1 = new Continent("Евразия", planet1);
        Continent continent2 = new Continent("Евразия", planet2);
        Continent continent3 = new Continent("Суша", planet3);


        System.out.println("\t\tИнформация о континентах:\n");

        System.out.println("\tИнформация о континенте №1:");
        continent1.showInfo();
        System.out.println("Хеш-Код: " + continent1.hashCode() + '\n');

        System.out.println("\tИнформация о континенте №2:");
        continent2.showInfo();
        System.out.println("Хеш-Код: " + continent2.hashCode() + '\n');

        System.out.println("\tИнформация о континенте №3:");
        continent3.showInfo();
        System.out.println("Хеш-Код: " + continent3.hashCode() + '\n');


        System.out.println("\tКонтинент №1 == Континент №2 ?");
        if ( continent1.equals(continent2) ) { System.out.println("Да"); }
        else { System.out.println("Нет"); }

        System.out.println("\tКонтинент №2 == Континент №3 ?");
        if ( continent2.equals(continent3) ) { System.out.println("Да"); }
        else { System.out.println("Нет"); }

        System.out.println("\tКонтинент №1 == Континент №3 ?");
        if ( continent1.equals(continent3) ) { System.out.println("Да"); }
        else { System.out.println("Нет"); }
    }
}


