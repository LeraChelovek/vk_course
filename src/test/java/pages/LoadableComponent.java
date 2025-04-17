package pages;

public abstract class LoadableComponent<T extends LoadableComponent<T>> {

   // protected abstract void load();
    protected abstract void isLoaded() throws Error;
    //так как я использую метод с аннотацией BeforeEach, то дублирование кода как будто не логично
    /*@SuppressWarnings("unchecked")
    public T get() {
        try {
            load();
            isLoaded();
            return (T) this;
        } catch (Error e) {
            throw new RuntimeException("Component failed to load: " + e.getMessage(), e);
        }
    }*/
}
