import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;


@RunWith(PowerMockRunner.class)
@PrepareForTest(Account.class)
public class TestAccount {

    @Test
    public void shouldFailOnNullIdentifiers() throws NoSuchMethodException {
        String sSN="444102638";
        String lastTwoOffSSN = sSN.substring(sSN.length()-2 , sSN.length());
        int uniqueID = 10000;
        int randomNumber = (int)(Math.random()*Math.pow(10,3));

        Method method = Account.class.getDeclaredMeth od("setAccountNumber", String.class);
        method.setAccessible(true);
        String output = (String) method.invoke(Account, "Tuk");
        System.out.println(output);


        Account my = Mockito.mock(Account.class, Mockito.CALLS_REAL_METHODS);
        Assert.assertEquals("232343242", ((Account<?>) my).setAccountNumber());
    }



    @Test
    public void whenAddCalledVerified() {
      //  Account account = mock(Account.class);

//        Account a = new Account();
//        SomeOtherClass someOtherClass = Mockito.spy(new SomeOtherClass());
//        ReflectionTestUtils.setField( a, "someOtherClass", someOtherClass);
//        a.method( true );
//
//        Mockito.verify( someOtherClass, Mockito.times( 1 ) ).method1();
    }

    @Test
    public void givenNonAbstractMethod_whenConcreteImpl_testCorrectBehaviour() {
//        ConcreteImpl conClass = new ConcreteImpl();
//        String actual = conClass.defaultImpl();
//
//        assertEquals("DEFAULT-1", actual);
    }
    @Test
    public void whenMockPrivateMethod_thenVerifyBehaviour() throws Exception {
//        Account mockClass = PowerMockito.mock(Account.class);
//        PowerMockito.doCallRealMethod()
//                .when(mockClass)
//                .defaultImpl();
//        String dateTime = LocalDateTime.now().toString();
//        PowerMockito.doReturn(dateTime).when(mockClass, "setAccountNumber");
//        String actual = mockClass.setAccountNumber();
//
//        assertEquals(dateTime + "DEFAULT-1", actual);
    }



}
