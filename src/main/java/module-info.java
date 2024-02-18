module sn.dev.appuser {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;


    opens sn.dev.appuser to javafx.fxml;
    exports sn.dev.appuser;
    exports sn.dev.appuser.controllers;
    opens sn.dev.appuser.controllers to javafx.fxml;
}