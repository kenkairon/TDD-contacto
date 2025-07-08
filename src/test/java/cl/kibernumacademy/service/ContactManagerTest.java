package cl.kibernumacademy.service;

import org.junit.jupiter.api.Test;

import cl.kibernumacademy.model.Contact;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ContactManagerTest {

    @Test
    void agregarContacto_debeAgregarUnContactoAlaLista() {
        // Se espera que exista una clase ContactManager con un método agregarContacto
        ContactManager contactManager = new ContactManager();

        // Se espera que exista una clase Contact con un constructor que reciba nombre,
        // numero telefono y correo telefonico
        Contact contacto = new Contact("Sofia", "005-9491091940", "sofia@correo.cl");

        // Se espera que la instancia puedo acceder al metodo agregarContacto y que aña
        // el contacto en una lista interna
        contactManager.agregarContacto(contacto);

        // Aqui validamos que la lista tenga solo un elemento
        assertThat(contactManager.obtenerContactos(), hasSize(1));
        assertThat(contactManager.obtenerContactos().get(0).getNombre(), is("Sofia"));

    }

    @Test
    void eliminarContactoPorEmail_debeEliminarContactoConEmailDado() {
        // Se espera que exista una clase ContactManager con un método agregarContacto
        ContactManager contactManager = new ContactManager();
        // Se espera que exista una clase Contact con un constructor que reciba nombre,
        // numero telefono y correo telefonico
        Contact contacto = new Contact("Sofia", "005-9491091940", "sofia@correo.cl");

        // Se espera que exista un metodo llamado eliminarContactoEmail, que elimine
        // contacto
        contactManager.eliminarContactoPorEmail("sofia@correo.cl");

        assertThat(contactManager.obtenerContactos(), hasSize(0));
    }
}
