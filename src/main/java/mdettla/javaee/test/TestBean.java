package mdettla.javaee.test;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestBean {

	private String foo;

	public List<String> complete(String query) {
		return Arrays.asList("bar", "baz");
	}

	public String getFoo() {
		return this.foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}
}
