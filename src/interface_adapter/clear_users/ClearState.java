package interface_adapter.clear_users;

import java.util.ArrayList;

public class ClearState {

    private ArrayList<String> clearedUsers = new ArrayList<>();

    public ClearState(ClearState copy) {
        clearedUsers = copy.clearedUsers;
    }

    public ClearState() {
    }

    public ArrayList<String> getClearedUsers() {
        return clearedUsers;
    }

    public void setClearedUsers(ArrayList<String> clearedUsers) {
        this.clearedUsers = clearedUsers;
    }

    public void addClearedUser(String username) {
        clearedUsers.add(username);
    }

    @Override
    public String toString() {
        String builder = "";

        for (String username : clearedUsers) {
            builder += username + "\n";
        }

        return builder;

    }

}
