public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1(){
//        Выводим значения в консоль
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("ФИО сотрудника - " + lastName + " " + firstName + " " + middleName);
    }
    public static void task2(){
        String fullName = "Ivanov Ivan Ivanovich";
//      с помощью метода пишем все буквы с заглавой буквы
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3(){
        String fullName = "Иванов Семён Семёнович";
//        заменяем буквы
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }
    public static void task4(){
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName;
        String middleName;
        String lastName;
//        находим индексы для метода
        int firstIndex = fullName.indexOf(" ");
        int lastIndex = fullName.lastIndexOf(" ");
//        раззеляем слова
        firstName = fullName.substring(firstIndex, lastIndex);
        middleName = fullName.substring(lastIndex);
        lastName = fullName.substring(0, firstIndex);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }
    public static void task5(){
        String fullName = "ivanov ivan ivanovich";
        String fullName1 = "";
        fullName1 = fullName1 + fullName.substring(0, 1).toUpperCase(); //первый символ делаем заглавным
        for (int i = 1; i < fullName.length(); i++) {
            // смотрим, был ли слева пробел:
            if (" ".equals(fullName.substring(i-1, i)))
                fullName1 = fullName1 + fullName.substring(i, i+1).toUpperCase();
            else
                fullName1 = fullName1 + fullName.substring(i, i+1);
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName1);
    }
    public static void task6(){
//        не знаю как решить без сортировки
        String index1 = "135";
        String index2 = "246";
        StringBuilder sb = new StringBuilder(index1);
        sb.append(index2);
        System.out.println("Данные строки — "+ sb);
    }
    public static void task7() {
        String abc = "aabccddefgghiijjkk";
        for (int i = 0; i < abc.length(); i++) {
            if (abc.charAt(i) == abc.charAt(i + 1)){
                System.out.print(abc.charAt(i));
            }
        }
    }
}