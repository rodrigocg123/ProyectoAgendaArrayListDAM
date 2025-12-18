package test;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import main.AgendaArrayList;

public class AgendaArrayListTest {

    private AgendaArrayList arrayList;

    @Before
    public void setUp() {
        // Se ejecuta antes de cada test
        arrayList = new AgendaArrayList();
    }

    @After
    public void tearDown() {
        // Se ejecuta después de cada test
        arrayList = null;
    }

    @Test
    public void testCrearArrayList() {
        // Prueba que el ArrayList se crea correctamente
        assertNotNull(arrayList);
    }

    @Test
    public void testAñadirElemento() {
        // Prueba que se pueden añadir elementos
        assertTrue(arrayList.add("elemento1"));
    }

    @Test
    public void testObtenerElemento() {
        // Prueba que se puede obtener un elemento por índice
        arrayList.add("elemento1");
        assertEquals("elemento1", arrayList.get(0));
    }

    @Test
    public void testTamanoArrayList() {
        // Prueba que el tamaño es correcto
        assertEquals(0, arrayList.size());
        arrayList.add("elemento1");
        assertEquals(1, arrayList.size());
    }

    @Test
    public void testEliminarElemento() {
        // Prueba que se puede eliminar un elemento
        arrayList.add("elemento1");
        arrayList.remove(0);
        assertEquals(0, arrayList.size());
    }

    @Test
    public void testLimpiarArrayList() {
        // Prueba que se puede limpiar el ArrayList
        arrayList.add("elemento1");
        arrayList.add("elemento2");
        arrayList.clear();
        assertEquals(0, arrayList.size());
    }
}
