public class Array_Declaration {
    public static void main(String[] args){

        // ---------- FIST APPROACH TO DEFINE ARRAY ----------

        // Create an Array
        int[] marks = new int[5];
        // Storing values in Array
        marks[0] = 95;
        marks[1] = 93;
        marks[2] = 91;
        marks[3] = 90;
        marks[4] = 96;

        // Loop to print values from index 0 to 4
        for(int i=0; i<5; i++){
            System.out.println(marks[i]);
        }

        // ---------- FIST APPROACH TO DEFINE ARRAY ----------

        // Create an  Array
        int[] MARKS = {95, 93, 91, 90, 96};
         // Loop to print values from index 0 to 4
        for(int j=0; j<5; j++){
            System.out.println(MARKS[j]);
        }

    }
}