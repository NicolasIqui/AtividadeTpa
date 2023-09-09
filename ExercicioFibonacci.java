public class ExercicioFibonacci {
    public static void main(String[] args) {
    
        int num=1,numa=0,nump=num+numa;
        while(num<55){
            nump=numa+num;
            numa=num;
            num=nump;

             System.out.println("o numero e "+nump );
        }
        
    }

}
