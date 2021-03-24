/*
1. Определить интерфейс Editor, содержащий 3 метода, методы придумываете сами.
Добавить 1 дефолтный метод. Создать 3 класса-редактора (к примеру: word, notepad...)
Создать массив, содержащий объекты такого интерфейса
 */
public class Runner {
    public static void main(String[] args) {
        IEditor[] array = new IEditor[3];
        array[0] = new Word();
        array[1] = new Notepad();
        array[2] = new Note();
        for(int i = 0; i < 3; i++) {
            array[i].print();
            array[i].print1();
            array[i].print2();
            array[i].print3();
        }
    }
}
