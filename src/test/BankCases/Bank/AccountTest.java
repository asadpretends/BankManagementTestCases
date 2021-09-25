package Bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


    public class AccountTest {
        create_account object;
        @Before
        public void first()
        {
            object = new create_account("Asad", 0, 0, "Savings");


        }
        @Test
        public void constructortest()
        {
            Assert.assertEquals("Asad", object.getName());
        }
    }

