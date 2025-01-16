package Java_Streams;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","bcd","fds","rtr","eesa");
		list.stream().forEach(item -> System.out.println(item));
	}
}
