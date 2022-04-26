
import Model.Encrypt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptTest {
    Encrypt testEncrypt = new Encrypt("HELLO",2);
    @Test
    public void checkIfNewInstanceIsCreated(){
        assertEquals(true, testEncrypt instanceof Encrypt );


    }
    @Test
    public void checkIfInputIsSaved(){
        assertEquals("HELLO", testEncrypt.getPlainText());
    }
    @Test
    public void checkIfKeyIsSaved(){
        assertEquals(2,testEncrypt.getShiftKey());
    }
    @Test
    public void checkIfKeyIsValid(){
        assertEquals(true, testEncrypt.sValidKey());
    }
    @Test
    public void checkIfIsNotEmpty(){
        assertEquals(true, testEncrypt.isNotEmpty());
    }
    @Test
    public void checkIfEncrypt(){
        Encrypt testEncrypt=new Encrypt("HELLO",2);
        assertEquals("JGNNQ",testEncrypt.encrypt());
    }
}