class LoopTermination{
    public static void main(String args[])
    throws java.io.IOException {

        char ch;

        for(;;){
                           // read is buffer
            ch = (char) System.in.read(); // get a char
            if (ch == 'q') break;
            System.out.println("to quit press q");
        }
        System.out.println("You pressed q!");

    }


}