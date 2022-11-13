package telran.java2022.security.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class SecurityContextImpl implements SecurityContext {
	Map<String, User> context = new ConcurrentHashMap<>();

	@Override
	public User addUser(User user) {
		return context.put(user.getUserName(), user);
	}

	@Override
	public User removeUser(String userName) {
		return context.remove(userName);
	}

	@Override
	public User getUser(String userName) {
		return context.get(userName);
	}

}
