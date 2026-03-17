public class Main {
    public static void main(String[] args) {
        BitacoraStack bitacora = new BitacoraStack();

        // 1. Registrar eventos
        bitacora.registrar("Motor de estribor encendido");
        bitacora.registrar("Velocidad warp alcanzada");
        bitacora.registrar("Señal de comunicación estable");
        bitacora.registrar("Anomalía detectada en sector 7");
        bitacora.registrar("Escudos al 40%");
        bitacora.registrar("ERROR CRÍTICO: fallo en sistema de navegación");

        try {
            // 2. Consultar último evento
            String ultimo = bitacora.consultarUltimo();
            System.out.println("Último evento: " + ultimo);

            // 3. Protocolo de revisión
            if (ultimo.contains("ERROR")) {
                System.out.println("Protocolo de revisión activado...");
                for (int i = 0; i < 3; i++) {
                    String eliminado = bitacora.eliminarUltimo();
                    System.out.println("Eliminado: " + eliminado);
                }
            }

            // 4. Estado actual
            System.out.println("Eventos restantes: " + bitacora.totalEventos());
            if (!bitacora.estaVacia()) {
                System.out.println("Evento en la cima: " + bitacora.consultarUltimo());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Una Pila es adecuada porque el último evento es el más relevante.
// En emergencias se necesita consultar lo más reciente.
// Si usáramos una lista normal, habría que calcular índices y no
// se garantizaría el acceso inmediato al último registro.
