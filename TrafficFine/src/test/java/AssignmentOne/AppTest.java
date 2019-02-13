package AssignmentOne;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void fineTest(){
        Fine fine = new Fine("CA123456", "Toyota", 500.00);
        Assert.assertThat(fine.getLicenseNumber().length(), equalTo(8));
        Assert.assertThat(fine.getVehicle(), equalTo("Toyota"));
        Assert.assertThat(fine.getFineAmount(), equalTo(500.00));
    }


}
