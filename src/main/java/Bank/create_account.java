package Bank;

public class create_account extends Account
{

    public create_account(String n, int aNum, int b, String a_t) { // pass name and account type
        name = n;
        aNum = aNum;
        aBal = b;
        aType = a_t;
    }

    public create_account(String n, int aNum, String savings) {
    }

    void insert(String n,int aNum,String a_t){ // input username, account number and type
        name=n;
        aType=a_t;
        aNum=aNum; // generate random number
        aBal=0;
    }
    public void setInsert(String n)
    {
        name=n;
        n="Asad";

    }
    public String getInsert()
    {
        return name;

    }
    public void setaNum( int anum)
    {

        aNum=anum;
    }
    public int getaNum()
    {
        return aNum;

    }
    public void setatype(String a_t)
    {
        aType= a_t;
        a_t="Savings";
    }
    public String getatype()
    {
        return aType;

    }

    void displayAccountDetails(){
        System.out.println("Depositor Name :" +name);
        System.out.println("Account Number : "+aNum);
        System.out.println("Account Balance : "+aBal);
        System.out.println("Account Type : "+aType);
    }

    void deposit(int aNum,int money){
        aBal=money;
    }
    public void setdepo(double bal)
    {
        aBal=bal;
        bal=25000;

    }
    public double getdepo()
    {
        return aBal;
    }

    double withdraw(double withd){
        aBal=aBal-withd;
        return aBal;
    }
    public void setwithdraw(double bal)
    {
        aBal=aBal-10000;
        aBal=bal;

    }
    public double getwithdraw()
    {

        return aBal;
    }
    void calculateZakat()
    {
        if(aBal>=2000)
        {
            aBal=(aBal*2.5)/100;
            System.out.println(aBal);

        }
    }
    public void setZakat(double bal)
    {
        aBal=bal;
        bal= (bal*2.5)/100;
    }
    public double getZakat()
    {
        return aBal;
    }

}
