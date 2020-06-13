package SI_Lab2;
import org.junit.Test;
import static org.junit.Assert.*;

public class SILab2Test {



	    @Test
	    void multipleConditionsTest() {
	        // if (deg >= 0 && deg < 360) 
	        assertEquals(false, SILab2.function([Angle(-1,2,6)])); //(False) AND (X)
	        assertEquals(false, SILab2.function([Angle(2,361,56)])); //(True) AND (False)
	        //if (min < 0 || min > 59)
	        assertEquals(false, SILab2.function([Angle(5,-60,57)])); //(True) OR (X)
	        assertEquals(false, SILab2.function([Angle(5,61,57)])); //(False) OR (True)
	        
	        //if (sec < 0 || sec > 59)
	        assertEquals(false, SILab2.function([Angle(5,57,-60)])); //(True) OR (X)
	        assertEquals(false, SILab2.function([Angle(5,57,61)])); //(False) OR (True)
	        //if (min == 0 && sec == 0)
	        assertEquals(false, SILab2.function([Angle(-1,2,6)])); //(False) AND (X)
	        assertEquals(false, SILab2.function([Angle(2,0,56)])); //(True) AND (False)
	        
	    }   

	}