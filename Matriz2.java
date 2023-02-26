public class Matriz2 {

	public static void main(String[] args) {

            int [][] Matriz = new int [4][4];
            int i=0;
            for(int j = 0; j < 4; j++) {
            	System.out.print(j+1+ ": ");
            for (int p=0; p<4; p++) {
            	Matriz [j][p]=i;
            	i=i+2;
           System.out.print(" "+ i ); 		
            }
            System.out.println(".");
            System.out.println("Thanks");
            System.out.println(";)");
           }
}
}