package com.culloque.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * La clase {@code TemplateRenderer} implementa la interfaz {@code IRunnable<String>} y se encarga de leer el contenido de un archivo
 * de plantilla y devolverlo como una cadena de texto.
 * 
 * Utiliza la clase {@code Files} para leer el contenido del archivo y maneja excepciones relacionadas con la lectura de archivos.
 */
public class TemplateRenderer implements IRunnable<String> {
    private Path path;

    /**
     * Constructor de la clase {@code TemplateRenderer}.
     * 
     * @param path La ruta del archivo de plantilla que se desea leer.
     */
    public TemplateRenderer(Path path) {
        this.path = path;
    }

    /**
     * Lee el contenido del archivo especificado en la ruta y lo retorna como una cadena de texto.
     * 
     * Este método utiliza {@code Files.readAllBytes} para leer el archivo en formato UTF-8. Si ocurre un error durante la lectura del archivo,
     * se captura una excepción {@code IOException} y se imprime un mensaje en la consola. En caso de error, se retorna una cadena vacía.
     * 
     * @return El contenido del archivo como una cadena de texto, o una cadena vacía si ocurre un error.
     */
    @Override
    public String run() {
        try {
            return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("No fue posible leer el archivo: " + path);
            return "";
        }
    }
}
