public class CompanyApplisationBuilder extends ApplicationBuilder {
    @Override
    void buildName() {
        application.setName("Company application");
    }

    @Override
    void Cloud() {
        application.setCloud(Clouds.AWS);
    }

    @Override
    void buildPrice() {
        application.setPrice(20000);
    }
}
