package builder;

public class BuildApplicationRunner {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setBuilder(new PersonApplicationBuilder());
//      or
//      manager.setBuilder((new builder.CompanyApplisationBuilder()));
        Application application = manager.buildApplication();
        System.out.println(application);
    }
}
