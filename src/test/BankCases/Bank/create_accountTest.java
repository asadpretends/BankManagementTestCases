package Bank;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class create_accountTest {
    create_account object;
    @Before
    public void first()
    {
    object = new create_account("Asad", 0000, "Savings");
    }
    @Test
    public void insert()
    {
    Assert.assertEquals(null,object.getInsert() );
    Assert.assertEquals(0000,object.getaNum() );
    Assert.assertEquals(null,object.getatype() );
    }
    @Before
    public void first1()
    {
        object = new create_account(null,0000, 25000,null);
    }

    @Test
    public void deposit()
    {
        Assert.assertEquals(25000, object.getdepo(),0.0001);
    }

    @Before
    public void first2()
    {
        object = new create_account(null, 0000, 15000,null);
    }
    @Test
    public void withdraw()
    {
        object.setwithdraw(15000);
    Assert.assertEquals(15000, object.getwithdraw(),0.0001);
    }

    @Before
    public void first3()
    {
        object = new create_account(null, 0000, 14625,null);
    }

    @Test
    public void calculateZakat()
    {
        object.setwithdraw(14625);
    Assert.assertEquals(14625,object.getZakat(),0.0001);
    }


}