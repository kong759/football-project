package mybatis.dto;

import org.apache.ibatis.type.Alias;

@Alias("Test")
public class Test {
	private String test;

	public Test() {
	}

	public Test(String test) {
		this.test = test;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Test [test=" + test + "]";
	}

}
