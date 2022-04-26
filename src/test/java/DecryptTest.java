import Model.Decrypt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecryptTest {
    Decrypt testDecrypt = new Decrypt("HELLO",2);
    @Test
    public void checkIfNewInstanceIsCreated(){
        assertEquals(true,testDecrypt instanceof Decrypt);
    }
    @Test
    public void checkIfInputIsSaved(){
        assertEquals("HELLO", testDecrypt.getPlainText());
    }
    @Test
    public void checkIfKeyIsSaved(){
        assertEquals(2,testDecrypt.getShiftKey());
    }
    @Test
    public void checkIfKeyIsValid(){
        assertEquals(true, testDecrypt.sValidKey());
    }
    @Test
    public void checkIfIsNotEmpty(){
        assertEquals(true, testDecrypt.isNotEmpty());
    }
    @Test
    public void checkIfEncrypt(){
        Decrypt testDecrypt=new Decrypt("HELLO",2);
        assertEquals("FCJJM",testDecrypt.decrypt());
    }
}
