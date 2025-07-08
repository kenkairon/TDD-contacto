package cl.kibernumacademy.service;

import java.util.ArrayList;
import java.util.List;
import cl.kibernumacademy.model.Contact;

public class ContactManager {
    private List<Contact> contactos = new ArrayList<>();

    public void agregarContacto(Contact contacto) {
        contactos.add(contacto);
    }

    // Refactor
    public List<Contact> obtenerContactos() {
        return List.copyOf(contactos);
    }

    public void eliminarContactoPorEmail(String email) {
        for (Contact contacto : contactos) {
            if (contacto.getEmail().equals(email)) {
                contactos.remove(contacto);
                break;
            }
        }
    }
}
