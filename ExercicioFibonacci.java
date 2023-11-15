public class ExercicioFibonacci {
    public static void main(String[] args) {
    
        int  i=1,num=1,numa=0,nump=num+numa;
        while(i<=10){
            nump=numa+num;
            numa=num;
            num=nump;

             System.out.println(""+numa );
        }
        
    }

}
