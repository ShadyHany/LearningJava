import java.io.PrintWriter;

class CharExample{
    public static void main(String args[]){

        char ch = 0;
        int i;

        try {
            PrintWriter output = new PrintWriter("output.txt");
            for (i = 0; i<65535; i++){
                output.print(ch);
                ch++;
            }

            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }




    }

}