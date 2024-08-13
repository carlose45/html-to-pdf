package com.culloque.utils;

/**
 * La interfaz {@code IRunnable} define un contrato para clases que implementan
 * un método de ejecución que retorna un resultado.
 * 
 * @param <T> El tipo de resultado que será retornado por el método {@code run}.
 */
public interface IRunnable<T> {
    /**
     * Ejecuta una operación y retorna un resultado.
     * 
     * @return El resultado de la operación ejecutada.
     */
    T run();
}
