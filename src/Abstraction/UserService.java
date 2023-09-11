package Abstraction;

import java.io.Serializable;

public interface UserService extends CommonService,Serializable {
	void addUser();

	void deleteUser();
}
