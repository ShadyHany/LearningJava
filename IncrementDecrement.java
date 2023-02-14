class IncrementDecrement {
    public static void main(String args[]){

        int x;
        int y;
        int z;
        int l;
        int m;

        x=10;
        y=++x;
        z=x++;
        l=--x;
        m=x--;

        System.out.println(y+"\t"+z+"\n"+l+"\t"+m);
    }
}