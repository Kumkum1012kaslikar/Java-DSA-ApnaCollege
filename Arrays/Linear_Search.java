package Arrays;


public class Linear_Search {

    public static int lv(int [] num) {
        int lar=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            if(lar < num[i]){
                lar = num[i];
            }
        }
        return lar;
    }

    public static int sv(int [] num) {
        int small=Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(small > num[i]){
                small = num[i];
            }
        }
        return small;
    }

    public static int FK(int num[],int key) {
        for(int i=0;i<num.length;i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int num[]={2,14,6,8,18,10,14,16};
        int key=10;
        int integer = FK(num ,key);
        
        if(integer == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is found at index : "+integer);
        }

        int largest_value= lv(num);
        System.out.println("largest_value : "+largest_value);

        int smallest_value= sv(num);
        System.out.println("smallest_value : "+smallest_value);
    }
}
