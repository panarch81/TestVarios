package cl.panarch.main;


public class TestArrays {


        private String [] stringArray = new String[3];
        String [] stringArray2;
        String[][][] occupantName = new String[3][2][2];
        int[][] myArray = new int[3][];
        int[] intArray = new int[2];
        int[] intArray2;       
        int[][] scores;
        int[] intArray3 = new int[]{4,5,6};
        int[] intArray4 = {7,8};     
        // Declare and create an array holding three references
        // to int arrays
       
        public void constructArrays(){
            scores = new int[3][];
            scores[0] = new int[4];
            // the first element in the scores array is an int array
            // of four int elements
            scores[1] = new int[6];
            // the second element in the scores array is an int array
            // of six int elements
            scores[2] = new int[1];
            // the third element in the scores array is an int array
            // of one int element
        }
       
       
        public void constructArray2D(){
            myArray[0] = new int[2];
            myArray[0][0] = 6;
            myArray[0][1] = 7;
            myArray[1] = new int[3];
            myArray[1][0] = 9;
            myArray[1][1] = 8;
            myArray[1][2] = 5;                     
        }
       
        public void populateOtherArrays(){
            stringArray2 = new String[3];
            intArray2 = new int[2];
            
            for (int i = 0; i< stringArray2.length; i++){
            	if(i%2==0)
            		stringArray2[i] = "gatito_"+i;
            	else
            		stringArray2[i] = "perrito_"+i;
            }
            
            for (int i = 0; i< stringArray2.length; i++){
            	System.out.println(stringArray2[i]);
            }
            
        }
       
        public String[] getStringArray() {
            return stringArray;
        }

        public void setStringArray(String[] stringArray) {
            this.stringArray = stringArray;
        }

       
       
       
       
       
}
