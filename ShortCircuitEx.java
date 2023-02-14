class ShortCircuitEx {
    public static void main(String args[]){

        // Side effects of short circuits

        int i;
        i =0;
        /* Here, i is still incremented even though
        the if statement fails
         */

        if( false & (++i < 100)){

            System.out.println("this won't be displayed");
        }
        System.out.println("if statement executed: "+ i);

        /* in this case, i is not incremented because the
        short-circuit operator skips the increment.
         */
        if (false && (++i < 100)){

            System.out.println("this won't be displayed");

        }

        System.out.println("if statment executed: "+ i);
    }

}
