class prime{
    public static void main(String[] args){
        int a=23,fc=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                fc=fc+1;
            }
        }if(fc==2){
            System.out.println("this is not prime number");
        }
        else{
            System.out.println("this is prime number");
        }
    }
}