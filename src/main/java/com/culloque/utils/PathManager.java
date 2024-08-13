package com.culloque.utils;

import java.nio.file.Paths;
import java.nio.file.Path;
import com.culloque.enums.Templates;

/**
 * La clase {@code PathManager} gestiona la construcción de rutas para recursos de archivo.
 * 
 * Utiliza la ubicación actual del directorio de trabajo del sistema y una ruta base predeterminada
 * para generar rutas completas a archivos basados en las plantillas definidas en el enum {@code Templates}.
 */
public class PathManager {

    // Ruta del directorio actual de trabajo del sistema
    private static String currentPath = System.getProperty("user.dir");

    // Ruta base de los recursos, combinando el directorio actual con la ruta de recursos predeterminada
    private static String pathResources = Paths.get(currentPath, "src", "main", "resources").toString();

    /**
     * Obtiene la ruta completa para un archivo de plantilla especificado.
     * 
     * Esta ruta se construye combinando la ruta base de recursos con el nombre del archivo de la plantilla.
     * 
     * @param file La plantilla para la que se desea obtener la ruta.
     * @return La ruta completa al archivo de plantilla.
     */
    public Path getPath(Templates file) {
        return Paths.get(pathResources, file.getFileName());
    }
}
