package Medium;

import java.util.Deque;
import java.util.LinkedList;

public class Problem71 {
    public String simplifyPath(String path) {
		Deque<String> stack = new LinkedList<>();
		for (String item : path.split("/")) {
			if ("..".equals(item)) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else if (!item.isEmpty() && !".".equals(item)) {
				stack.push("/" + item);
			}
		}
		String res = "";
		while (!stack.isEmpty()) {
			res = stack.pop() + res;
		}
		return res.isEmpty() ? "/" : res;
	}
    
}
