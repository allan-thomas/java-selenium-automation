import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVReaderPgm {

	@Test
	public void csvdatareader() throws IOException, CsvException {
		// TODO Auto-generated method stub
		
		CSVReader reader = new CSVReader(new FileReader(".\\src\\data.csv"));
		System.out.println("file found");
		
		List<String[]> data = reader.readAll();
		
		for(String[] row : data) {
			System.out.println(Arrays.toString(row));
		}

	}

}
