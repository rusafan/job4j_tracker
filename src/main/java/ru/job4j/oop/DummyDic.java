package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic sam = new DummyDic();
        String eng = "Unknown word";
        System.out.println(sam.engToRus(eng));
    }
}
