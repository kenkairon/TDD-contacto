package cl.kibernumacademy.service;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

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
        assertThat(contactManger.obtenerContactos().get(0).getNombre(), is("Sofia"));

    }
}
