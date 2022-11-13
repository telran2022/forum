package telran.java2022.security.context;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of = "userName")
public class User {
	String userName;
	String password;
	@Singular
	Set<String> roles;

}
