import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PierwszyTest {

    String imie = "Michał";

    @BeforeClass
    public void setUp(){
        imie = "Jan";
    }

    @Test
    public void Pierwszy(){
        System.out.println("Pierwszy test");
        Assert.assertEquals(1,1);

    }

    @Test
    public void CzyImieToJan(){
        Assert.assertEquals("Michał",imie);
    }

    @AfterMethod
    public void tearDown(){
        Assert.assertEquals(imie, "Jan");
    }
}
