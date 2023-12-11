package LLD3AssignmentPart2;

public class TaxCalculatorFactory {

    public TaxCalculatorInterface getTaxCalculator(Employee e) {

        switch (e.type) {
            case FULL_TIME:
                return FullTimeTaxCalculator.INSTANCE;
            case PART_TIME:
                return PartTimeTaxCalculator.INSTANCE;
            case INTERN:
                return InternTaxCalculator.INSTANCE;
        }
        return null;
    }
}
