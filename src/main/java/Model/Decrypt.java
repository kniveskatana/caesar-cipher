package Model;

public class Decrypt {
    private int sKey;
    private String sPlainText;


    public Decrypt (String plainText, int Key){
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




    public String decrypt(){
        String normalText="";
        String normalTextArray[]=sPlainText.split("");
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i<normalTextArray.length; i++){
            if(sPlainText.charAt(i)==' '){
                normalText +="";
            }else {
                int charPosition = alphabet.indexOf(sPlainText.charAt(i));
                int Key = (charPosition-sKey) %26;
                if (Key<0){
                    Key=alphabet.length( )+Key;
                }

                char replaceValue=alphabet.charAt(Key);
                normalText += replaceValue;

            }

        }

        return normalText;
    }
}