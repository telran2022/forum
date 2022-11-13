package telran.java2022.security.service;

import telran.java2022.accounting.model.UserAccount;

public interface SessionService {
	UserAccount addUser(String sessionId, UserAccount userAccount);
	
	UserAccount getUser(String sessionId);
	
	UserAccount removeUser(String sessionId);

}
