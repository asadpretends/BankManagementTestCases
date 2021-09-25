package Bank;
public class Account
{

        String name,aType;
        int aNum;
        double aBal;
        Account(){

        }
        Account(String n,int aNum,int b,String a_t){
            name=n;
            aNum=aNum;
            aBal=b;
            aType=a_t;
        }
    public void setName(String n)
    {
        name= n;
        n= "Asad";
    }
    public String getName()
    {
        return name;
    }

}
