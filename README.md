# javaPythonRunner


## Project Description

This is a set of Java classes to run python files from a java class, and return their output.

## Technologies

This project consists of class files written in Java.

## Use

```java
    /* Set your version here, depending how you have it saved (this example uses "python3" on the command line). If you simply need to run "python", this line can be ignored. */
		Pythonrunner r = new Pythonrunner(pythonversion.PYTHON_THREE);
		String[] new_args = new String[] {"ex1.py arg1 arg2", "ex2.py arg1 arg2"};
		HashMap<String, ArrayList<String>> results = r.runPythonFiles(new_args);
		System.out.println(results.get("ex1.py").get(0));
```

Output:
```
arg1
```
