package LLD4Example3PrototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class RegisterFactory {

    private Map<RegisterType, RegisterModel> registers = new HashMap<RegisterType, RegisterModel>();

    public void addRegister(RegisterType type, RegisterModel registerModel) {
        this.registers.put(type, registerModel);
    }

    public RegisterModel getRegister(RegisterType type){
        if(this.registers.get(type) == null ) {
            throw new IllegalArgumentException("Invalid Register Type");
        }
        return this.registers.get(type);
    }
}
