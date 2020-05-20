/**
 * Static class for testing pythonrunner
 * @author Steven Leone
 * @version 0 - debugging/development
 */

import java.util.HashMap;
import java.util.ArrayList;


public class main {
	public static void main(String[] args) {
		pythonrunner r = new pythonrunner(pythonversion.PYTHON_THREE);
		String[] new_args = new String[] {"ex1.py arg1 arg2", "ex2.py arg1 arg2"};
		HashMap<String, ArrayList<String>> results = r.runPythonFiles(new_args);
		System.out.println(results.get("ex1.py").get(0));
	}
}

