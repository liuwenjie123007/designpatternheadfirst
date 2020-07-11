package chapter09.component;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        System.out.println();
        System.out.println("VEGETARIAN MENU");
        System.out.println();
        for(MenuComponent menuComponent : allMenus) {
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException ignored) {}
        }
    }
}
