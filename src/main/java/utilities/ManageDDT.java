package utilities;

import org.python.antlr.ast.For;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;




public class ManageDDT extends CommonOps{

    @DataProvider(name = "data-provider-products")
    public Object[][] getdataobject() {
        return getDataFromCSV(getData("DDTfile"));
    }


   public static List<String> ReadCSV(String csvFile) {
       List<String> results = null;
       File file = new File(csvFile);
       try {
           results = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
       } catch (IOException e) {
           e.printStackTrace();
       }

       return results;
   }
   public static Object[][] getDataFromCSV(String filepath) {
       Object[][] data = new Object[3][2];
       List<String> csvData = ReadCSV(filepath);
       for(int i = 0; i < csvData.size(); i++){
           data[i][0] = csvData.get(i).split(",")[0];
           data[i][1] = csvData.get(i).split(",")[1];
       }
       return data;
   }
}
