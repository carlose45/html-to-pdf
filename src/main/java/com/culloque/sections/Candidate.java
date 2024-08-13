package com.culloque.sections;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Candidate} representa a un candidato con información
 * personal, educativa y profesional.
 * Incluye detalles como el nombre completo, el correo electrónico, el teléfono,
 * un perfil personal,
 * y listas de educación, experiencia laboral y certificaciones.
 */
public class Candidate {

    private String fullName;
    private String email;
    private String phone;
    private String profile;
    private List<Education> educations;
    private List<Experience> experiences;
    private List<Certification> certifications;

    /**
     * Constructor por defecto de la clase {@code Candidate}.
     * Inicializa las listas de educación, experiencia y certificaciones.
     */
    public Candidate() {
        this.experiences = new ArrayList<>();
        this.educations = new ArrayList<>();
        this.certifications = new ArrayList<>();
    }

    /**
     * Obtiene la lista de objetos {@code Education} asociados con el candidato.
     * 
     * @return Una lista de objetos {@code Education}.
     */
    public List<Education> getEducation() {
        return this.educations;
    }

    /**
     * Obtiene la lista de objetos {@code Certification} asociados con el candidato.
     * 
     * @return Una lista de objetos {@code Certification}.
     */
    public List<Certification> getCertifications() {
        return this.certifications;
    }

    /**
     * Obtiene la lista de objetos {@code Experience} asociados con el candidato.
     * 
     * @return Una lista de objetos {@code Experience}.
     */
    public List<Experience> getExperiences() {
        return this.experiences;
    }

    /**
     * Obtiene el nombre completo del candidato.
     * 
     * @return El nombre completo del candidato.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Obtiene el correo electrónico del candidato.
     * 
     * @return El correo electrónico del candidato.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Obtiene el número de teléfono del candidato.
     * 
     * @return El número de teléfono del candidato.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Obtiene el perfil personal del candidato.
     * 
     * @return El perfil personal del candidato.
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * Establece el nombre completo del candidato.
     * 
     * @param fullName El nombre completo del candidato.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Establece el correo electrónico del candidato.
     * 
     * @param email El correo electrónico del candidato.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Establece el número de teléfono del candidato.
     * 
     * @param phone El número de teléfono del candidato.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Establece el perfil personal del candidato.
     * 
     * @param profile El perfil personal del candidato.
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * Añade un objeto {@code Education} a la lista de educación del candidato.
     * 
     * @param e El objeto {@code Education} que se añadirá a la lista.
     */
    public void addEducation(Education e) {
        educations.add(e);
    }

    /**
     * Añade un objeto {@code Experience} a la lista de experiencia laboral del
     * candidato.
     * 
     * @param e El objeto {@code Experience} que se añadirá a la lista.
     */
    public void addExperience(Experience e) {
        experiences.add(e);
    }

    /**
     * Añade un objeto {@code Certification} a la lista de certificaciones del
     * candidato.
     * 
     * @param c El objeto {@code Certification} que se añadirá a la lista.
     */
    public void addCertification(Certification c) {
        certifications.add(c);
    }
}
