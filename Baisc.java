public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1001";
        int decimal = 0;
        getBinaryToDecimal(binary,decimal);
    }

    private static void getBinaryToDecimal(String s,int decimal) {
        for (int i = s.length() - 1; i >= 0; i--) {
            int bit = s.charAt(i)-'0'; //convert to int
            int position = s.length()-1-i;   //right most position is 0 right
            int value = bit*(int) Math.pow(2,position);
            decimal+=value;
            System.out.println("bit: "+bit+", position: "+position+", value: "+value);
        }
    }
    //inBuilt function
    int decimal = Integer.parseInt("1101", 2); // returns 13

}


=============================================
class DecimalTOBinary{
    public static void main(String[] args) {
        int n=13;  //1101  1+4+8
        String s = decimalToBinary(n);
        System.out.println(s);
    }

    private static String decimalToBinary(int n) {
        if(n==0) return "0";
        StringBuilder binary = new StringBuilder();
        while (n>0){
            binary.append(n%2); //1,   0  1 1
            n=n/2; //6  ,3, 1,0
        }
        return binary.reverse().toString();
    }
//Inbuilt function  
String binary = Integer.toBinaryString(13); // returns "1101"

}

======================================

=======================================================

    
