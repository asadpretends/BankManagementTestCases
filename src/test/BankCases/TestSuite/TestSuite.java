package TestSuite;

import Bank.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({create_accountTest.class, AccountTest.class})
public class TestSuite {
}
