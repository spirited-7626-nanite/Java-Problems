/*
Solid Rectangle Problem : 

Print : 
*****
*****
*****
*****    4 rows and 5 columns 
*/

class Problem{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){ // for the rows 

            for(int j=0;j<5;j++){// for the columns
                
                System.out.print("*"); // to change the line else loop will go in a stright one column
            }
            System.out.println();
        }
    }
}
