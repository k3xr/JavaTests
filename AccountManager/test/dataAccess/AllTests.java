package dataAccess;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CustomerTest.class, OrderTest.class, DataAccessSingletonTest.class })
public class AllTests {

}
