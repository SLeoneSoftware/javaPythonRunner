/**
 * Code for pythonrunner, a java program used to run python files and obtain output
 * Primarily used to debug python files with JUnits
 * @author Steven Leone
 * @version 0 - debugging/development
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class pythonrunner {

	private pythonversion v;

	public pythonrunner() {
		this(pythonversion.PYTHON_TWO);
	}

	public pythonrunner(pythonversion v) {
		this.v = v;
	}

	public HashMap<String, ArrayList<String>> runPythonFiles(String[] args) {
		HashMap<String, ArrayList<String>> retMap = new HashMap<>();
		for (int i = 0; i < args.length; i++) {
			String command = v.getExecutionCommand() + " " + args[i];
			String pythonFile = args[i].substring(0, args[i].indexOf(".py") + 3).trim();
			String[] pythonargs = new String[] {"/bin/bash", "-c", command};
			try {
				Process proc = new ProcessBuilder(pythonargs).start();
				OutputStream out = proc.getOutputStream();

				InputStream is = proc.getInputStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(is));

				String line = null;
				ArrayList<String> printedVals = new ArrayList<>();
				while ((line = reader.readLine()) != null) {
					printedVals.add(line);
				}
				retMap.put(pythonFile, printedVals);
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		return retMap;
	}


}