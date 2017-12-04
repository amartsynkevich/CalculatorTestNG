import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderExample {

    @DataProvider(name = "addMethodDataProvider")
    public Object[][] dataProvider() {
        return new Object[][] { { 2, 5, "+", 7 }, { 3, 7, "+", 11 }, { 4, 5, "+", 9 } };
    }

    @Test(dataProvider = "addMethodDataProvider")
    public void testAddMethod(Integer number1, Integer number2, String sign , Integer result) {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.calculate(number1, number2, sign), result);
    }

}