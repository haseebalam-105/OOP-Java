public class ContractBase extends Employee
{
    private double projectPrice;

    public ContractBase(String name, int id,double projectPrice)
    {
        super(name, id);
        this.projectPrice = projectPrice;
    }

    @Override
    public double calculatePay() {
        return projectPrice;
    }

    @Override
    public String getPaySlip() {
        return super.getPaySlip()+
                " Pay of the contract : " +
                calculatePay();
    }
}
