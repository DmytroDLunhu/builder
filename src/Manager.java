public class Manager {
    public void setBuilder(ApplicationBuilder builder) {
        this.builder = builder;
    }

    ApplicationBuilder builder;

    Application buildApplication() {
        builder.createApplication();
        builder.buildName();
        builder.Cloud();
        builder.buildPrice();
        Application application = builder.getApplication();
        return application;
    }
}
