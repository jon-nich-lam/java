public class PrimitiveOperations{
    public static void main(String[] args){
        int variableInt = 10;
        double variableDb = 20.0;
        System.out.println(variableInt);
        System.out.println(variableDb);
        
        double numProduct = variableInt * variableDb;
        System.out.println(numProduct);

        double newDb = (double)variableInt;
        System.out.println(newDb);

        char variableChar = 'A';
        System.out.println(variableChar);

        char newChar = (char)((int)variableChar + 32);
        System.out.println(newChar);
        
    }
}