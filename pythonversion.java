/**
 * Enum for different python execution commands
 * @author Steven Leone
 * @version 0 - debugging/development
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