package com.waikato.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.testng.annotations.DataProvider;
import au.com.bytecode.opencsv.CSVReader;

public class CsvDataProvider {

	@DataProvider(name = "CsvDataProvider")
	public static Iterator<Object[]> provideData(Method method) {

		List<Object[]> list = new ArrayList<Object[]>();
		String pathName = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "testdata"
				+ File.separator + method.getDeclaringClass().getSimpleName() + "_" + method.getName() + ".csv";
		File file = new File(pathName);

		try {
			CSVReader csvReader = new CSVReader(new FileReader(file));
			String[] keys = csvReader.readNext();
			if (keys != null) {
				String[] dataparts;
				while ((dataparts = csvReader.readNext()) != null) {
					Map<String, String> testData = new HashMap<String, String>();
					for (int i = 0; i < keys.length; i++) {
						testData.put(keys[i], dataparts[i]);
					}
					list.add(new Object[] { testData });
				}
			}
			csvReader.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException();

		} catch (IOException e) {
			// TODO: handle exception
		}
		return list.iterator();
	}
}