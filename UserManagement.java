import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

class UserManagement {
    public static void main(String[] args) {
        // Create an  UserManagement
        UserManagement userManagement = new UserManagement();

        System.out.println("Before removal: " + userManagement.getApprovedUsers());

        userManagement.removeUsers(Arrays.asList("a@test.com", "c@test.com"));

        System.out.println("After removal: " + userManagement.getApprovedUsers());
    }


    public Set<String> approvedUsers = new HashSet<>(Arrays.asList("a@test.com", "b@test.com", "c@test.com"));

    public void removeUsers(List<String> emailsToRemove) {
        // Your code here. Use a single method call for this.
        approvedUsers.removeAll(emailsToRemove);
    }

    public Set<String> getApprovedUsers() {
        return approvedUsers;
    }
}
