public abstract class ApplicationBuilder {
    Application application;

    void createApplication() {
        application = new Application();
    }

    abstract void buildName();

    abstract void Cloud();

    abstract void buildPrice();

    Application getApplication() {
        return application;
    }
}
