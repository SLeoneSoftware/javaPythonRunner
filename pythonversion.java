/**
 * Enum for different python execution commands. Sometimes python 2 is executed with 'python', while 3 is with 'python3'. This enum provides that option
 * @author Steven Leone
 * @version 1
 */

public enum pythonversion {
	PYTHON_TWO("python"),
	PYTHON_THREE("python3");

	private String executionCommand;

	pythonversion(String executionCommand) {
		this.executionCommand = executionCommand;
	}

	public String getExecutionCommand() {
		return executionCommand;
	}

}