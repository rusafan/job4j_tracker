package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Петров Иван Степанович");
        student.setGroup("Э1");
        student.setEnrolmentDate("25.05.1960");
        System.out.println("ФИО:" + student.getFullName() + " Группа:" + student.getGroup() + " Дата поступления:"
        + student.getEnrolmentDate());
    }
}
