package use_case.clear_users;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface clearUserDAO;

    final ClearOutputBoundary presenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDAO, ClearOutputBoundary presenter) {
        this.clearUserDAO = clearUserDAO;
        this.presenter = presenter;
    }

    @Override
    public void execute() {
        ArrayList<String> clearedUsers = clearUserDAO.clear();
        presenter.presentClear(clearedUsers);
    }

}
