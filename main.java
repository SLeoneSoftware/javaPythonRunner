/**
 * Code for pythonrunner, a java program used to run python files and obtain output
 * Primarily used to debug python files with JUnits
 * @author Steven Leone
 * @version 0 - debugging/development
 */

import java.util.HashMap;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class main {
	public static String pythonExecutionCommand = "python3";


	public static void main(String[] args) {
		//Usage java main "ex1.py arg1 arg2" "ex2.py arg1 arg2" ...



		for (int i = 0; i < args.length; i++) {
			//String[] argArray = args[i].split("\\s+");
			String command = pythonExecutionCommand + " " + args[i];
			String[] pythonargs = new String[] {"/bin/bash", "-c", command};
			try {
				Process proc = new ProcessBuilder(pythonargs).start();
				OutputStream out = proc.getOutputStream();

				InputStream is = proc.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));

				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}

			} catch (IOException e) {
				System.out.println(e.toString());
			}

		}


	}
}

