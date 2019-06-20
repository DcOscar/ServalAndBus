/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import java.util.*;

/**
 *
 * @author Oscar
 */
public class ServalAndBus {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadRutas = teclado.nextInt();
        int horaLlegada = teclado.nextInt();
        int[][] buses = new int[cantidadRutas][2];
        for (int i = 0; i < cantidadRutas; i++) {
            buses[i][0] = teclado.nextInt();
            buses[i][1] = teclado.nextInt();

        }
        int busATomar = calcularBusCercano(cantidadRutas, horaLlegada, buses);
        System.out.println(busATomar);
    }

    public static int calcularBusCercano(int cantidadRutas, int horaLlegada, int[][] buses) {
        int busATomar = 0;
        int rutaAElegir;
        for (int i = 0; i < cantidadRutas; i++) {
            while (buses[i][0] < horaLlegada) {
                buses[i][0] += buses[i][1];
            }
        }
        rutaAElegir = buses[0][0];
        for (int i = 1; i < cantidadRutas; i++) {
            if (buses[i][0] < rutaAElegir) {
                rutaAElegir = buses[i][0];
                busATomar = i;
            }
        }
        busATomar++;
        return busATomar;
    }
}
