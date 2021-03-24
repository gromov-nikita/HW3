public interface IEditor {
    void print1();
    void print2();
    void print3();
    default void print() {
        System.out.println("Editor");
    }


}
