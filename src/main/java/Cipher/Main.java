package cipher;

import Model.Decrypt;
import Model.Encrypt;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Welcome to Caesar Cipher application");
        String plainText;
        int Key;
        System.out.println("Please select a choice(either 1 or 2); 1. Encrypt, or 2. Decrypt");
        int Choice= in.nextInt();
        in.nextLine();

        if(Choice==1){
            System.out.println("Input message to Encrypt");
            plainText=in.nextLine().toUpperCase();
            System.out.println("Input preferred Key");
            Key=in.nextInt();

            Encrypt encrypt=new Encrypt(plainText,Key);
            System.out.println(String.format("Your input text was:%s",encrypt.getPlainText()));
            System.out.println(String.format("Your encrypted message is:%s",encrypt.encrypt()));

        }else if (Choice==2){
            System.out.println("Input text to Decrypt");
            plainText=in.nextLine().toUpperCase();
            System.out.println("Input preferred Key");
            Key=in.nextInt();

            Decrypt decrypt=new Decrypt(plainText,Key);
            System.out.println(String.format("Your input text was:%s",decrypt.getPlainText()));
            System.out.println(String.format("Your decrypted message is:%s",decrypt.decrypt()));


        }else{
            System.out.println("This is not a known input");
        }

    }

}