package chapter09.iterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new DinnerMenu());
        menus.add(new PancakeHouseMenu());
        menus.add(new CafeMenu());

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
