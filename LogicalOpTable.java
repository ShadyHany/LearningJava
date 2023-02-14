class LogicalOpTable{
    public static void main(String args[]){

        boolean p, q;                   // 0  1   NAND each with 1
        boolean truthTable = true;      // 1  0   NAND each with 0
        int i;                          // 1  1   NAND each with 1
        int r; //hold modules result    // 0  0

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT p\t\tNOT q");

        p=false; q=true;

        for(i=0;i<4;i++) {
            System.out.print(p + "\t" + q + "\t");
            System.out.print((p & q) + "\t" + (p | q) + "\t");
            System.out.println((p ^ q) + "\t" + (!p)+"\t\t"+(!q));

            r = i%2;
            if(r == 0) {
                truthTable = true;
            } else if (r == 1) {
                truthTable = false;
            }

            p = !(truthTable & p);
            q = !(truthTable & q);

        }


    }
}