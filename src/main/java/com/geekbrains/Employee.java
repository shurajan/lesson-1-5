package com.geekbrains;


import java.util.Locale;

public class Employee {
    //    Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    private static final Double MINIMAL_SALARY = 12792.0;
    private static final Integer MINIMAL_AGE = 18;
    private String fullName;
    private String position;
    private String eMail;
    private String phone;
    private Double salary;
    private Integer age;


    public Employee(String fullName, String position, String eMail, String phone, Double salary, Integer age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salaryValidation(salary);
        this.age = ageValidation(age);
    }

    public void print() {
        Integer i = this.age % 10;

        String ageAdoptedName;
        if (i == 1) {
            ageAdoptedName = "год";
        } else if (i > 1 && i < 5){
            ageAdoptedName = "года";
        } else{
            ageAdoptedName = "лет";
        }

        System.out.println("Данные сотрудника - " + this.fullName + ", " + this.age + " " + ageAdoptedName);
        System.out.println(" Должность : " + this.position);
        System.out.println(" Оклад     : " + String.format(Locale.US, "%1$,.2f", this.salary));
        System.out.println(" E-mail    : " + this.eMail);
        System.out.println(" Телефон   : " + this.phone);
        System.out.println();
    }

    //Валидатор зарплаты используется в конструкторе и сеттере
    private Double salaryValidation(Double salary) {
        if (salary < MINIMAL_SALARY) {
            System.out.println("Зарплата не может быть ниже МРОТ - " + MINIMAL_SALARY);
            return MINIMAL_SALARY;
        }
        return salary;
    }

    //Валидатор возраста используется в конструкторе и сеттере
    private Integer ageValidation(Integer age) {
        if (age < 18) {
            System.out.println("Возраст сотрудника должен быть больше - " + MINIMAL_AGE + " лет");
            return MINIMAL_AGE;
        }
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salaryValidation(salary);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = ageValidation(age);
    }
}
