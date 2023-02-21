class ParamDemo{


    public static void main(String args[])
            throws java.io.IOException{
        int input_x;

        System.out.print("enter a number from one digit: ");
        input_x = (int) System.in.read();

        ChkNum number = new ChkNum();
        boolean chkNumReturn = number.isEven(input_x);

        String ans;
        if (chkNumReturn == true) ans = "Yes";
        else ans = "NO";

        System.out.println("is the number even? "+ ans);



    }
}

class ChkNum{
    boolean isEven(int x){
    // return true if "x" is even
        if(x%2==0) return true;
        else return false;
    }
}