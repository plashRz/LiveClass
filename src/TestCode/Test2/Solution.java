package TestCode.Test2;

import java.util.Scanner;

class CipherDecipher{
    /**
     * This method is used to cipher the message (normal) by following steps.
     * Swap the cases of String - UpperCase letters to LowerCase letters and viceversa.
     * Reverse the String
     * Replace the spaces of string with a star character("*")
     * Replace the characters in the even positions of the string
     * Append any integer at the last in that String
     *
     * @param normal
     * @return the ciphered message
     */
    public String ciphering(String normal){

        String temp = normal;
        temp = temp.replaceAll("[0-9]","");
        StringBuilder sb = new StringBuilder(temp);
        int l = sb.length();
        int m=0;

        for(int i=0;i<l;i++){

            char c = sb.charAt(i);

            if((c>=65 && c<=90) || (c>=97 && c<=122)){

                if(Character.isUpperCase(c)){
                    c =Character.toLowerCase(c);
                    sb.replace(i,i+1,c+"");
                } else {
                    c =Character.toUpperCase(c);
                    sb.replace(i,i+1,c+"");
                }

            }

        }

        sb = sb.reverse();
        temp = sb.toString().replaceAll(" ","*");
        sb = new StringBuilder();
        l = temp.length();

        for(int x =0; x<l;x++){

            m = temp.charAt(x);
            if(x%2!=0){
                sb.append(m);
            }else {
                sb.append(temp.charAt(x));
            }
        }

        sb.append(3);

        //Write your code here
        return sb.toString();
    }
    /**
     * This method is used to get the normal text by the reverse process of ciphering.
     *
     * @param ciphered
     * @return the deciphered message
     */
    public String deciphering(String ciphered){

        String temp = ciphered;
        StringBuilder sb = new StringBuilder(temp);
        int l = sb.length();
        char m=0,n=0;

        sb.deleteCharAt(l-1);
        temp = sb.toString();

        l = temp.length();
        sb = new StringBuilder();
        int count=0,num=0;

        for(int i=0; i<l;i++){
            m = temp.charAt(i);

            while(Character.isDigit(m)){
                count++;
                i++;
                if(i!=l){
                    m = temp.charAt(i);
                }else {
                    break;
                }

            }

            if(count==2){
                num = (temp.charAt(i-2)-48)*10+(temp.charAt(i-1)-48);
                m= (char) num;
                count=0;
                i--;
            }
            if(count==3){
                num =((temp.charAt(i-3)-48)*100) + ((temp.charAt(i-2)-48)*10)+ (temp.charAt(i-1)-48);
                m = (char) num;
                count=0;
                i--;
            }
            sb.append(m);

        }

        temp = sb.toString().replaceAll("\\*"," ");
        sb = new StringBuilder(temp);
        sb = sb.reverse();
        l=sb.length();

        for(int i=0;i<l;i++){

            char c = sb.charAt(i);

            if((c>=65 && c<=90) || (c>=97 && c<=122)){

                if(Character.isUpperCase(c)){
                    c =Character.toLowerCase(c);
                    sb.replace(i,i+1,c+"");
                } else {
                    c =Character.toUpperCase(c);
                    sb.replace(i,i+1,c+"");
                }

            }

        }
        //Write your code here
        return sb.toString();
    }
}

public class Solution {

    public static void main(String[] args){
        Scanner readInput = new Scanner(System.in);
        //String normal=readInput.nextLine();
        //String ciphered=readInput.nextLine();

        CipherDecipher cipherOrDecipher = new CipherDecipher();
        System.out.println(cipherOrDecipher.ciphering("This is Insane stuff!!"));
        //System.out.println(cipherOrDecipher.ciphering(normal));
        System.out.println(cipherOrDecipher.deciphering("!33F70U84S42E78A83N105*83I42S73H1163"));

    }
//K78A82R69K67A72*79T42E77O67L69w3
//?85O89*69R65*87O104*33I1043
}