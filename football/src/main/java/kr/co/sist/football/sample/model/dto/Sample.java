package kr.co.sist.football.sample.model.dto;

public class Sample {
	private String test;

	public Sample() {
	}

	public Sample(String test) {
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
