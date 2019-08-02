package blog.biswas.video.oopclass2;

public class Loan {
    int loanAmount;
    int dipositAmount;

    public void setLoanAmount(int amount){
        loanAmount = amount;
    }
    public void setDipositAmount(int amount){
        dipositAmount = dipositAmount + amount;
    }
    public int getDueAmount(){
        return loanAmount - dipositAmount;
    }
}
