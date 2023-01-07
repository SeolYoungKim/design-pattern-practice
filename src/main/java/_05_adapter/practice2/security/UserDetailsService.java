package _05_adapter.practice2.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
