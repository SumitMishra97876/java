package arraylist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadingListOfFilesAndWritingCountofEachWordsIntoOutputFile {
	
	public static void main(String[] args) {

		ArrayList<File> fileList = new ArrayList<File>();

//		fileList.add(new File("D:\\Sumit\\ArrayListFiles\\File1.txt"));
//
//		fileList.add(new File("D:\\Sumit\\ArrayListFiles\\File2.txt"));
//		fileList.add(new File("D:\\Sumit\\ArrayListFiles\\File3.txt"));

		fileList.add(new File("D:/Sumit/ArrayListFiles/File1.txt"));

		fileList.add(new File("D:/Sumit/ArrayListFiles/File2.txt"));
		fileList.add(new File("D:/Sumit/ArrayListFiles/File3.txt"));

		int size = fileList.size();

		for (int i = 0; i < size; i++) {

			System.out.println("For file-" + (i + 1) + ":");

			BufferedReader br = null;
			try {

				br = new BufferedReader(new FileReader(fileList.get(i)));

				String str;
				String str1 = "";

				while ((str = br.readLine()) != null) {

					str1 = str1 + str + " ";
				}

				String[] sarr = str1.split(" ");

				LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();

				int counter = 0;

				for (int j = 0; j < sarr.length; j++) {
					if (hmap.containsKey(sarr[j])) {
						counter = hmap.get(sarr[j]);
						counter = counter + 1;
						hmap.put(sarr[j], counter);
					} else {
						hmap.put(sarr[j], 1);
					}
				}

				Set<Map.Entry<String, Integer>> s = hmap.entrySet();
				int counter1=0;
				for (Map.Entry<String, Integer> s1 : s) {
					
					System.out.print(s1.getKey() + "=" + s1.getValue() + " ");
					FileWriter outputFile;
			        try
			        {
			            outputFile= new FileWriter("D:/Sumit/ArrayListFiles/output.txt",true);
			             
			            // Initializing BufferedWriter
			            BufferedWriter writer = new BufferedWriter(outputFile);
			            
			             
			            
			            if(counter1==0)
			            {
			            writer.write("For file-" + (i + 1) + ":");
			            writer.newLine();
			            counter1++;
			            }
			           
			            //writer.newLine();
			           
			            writer.write(s1.getKey() + "=" + s1.getValue() + " ");
			           
			            // For next line
			            writer.newLine();
			             
			            
			            // Closing BufferWriter to end operation
			            writer.close();
		            
			        }
			        catch (IOException except)
			        {
			            except.printStackTrace();
			        }
			 


				}

				System.out.println();
				System.out.println();
				
				
			}

			catch (Exception e) {

			} finally {

				try {
					br.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}

	}


}
