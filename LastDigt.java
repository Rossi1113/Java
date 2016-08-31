public class LastDigt {
    public int findLastDigt(int[] value){
        int ld = (10-(3*value[0]+value[1]+3*value[2]+value[3]+3*value[4]+value[5]+3*value[6]+value[7]+3*value[8]+value[9]+3*value[10])%10)%10;
        return ld;
    }

    public static void main(String[] args) {
        int i;
        int[] anArray = new int[] {9,8,7,6,5,4,3,2,1,0,9};
        LastDigt lastDigt = new LastDigt();
        int ld = lastDigt.findLastDigt(anArray);
        
        System.out.print("The UPC code is: ");
        for(i=0;i < anArray.length;i++){
            System.out.print(anArray[i] + " "); 
        }
        System.out.println(ld + ".");
     }
}
