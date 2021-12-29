public class Summing {
    public static void main(String[] args){
        int[] intArr = {6, 42, 3, 7};
        
        int sum = 0;
        for(int i = 0; i < intArr.length; i++)
            sum += intArr[i];

        System.out.println(sum);
    }    
}
