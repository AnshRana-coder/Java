package College.Unit1;

public class hello {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("Starting with java programming");
        
        //airthmatic operation

        int a = 2;
        int b = 3;
        int c;
        c = a+b;
        System.out.println("Additon "+c);
        c = a-b;
        System.out.println("Subtraction "+c);
        c = a*b;
        System.out.println("MUltipilication "+c);
        c = a/b;
        System.out.println("division "+c);

        //addition of all digits

        int d=12345;
        int e=d;
        int f=d;
        int x=0;
        int sum=0;
        //without loop
        sum = f%10 + (f/10)%10 + (f/100)%10 + (f/1000)%10 +(f/10000)%10;
        System.out.println("adition of digits in "+e+" "+sum);
        //with loop
        while(d>0){
            x= x+ d%10;
            d=d/10;
        }
        System.out.println("adition of digits in "+e+" "+x);
        // C to F 
        int C=37;
        int  F = (C * 9/5) + 32 ;
        System.out.println("32 C to F is "+ F +" F");
        // Reverse the given no.
        int n=12345;
        x=0;
        int z=0;
        while(n>0){
            x = n%10;
            z = z*10+x;
            n = n/10;
        }
        System.out.println("Reverse of "+e+" is "+z);
    } 
}