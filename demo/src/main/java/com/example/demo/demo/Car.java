package com.example.demo.demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by xiaoh on 2018/2/1.
 */
public class Car{

    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
    
    public static void main(String[] args){  
        Car c = Car.create(Car::new);
        c.repair();
        List< Car > cars = Arrays.asList(c);

        System.out.println(cars.size());

        //静态方法
        cars.forEach(Car::collide);

        //对象方法
        cars.forEach(Car::repair);

        Thread thread = new Thread(()->{
           System.out.println("打印一下");
        });


        cars.forEach((Car t)->{
            t.repair();
           // System.out.println(t.repair()+"***");
        });

        thread.start();

    }
}
