import product.*;

/*
4. Создать перечисление, содержащее типы продукции (для дома, для детей, хозтовары, фармация...).
Перечисление содержит метод getDescription, возвращающий информацию о типе продукции.
У каждого типа продукции должен быть свой идентификатор - уникальный код, который определяет
Создать интерфейс - выпуск продукции, один из методов которого - вывод продукции в зависимости от типа,
указанного в параметре
Создать абстрактный класс - Продукт, который имеет методы для понимания того, что это за продукт (придумываете сами).
Создать массив продуктов (создать свои классы,
одно из полей класса - перечисление, которое определяет, к какому типу продукции относится товар).
Создать класс Магазин, содержащий методы интерфейса + дополнительный метод,
который позволяет по переданному параметру - вывести продукты определеннго типа
 */
public class Runner {
    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Bed();
        arr[1] = new Door();
        arr[2] = new Lamp();
        arr[3] = new Toy();
        Shop shop = new Shop();
        shop.printHome(arr);
        shop.printProduct(arr[3]);

    }
}
