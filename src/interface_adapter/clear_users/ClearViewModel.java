package interface_adapter.clear_users;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;

public class ClearViewModel {

    private ClearState state = new ClearState();

    public void setState(ClearState state) {
        this.state = state;
    }

    public ClearState getState() {
        return state;
    }

    public String buildClearMessage() {
        return this.state.toString();
    }

    public void addClearedUser(String username) {
        this.state.addClearedUser(username);
    }

}
