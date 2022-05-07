package framework.Junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Assertions_At_Junit.class,
	MyJunitTest.class,
	Junit_IgnoreMethod.class,
	Junit_WebDriver_Testcase.class})
public class Junit_TestSuite_Runner 
{
	
}
