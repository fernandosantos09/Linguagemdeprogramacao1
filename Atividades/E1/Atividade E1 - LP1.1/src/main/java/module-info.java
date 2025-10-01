module org.atividades {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    opens org.atividades.atividade1 to javafx.fxml;
    opens org.atividades.atividade2.view to javafx.graphics;
    opens org.atividades.atividade4.view to javafx.fxml;
    opens org.atividades.atividade5.view to javafx.fxml;
    opens org.atividades.atividade3.Lampedusa.view to javafx.graphics;
    opens org.atividades.atividade3.TheBearerIrma.view to javafx.graphics;


    exports org.atividades.atividade1;
    exports org.atividades.atividade2.controller;
    exports org.atividades.atividade2.view;
    exports org.atividades.atividade4.view;
    exports org.atividades.atividade5.view;
    exports org.atividades.atividade4.model;
    exports org.atividades.atividade5.model;
}
