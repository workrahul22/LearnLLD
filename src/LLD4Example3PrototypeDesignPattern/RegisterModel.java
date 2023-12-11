package LLD4Example3PrototypeDesignPattern;

public class RegisterModel implements Clonable{
    private int noOfPages;
    private int length;
    private int breath;
    private int price;
    private int fact;
    private int coverType;

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFact() {
        return fact;
    }

    public void setFact(int fact) {
        this.fact = fact;
    }

    public int getCoverType() {
        return coverType;
    }

    public void setCoverType(int coverType) {
        this.coverType = coverType;
    }

    public RegisterModel clone() {
        RegisterModel register = new RegisterModel();
        register.setBreath(this.getBreath());
        register.setFact(this.getFact());
        register.setCoverType(this.getCoverType());
        register.setLength(this.getLength());
        register.setNoOfPages(this.getNoOfPages());
        register.setPrice(this.getPrice());
        return register;
    }
}
