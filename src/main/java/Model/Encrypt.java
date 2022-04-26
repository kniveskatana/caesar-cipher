package Model;

public class Encrypt {
    private int sKey;
    private String sPlainText;


    public Encrypt (String plainText, int Key){
        sKey=Key;
        sPlainText=plainText;
    }

    public String getPlainText(){
        return sPlainText;
    }

    public int getShiftKey(){
        return sKey;
    }

    public boolean sValidKey(){
        return sKey>1 && sKey<26;
    }

    public boolean isNotEmpty() {
        return !sPlainText.trim().isEmpty();
    }


    public String encrypt(){
        String cypherText="";
        String cypherTextArray[]=sPlainText.split("");
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i<cypherTextArray.length; i++){
            if(sPlainText.charAt(i)==' '){
                cypherText +=" ";
            }else {
                int charPosition = alphabet.indexOf(sPlainText.charAt(i));
                int Key = (sKey+charPosition) %26;
                cypherText += alphabet.charAt(Key);
            }

        }

        return cypherText.toUpperCase();
    }
}


