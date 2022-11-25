package movist;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
    private List<Car> carList = List.of(
            new Car(1, "Ford", "Mustang", "Red", "ADF-1121", 2021, 59000),
            new Car(2, "Nissan", "Leaf", "White", "SSJ - 3002", 2019, 29000),
            new Car(3, "Toyota", "Prius", "Silver", "KKO - 0212", 2020, 39000),
            new Car(4, "Audi", "A7", "Beige", "XJS - 3020", 2022, 150000),
            new Car(5, "BWM", "X7", "Blue", "TKK - 2424", 2019, 74000),
            new Car(6, "Audi", "RS6", "Crimson", "AUK - 5731", 2021, 124000),
            new Car(7, "Chevrolet", "Camaro", "Yellow", "NHX - 7128", 2020, 39000),
            new Car(8, "Infiniti", "Q30", "Black", "KEN - 4555", 2017, 81000),
            new Car(9, "Mitsubishi", "Eclipse", "Amethyst", "ROF - 9984", 2022, 118000),
            new Car(10, "Jaguar", "C-X75", "Orange", "PVM - 3797", 2022, 230000)
    );

    public List<String> mapMethod() {
        List<String> models = carList.stream().map(Car::getModel).collect(Collectors.toList());
        return models;
    }

    public List<Car> filterMethod(Integer underThenPrice) {
        //фильтр по цене
        return carList.stream().filter(car -> car.getPrice() < underThenPrice).collect(Collectors.toList());
    }

    public List<Car> forEachMethod(Double priceMultiply) {
        //изменение цен по коэффициенту всех машин
        carList.stream().forEach(car -> car.setPrice((int) (car.getPrice() * priceMultiply)));
        return carList;
    }

    public List<Car> sortedMethod() {
        //сортировка по цвету
        List<Car> sortedCarList = carList.stream().sorted((x, y) ->
                x.getColor().compareTo(y.getColor())
        ).collect(Collectors.toList());
        return sortedCarList;
    }

    public Set<String> collectMethod() {
        Set<String> brands = carList.stream().map(Car::getBrand).collect(Collectors.toSet());
        return brands;
    }
}
