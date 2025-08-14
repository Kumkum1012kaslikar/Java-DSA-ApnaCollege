package function;

public class isPrime {
    public static boolean isPrim(int n) {
        if(n == 2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n); i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrim(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void BinToDec(int binNum) {
        int MyNum=binNum;
        int pow=0;
        int decNum=0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
         decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
         pow++;

         binNum =binNum/10;
        }
        System.out.println("decimal of " +MyNum +" ="+ decNum);
    }

    public static void decToBin(int decNum) {
        int MyNum=decNum;
        int pow=0;
        int binNum=0;

        while(decNum > 0){
            int rem = decNum % 2;
         binNum = binNum + (rem * (int)Math.pow(10,pow));
         pow++;

         decNum =decNum/2;
        }
        System.out.println("binary of " +MyNum +" ="+ binNum);
    }
   
    public static void main(String[] args) {
        System.out.println(isPrim(4));
        primesInRange(20);
        BinToDec(101);
        decToBin(5);
    }
}
