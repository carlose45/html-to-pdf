# Proyecto CV Builder

Este proyecto es una aplicación Java para generar un currículum vitae (CV) en formato PDF a partir de la información proporcionada sobre un candidato. Utiliza Maven como sistema de construcción y tiene varias dependencias para la generación y visualización del PDF.

## Tabla de Contenidos

- [Descripción del Proyecto](#descripción-del-proyecto)
- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Construcción del Proyecto](#construcción-del-proyecto)
- [Licencia](#licencia)

## Descripción del Proyecto

Esta aplicación toma información sobre el candidato (como experiencia laboral, educación y certificaciones) y genera un CV en formato PDF utilizando plantillas HTML y CSS. 

## Características

- Generación de CV en formato PDF.
- Uso de plantillas HTML y CSS para la personalización.
- Visualización automática del PDF generado.

## Requisitos

- JDK 11 o superior.
- Maven 3.6.0 o superior.

## Instalación

1. Clona el repositorio:

   ```sh
   git clone https://github.com/carlose45/html-to-pdf.git
   cd html-to-pdf
   ```

2. Asegúrate de tener Maven instalado. Puedes verificarlo con:

   ```sh
   mvn -v
   ```

3. Si Maven no está instalado, sigue las instrucciones en [la documentación oficial de Maven](https://maven.apache.org/install.html).

## Uso

1. Configura la información del candidato en la clase `Main.java` según sea necesario.

2. Ejecuta el programa para generar el CV en PDF:

   ```sh
   mvn exec:java -Dexec.mainClass="com.culloque.Main"
   ```

   Asegúrate de que el plugin `maven-exec-plugin` esté configurado en tu `pom.xml` para ejecutar la clase principal.

## Construcción del Proyecto

Para construir el proyecto y empaquetarlo en un archivo JAR, sigue estos pasos:

1. **Limpiar y construir el proyecto:**

   ```sh
   mvn clean install
   ```

   Este comando compila el código, ejecuta las pruebas y empaqueta el proyecto en un archivo JAR ubicado en `target/`.

2. **Ejecutar el archivo JAR (si se ha empaquetado):**

   ```sh
   java -jar target/tu-repositorio-1.0-SNAPSHOT.jar
   ```

   Reemplaza `tu-repositorio-1.0-SNAPSHOT.jar` con el nombre del archivo JAR generado.

## Licencia

MIT License

```
Copyright (c) [2024] [Carlos Eduardo Ulloque Niño]

Se concede permiso, sin costo alguno, a cualquier persona que obtenga una copia de este software y archivos de documentación asociados (el "Software"), para usar el Software sin restricciones, incluyendo, sin limitación, los derechos a usar, copiar, modificar, fusionar, publicar, distribuir, sublicenciar y/o vender copias del Software, y permitir a las personas a quienes se les proporcione el Software a hacer lo mismo, sujeto a las siguientes condiciones:

El aviso de copyright anterior y este aviso de permiso deben ser incluidos en todas las copias o partes sustanciales del Software.

EL SOFTWARE SE PROPORCIONA "TAL CUAL", SIN GARANTÍA DE NINGÚN TIPO, EXPRESA O IMPLÍCITA, INCLUYENDO PERO NO LIMITADO A LAS GARANTÍAS IMPLÍCITAS DE COMERCIALIZACIÓN, ADECUACIÓN PARA UN PROPÓSITO PARTICULAR Y NO INFRACCIÓN. EN NINGÚN CASO LOS AUTORES O TITULARES DE LOS DERECHOS DE AUTOR SERÁN RESPONSABLES POR CUALQUIER RECLAMO, DAÑO O OTRA RESPONSABILIDAD, YA SEA EN UNA ACCIÓN DE CONTRATO, AGRAVIO O DE OTRA MANERA, QUE SURJA DE O EN CONEXIÓN CON EL SOFTWARE O EL USO O OTROS TRATOS EN EL SOFTWARE.
```
