package chapter09.component;

public interface MenuComponent extends Iterable<MenuComponent>{
    default void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("add");
    }
    default void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("remove");
    }
    default MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("getChild");
    }
    default String getName() {
        throw new UnsupportedOperationException("getName");
    }
    default String getDescription() {
        throw new UnsupportedOperationException("getDescription");
    }
    default double getPrice() {
        throw new UnsupportedOperationException("getPrice");
    }
    default boolean isVegetarian() {
        throw new UnsupportedOperationException("isVegetarian");
    }
    default void print() {
        throw new UnsupportedOperationException("print");
    }
}
