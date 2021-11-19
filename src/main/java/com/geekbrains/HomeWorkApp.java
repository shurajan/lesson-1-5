package com.geekbrains;

public class HomeWorkApp {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Чапаев Василий Иванович",
                "Комдив", "chapaev@mail.su",
                "+7 495 111-11-11", 0.0, 32);

        employeesArray[1]  = new Employee("Гай Юлий Цезарь",
                "Консул", "cesar@mail.it",
                "+39 6 1111-1111", 1000000.0, 55);

        employeesArray[2]  = new Employee("Чингисхан",
                "Хан", "genghis@mail.mn",
                "+976 11 11-11-11", 10000000.0, 72);

        employeesArray[3]  = new Employee("Гарри Поттер>",
                "Волшебник", "harrypotter@mail.co.uk",
                "+44 020 1111-1111", 100000.0, 17);

        employeesArray[4]  = new Employee("Янек Кос",
                "Командир танка", "jankos@mail.pl",
                "+48 22 111111", 50000.0, 17);

        //Тестируем валидацию через сеттер
        employeesArray[4].setAge(17);

        System.out.println("========Первый вариант печати=======");
        for(Employee employee : employeesArray){
            if(employee.getAge()>40)  employee.print();
        }
        //Делаем Чапаева старше
        employeesArray[0].setAge(41);

        System.out.println("========Второй вариант печати=======");
        for(int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge()>40)  employeesArray[i].print();
        }

    }
}
