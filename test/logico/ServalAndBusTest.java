/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar
 */
public class ServalAndBusTest {

    public ServalAndBusTest() {
    }

    @Test
    public void testUno1() {
        int cantidadRutas = 2;
        int horaLlegada = 2;
        int[][] buses = {{6, 4}, {9, 5}};
        int busATomar = ServalAndBus.calcularBusCercano(cantidadRutas, horaLlegada, buses);
        assertEquals(1, busATomar);
        System.out.println(busATomar);
    }

    @Test
    public void testDos2() {
        int cantidadRutas = 5;
        int horaLlegada = 5;
        int[][] buses = {{3, 3}, {2, 5}, {5, 6}, {4, 9}, {6, 1}};
        int busATomar = ServalAndBus.calcularBusCercano(cantidadRutas, horaLlegada, buses);
        assertEquals(3, busATomar);
        System.out.println(busATomar);
    }

    @Test
    public void testTres3() {
        int cantidadRutas = 3;
        int horaLlegada = 7;
        int[][] buses = {{2, 2}, {2, 3}, {2, 4}};
        int busATomar = ServalAndBus.calcularBusCercano(cantidadRutas, horaLlegada, buses);
        assertEquals(1, busATomar);
        System.out.println(busATomar);
    }

}
