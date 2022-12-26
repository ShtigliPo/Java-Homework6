package ru.gb;

/**
 * 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * 2. Создать множество ноутбуков.
 * 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
 * отвечающие фильтру. 
 * Критерии фильтрации можно хранить в Map.
 * Например:
 * “Введите цифру, соответствующую необходимому критерию:
 *      1 - ОЗУ
 *      2 - Объем ЖД
 *      3 - Операционная система
 *      4 - Цвет …
 * 4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 * 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.ArrayList;
import java.util.Scanner;

 public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in, "cp866");

        ArrayList<Laptop> laptops = new ArrayList<>();
        
        Laptop laptop1 = new Laptop("Acer", 15, 16, 512, "Win10", 1.7, 10, 35000);
        laptops.add(laptop1);

        Laptop laptop2 = new Laptop("Honor", 14, 8, 256, "Win10 Pro", 1.4, 7, 45000);
        laptops.add(laptop2);

        Laptop laptop3 = new Laptop("Lenovo", 13, 8, 128, "Chrome", 1.1, 13, 30000);
        laptops.add(laptop3);

        Laptop laptop4 = new Laptop("Acer", 14, 16, 256, "Win11", 1.2, 11, 55000);
        laptops.add(laptop4);

        Laptop laptop5 = new Laptop("Apple", 13, 8, 512, "MacOS", 1.3, 11, 80000);
        laptops.add(laptop5);

        Laptop laptop6 = new Laptop("HP", 15, 16, 512, "Win11 Pro", 1.3, 10, 130000);
        laptops.add(laptop6);

        Laptop laptop7 = new Laptop("ASUS", 16, 16, 1000, "Win10", 1.9, 7, 75000);
        laptops.add(laptop7);

        Laptop laptop8 = new Laptop("MSI", 17, 64, 2000, "Win11", 2.5, 7, 135000);
        laptops.add(laptop8);

        Laptop laptop9 = new Laptop("XiaXiom", 15, 8, 256, "Linux", 2.5, 5, 45000);
        laptops.add(laptop9);

        Laptop laptop10 = new Laptop("Sony", 16, 64, 2000, "Win11", 4.3, 4, 235000);
        laptops.add(laptop10);

        Laptop laptop11 = new Laptop("Lenovo", 15, 8, 256, "No Os", 2.0, 2, 25000);
        laptops.add(laptop11);
        
        System.out.println("Список ноутбуков: ");
        System.out.println(laptops);

        Laptop criteria = new Laptop("no", 0, 0, 0, "no", 0, 0, 0);

        while (true) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n0 - модель\n1 - размер дисплея\n2 - объём ОЗУ\n3 - объём ЖД\n4 - ОС\n5 - вес\n6 - время автономной работы\n7 - цена\n8 - выход ");
        
            String str = sc.nextLine();

            if (str.equals("0")) {
                System.out.println("Введите название модели: ");
                String str0 = sc.nextLine();
                criteria.setLaptopmodel(str0);
            }   

            if (str.equals("1")) {
                System.out.println("Введите минимальный размер дисплея в дюймах: ");
                String str1 = sc.nextLine();
                int number1 = Integer.valueOf(str1);
                criteria.setDisplaysize(number1);
            }

            if (str.equals("2")) {
                System.out.println("Введите минимальный объем ОЗУ в Гб: ");
                String str2 = sc.nextLine();
                int number2 = Integer.valueOf(str2);
                criteria.setRamsize(number2);
            }

            if (str.equals("3")) {
                System.out.println("Введите минимальный объём жёсткого диска в Гб: ");
                String str3 = sc.nextLine();
                int number3 = Integer.valueOf(str3);
                criteria.setHddcapacity(number3);
            }

            if (str.equals("4")) {
                System.out.println("Введите операционную систему: ");
                String str4 = sc.nextLine();
                criteria.setOperationsystem(str4);
            }

            if (str.equals("5")) {
                System.out.println("Введите максимальный вес в кг: ");
                String str5 = sc.nextLine();
                double number5 = Double.valueOf(str5);
                criteria.setLaptopweight(number5);
            }

            if (str.equals("6")) {
                System.out.println("Введите минимальное время автономной работы в часах: ");
                String str6 = sc.nextLine();
                int number6 = Integer.valueOf(str6);
                criteria.setBatterylife(number6);
            }

            if (str.equals("7")) {
                System.out.println("Введите максимальную цену в руб.: ");
                String str7 = sc.nextLine();
                int number7 = Integer.valueOf(str7);
                criteria.setLaptopprice(number7);
            }

            if (str.equals("8")) {
                break;
            }
        }

        System.out.println(criteria);

        ArrayList<Laptop> out = new ArrayList<>();

        for (Laptop laptop : laptops) {

            if (criteria.getLaptopmodel().equals("no") || criteria.getLaptopmodel().equals(laptop.getLaptopmodel())) {
                if (criteria.getDisplaysize() == 0 || criteria.getDisplaysize() <= laptop.getDisplaysize()) {
                    if (criteria.getRamsize() == 0 || criteria.getRamsize() <= laptop.getRamsize()) {
                        if (criteria.getHddcapacity() == 0 || criteria.getHddcapacity() <= laptop.getHddcapacity()) {
                            if (criteria.getOperationsystem().equals("no") || criteria.getOperationsystem().equals(laptop.getOperationsystem())) {
                                if (criteria.getLaptopweight() == 0 || criteria.getLaptopweight() >= laptop.getLaptopweight()) {
                                    if (criteria.getBatterylife() == 0 || criteria.getBatterylife() <= laptop.getBatterylife()) {
                                        if (criteria.getLaptopprice() == 0 || criteria.getLaptopprice() >= laptop.getLaptopprice()) {
                                            out.add(laptop);
                                        }
                                        else {
                                            continue;
                                        }
                                    }
                                    else {
                                        continue;
                                    }
                                }
                                else {
                                    continue;
                                }
                            }
                            else {
                                continue;
                            }
                        }
                        else {
                            continue;
                        }
                    }
                    else {
                        continue;
                    }
                }
                else {
                    continue;
                }
            }
            else {
                continue;
            }
        }

        if (out.isEmpty())
        {
            System.out.println("Таких ноутбуков нет. Проверьте параметры.");
        } else {
            System.out.println("Вот что у нас есть: ");
            System.out.println(out);
        }

        sc.close();
    }
}