/**
 * Static class for testing pythonrunner
 * @author Steven Leone
 */

import java.util.HashMap;
import java.util.ArrayList;

/*
Example code. Creates a Pythonrunner object and prints output of ex1.py with two arguments.
*/
public class main {
	public static void main(String[] args) {
		Pythonrunner r = new Pythonrunner(pythonversion.PYTHON_THREE);
		String[] new_args = new String[] {"ex1.py arg1 arg2", "ex2.py arg1 arg2"};
		HashMap<String, ArrayList<String>> results = r.runPythonFiles(new_args);
		System.out.println(results.get("ex1.py").get(0));
	}
}

