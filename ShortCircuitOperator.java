// Demonstrate the short-circuit operators
class ShortCircuitOperator{
    public static void main(String args[]){
    int n,d,q;

    n = 10;
    d = 2;
    if(d !=0 && (n%d)==0){
        System.out.println(d + " is a factor of " + n);

    }
    d = 0; // now, set d to zero

    // Since d is zero, the second operand is not evaluated.

    if(d != 0 && (n%d)==0){   //the short-circuit
                             // operator prevents
                            // a division by zero
        System.out.println(d+" is a factor of "+n);
    }

    /* the same thing without the short circuit operator
       this will cause a divide-by-zero error
     */
    try{

        if (d != 0 & (n%d)==0){
            System.out.println(d + " is a factor of "+ n);
        }
    } catch(Exception e) {
        e.getStackTrace();
    }

    }
}
