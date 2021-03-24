/*
3. Создать перечисление, содержащее различные типа редакторов. Создать метод, который принимает перечисление как
В зависимости от переданного типа редактора(enum) создавать объект соответсвующего интерфейса
(который был создан в первой задаче). Продемонстрировать вызов методов
 */
public class Runner {
    public static void main(String[] args) {
        IEditor[] array = new IEditor[3];
        array[0] = Factory.create(Editor.NOTE);
        array[1] = Factory.create(Editor.NOTEPAD);
        array[2] = Factory.create(Editor.WORD);
        for(int i = 0; i < 3; i++) {
            array[i].print();
            array[i].print1();
            array[i].print2();
            array[i].print3();
        }

    }
}
