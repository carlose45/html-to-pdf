package com.culloque.builders;

import java.util.Map;

import com.culloque.enums.Templates;

/**
 * La clase {@code HtmlBuilder} facilita la construcción y modificación de contenido HTML
 * al proporcionar métodos para reemplazar secciones específicas del HTML con valores proporcionados.
 * 
 * Esta clase utiliza plantillas y secciones definidas en el enum {@code Templates} para realizar
 * sustituciones en el contenido HTML, permitiendo una generación flexible y personalizada del HTML.
 */
public class HtmlBuilder {
    private String html;
    
    /**
     * Constructor de la clase {@code HtmlBuilder}.
     * 
     * @param html El contenido HTML inicial que se modificará utilizando esta clase.
     */
    public HtmlBuilder(String html) {
        this.html = html;
    }

    /**
     * Reemplaza el marcador de posición para el estilo CSS en el HTML.
     * 
     * @param css El contenido CSS que reemplazará el marcador de posición de estilo.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withStyle(String css) {
        html = html.replace(Templates.STYLE.getSection(), css);
        return this;
    }

    /**
     * Reemplaza el marcador de posición para el nombre completo en el HTML.
     * 
     * @param fullName El nombre completo que reemplazará el marcador de posición del nombre.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withFullName(String fullName) {
        html = html.replace(Templates.FULLNAME.getSection(), fullName);
        return this;
    }

    /**
     * Reemplaza el marcador de posición para el correo electrónico en el HTML.
     * 
     * @param email El correo electrónico que reemplazará el marcador de posición del email.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withEmail(String email) {
        html = html.replace(Templates.EMAIL.getSection(), email);
        return this;
    }

    /**
     * Reemplaza el marcador de posición para el número de teléfono en el HTML.
     * 
     * @param phone El número de teléfono que reemplazará el marcador de posición del teléfono.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withPhone(String phone) {
        html = html.replace(Templates.PHONE.getSection(), phone);
        return this;
    }

    /**
     * Reemplaza el marcador de posición para el perfil en el HTML.
     * 
     * @param profile El perfil que reemplazará el marcador de posición del perfil.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withProfile(String profile) {
        html = html.replace(Templates.PROFILE.getSection(), profile);
        return this;
    }

    /**
     * Reemplaza el marcador de posición para la experiencia laboral en el HTML.
     * 
     * @param experience El contenido de experiencia laboral que reemplazará el marcador de posición de experiencia.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withExperience(String experience) {
        html = html.replace(Templates.EXPERIENCE.getSection(), experience);
        return this;
    }

    /**
     * Reemplaza el marcador de posición para la educación en el HTML.
     * 
     * @param education El contenido educativo que reemplazará el marcador de posición de educación.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withEducation(String education) {
        html = html.replace(Templates.EDUCATION.getSection(), education);
        return this;
    }

    /**
     * Reemplaza el marcador de posición para las certificaciones en el HTML.
     * 
     * @param certifications El contenido de certificaciones que reemplazará el marcador de posición de certificaciones.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withCertifications(String certifications) {
        html = html.replace(Templates.CERTIFICATION.getSection(), certifications);
        return this;
    }

    /**
     * Reemplaza múltiples marcadores de posición en el HTML utilizando un mapa de claves y valores.
     * 
     * @param titles Un mapa donde las claves son los marcadores de posición y los valores son los reemplazos.
     * @return La instancia actual de {@code HtmlBuilder} para permitir el encadenamiento de métodos.
     */
    public HtmlBuilder withTitles(Map<String, String> titles) {
        titles.entrySet().stream().forEach(t -> {
            html = html.replace(t.getKey(), t.getValue());
        });
        return this;
    }

    /**
     * Obtiene el contenido HTML final después de realizar todas las sustituciones.
     * 
     * @return El contenido HTML modificado.
     */
    public String toHtml() {
        return html;
    }
}
