package solution;
import textio.TextIO;

public class Reader {

    public static void main(String[]args){
        double totalSales=0;
        int citiesWithNoData = 0;
        char indexedChar;
        TextIO.readFile("src\\sales.dat");
        while(!TextIO.eof()){
            for (int i=0; !TextIO.eoln(); i++){
                indexedChar = TextIO.getChar();
                if (indexedChar == ':'){
                    break;
                }
            }
            String temp = TextIO.getlnString();
            try{
                totalSales= totalSales+ Double.parseDouble(temp);
            }catch(IllegalArgumentException e){
                citiesWithNoData++;
            }
        }
        System.out.println("The sales total is "+totalSales+".");
        System.out.println("There were " +citiesWithNoData+ " cities with no data.");
    }
}
