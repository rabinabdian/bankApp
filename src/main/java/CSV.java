import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.*;

public class CSV {

    // read data from csv file

    public static List<String[]> read(String file){

        List<String[]> data = new LinkedList<String[]>();
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((dataRow = br.readLine())!=null){
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }

        return data;
    }




}
