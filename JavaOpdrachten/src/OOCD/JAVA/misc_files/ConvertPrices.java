package OOCD.JAVA.misc_files;

import java.io.*;
import java.nio.Buffer;

public class ConvertPrices {
    public static void main(String[] args) throws IOException{
        double course = 91.8720;
        //open file to read
        FileReader fr = new FileReader("C:\\Users\\Max Stoltenborgh\\IdeaProjects\\HU_Huiswerk\\JavaOpdrachten" + //your path here
                "\\src\\OOCD\\JAVA\\misc_files\\prices_usd.txt");
        BufferedReader br = new BufferedReader(fr);
        //open file to write
        FileWriter fw = new FileWriter("C:\\Users\\Max Stoltenborgh\\IdeaProjects\\HU_Huiswerk\\JavaOpdrachten" + //your filepath here
                "\\src\\OOCD\\JAVA\\misc_files\\prices_eur.txt");
        PrintWriter pw = new PrintWriter(fw);

        //convert price per line
        String line = br.readLine();
        while (line != null)
        {
            String[] values = line.split(":");
            double usdPrice = Double.parseDouble(values[1]);
            String linetowrite = String.format("%s : %.2f", values[0], usdPrice*course*0.01);
            pw.println(linetowrite);
            /*for(String value : values){
                value.strip();
                System.out.println(value);
            }*/
            line = br.readLine();
        }
        br.close();
        pw.close();

    }
}
