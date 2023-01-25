package builder;

public class PersonApplicationBuilder extends ApplicationBuilder {
    @Override
    void buildName() {
        application.setName("Appication's main page");
    }

    @Override
    void Cloud() {
        application.setCloud(Clouds.GCP);
    }

    @Override
    void buildPrice() {
        application.setPrice(10000);
    }
}
