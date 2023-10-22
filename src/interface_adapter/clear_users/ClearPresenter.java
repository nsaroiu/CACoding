package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;

import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void presentClear(ArrayList<String> clearedUsers) {
        ClearState newState = new ClearState();

        for (String username : clearedUsers) {
            newState.addClearedUser(username);
        }

        this.clearViewModel.setState(newState);
    }
}
