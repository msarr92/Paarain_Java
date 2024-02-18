package sn.dev.appuser.controllers;

//import com.gluonhq.charm.glisten.control.TextField;
import entities.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class userController {


        @FXML
        private Button clear;

        @FXML
        private Button delete;

        @FXML
        private Button genererLogin;

        @FXML
        private TextField loginTfx;

        @FXML
        private TextField nomTfx;

        @FXML
        private PasswordField passwordTfx;

        @FXML
        private TextField prenomTfx;

        @FXML
        private Button save;

        @FXML
        private Button update;
    @FXML
    private TableColumn<User, String> passwordTlb;

    @FXML
    private TableColumn<User, String> loginTlb;
    @FXML
    private TableColumn<User, String> nomTlb;
    @FXML
    private TableColumn<User, String> prenomTlb;
    @FXML
    void save(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {

            User u = new User();
            u.setNomUser(nomTfx.getText());
            u.setPrenomUser(prenomTfx.getText());
            u.setLoginUser(loginTfx.getText());
            u.setPasswordUser(passwordTfx.getText());
        }catch (Exception e){
            if (transaction.isActive())
                transaction.rollback();
        }

    }

}
