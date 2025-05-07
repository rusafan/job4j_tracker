package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.print("Активна:" + active);
        System.out.print(" Код:" + status);
        System.out.println(" Ошибка:" + message);
    }

    public static void main(String[] args) {
        Error default0 = new Error();
        default0.printInfo();
        Error err1 = new Error(true, 400, "Bad Request");
        err1.printInfo();
        Error err2 = new Error(true, 401, "Unauthorized");
        err2.printInfo();
    }
}
