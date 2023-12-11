package LLD4Example3PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) {
        RegisterModel a4RegisterModel = new RegisterModel();
        a4RegisterModel.setPrice(100);
        a4RegisterModel.setFact(1);
        a4RegisterModel.setNoOfPages(20);
        a4RegisterModel.setLength(100);
        a4RegisterModel.setBreath(20);
        a4RegisterModel.setCoverType(1);

        RegisterModel a5RegisterModel = new RegisterModel();
        a5RegisterModel.setPrice(100);
        a5RegisterModel.setFact(1);
        a5RegisterModel.setNoOfPages(20);
        a5RegisterModel.setLength(80);
        a5RegisterModel.setBreath(15);
        a5RegisterModel.setCoverType(2);

        RegisterModel a3RegisterModel = new RegisterModel();
        a3RegisterModel.setPrice(100);
        a3RegisterModel.setFact(1);
        a3RegisterModel.setNoOfPages(20);
        a3RegisterModel.setLength(120);
        a3RegisterModel.setBreath(30);
        a3RegisterModel.setCoverType(2);

        RegisterFactory registerFactory = new RegisterFactory();
        registerFactory.addRegister(RegisterType.A3, a3RegisterModel);
        registerFactory.addRegister(RegisterType.A5, a5RegisterModel);
        registerFactory.addRegister(RegisterType.A4, a4RegisterModel);

        for(int i=0;i<100;i++){
            RegisterModel newRegister = registerFactory.getRegister(RegisterType.A4).clone();
            newRegister.setFact(123);
            newRegister.setCoverType(12810);
        }
    }
}
