package client.views.createUser;

import client.core.ViewHandler;
import client.core.ViewModelFactory;
import client.views.ViewController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class createUserViewController implements ViewController {


    @FXML public TextField CreateUser;
    @FXML public PasswordField CreatePassword;
    @FXML public Label Error;

    private ViewHandler vh;
    private createUserViewModel cuv;

    @Override
    public void init(ViewHandler vh, ViewModelFactory vmf) {
        this.vh = vh;
        this.cuv = vmf.getcreateUserViewModel();

        //create login
        CreateUser.textProperty().bindBidirectional(cuv.createUserProperty());
        CreatePassword.textProperty().bindBidirectional(cuv.createPasswordProperty());

        //error label
        Error.textProperty().bind(cuv.errorProperty());

    }

    public void onCreateLogin(ActionEvent actionEvent) {

        if (cuv.validateSignUp()){
            cuv.createUser();
            cuv.clearFields();
            vh.openLoginView();

        }

    }

    public void onCancel(ActionEvent actionEvent) {
        vh.openLoginView();
    }

}
