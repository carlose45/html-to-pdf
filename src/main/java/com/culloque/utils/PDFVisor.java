package com.culloque.utils;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * La clase {@code PDFVisor} proporciona un método para visualizar archivos PDF utilizando el visor de PDF predeterminado del sistema.
 * 
 * Utiliza la clase {@code Desktop} para abrir el archivo PDF en el visor predeterminado del sistema operativo.
 */
public class PDFVisor {

    /**
     * Abre el archivo PDF especificado utilizando el visor de PDF predeterminado del sistema.
     * 
     * Este método verifica si la acción de abrir archivos está soportada por el sistema y si el archivo PDF existe
     * antes de intentar abrirlo. En caso de que el archivo no exista o la acción no esté soportada, se imprime un mensaje
     * en la consola. Si ocurre una excepción durante el proceso, se imprime la traza de la pila.
     * 
     * @param pdf La ruta del archivo PDF que se desea visualizar.
     */
    public void visor(String pdf) {
        try {
            File archivoPDF = new File(pdf);
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (archivoPDF.exists()) {
                    desktop.open(archivoPDF);
                } else {
                    System.out.println("El archivo no existe.");
                }
            } else {
                System.out.println("La acción de abrir archivos no está soportada en este sistema.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
