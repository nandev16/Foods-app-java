package com.nandev.proyecto1.v2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Proyecto1: Aplicación JavaFX para gestionar alimentos y sus propiedades nutricionales.
 * 
 * Esta aplicación permite a los usuarios agregar, editar y eliminar alimentos, y generar reportes
 * basados en las propiedades nutricionales de los alimentos almacenados. Los datos de los alimentos
 * se almacenan en un archivo de texto llamado "Alimentos.txt".
 * 
 * Características:
 * - La aplicación presenta una interfaz gráfica de usuario (GUI) para una fácil interacción.
 * - Los alimentos pueden ser de tipo "Procesado" o "Natural", y tienen atributos como código, nombre,
 *   proteínas, carbohidratos, grasas y fecha de creación.
 * - Los alimentos procesados también pueden tener una lista de ingredientes.
 * - Se incluyen opciones para buscar alimentos por código o fecha de creación.
 * - La aplicación controla las excepciones para evitar errores y comportamientos inesperados.
 * 
 * Notas adicionales:
 * - El código utiliza JavaFX para la creación de la interfaz gráfica y permite la interacción con el usuario.
 *   Documentacion consultada para JavaFX: https://jenkov.com/tutorials/javafx/overview.html
 * 
 * Autor: Marco Aguero Barboza
 * Universidad: UNED
 * Curso: Programación intermedia
 * Fecha: 28/07/2023
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("add"), 800, 500);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}