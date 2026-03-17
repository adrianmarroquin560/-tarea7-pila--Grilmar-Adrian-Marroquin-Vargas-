public class BitacoraStack {
    private java.util.Stack<String> pila;

    public BitacoraStack() {
        pila = new java.util.Stack<>();
    }

    public void registrar(String evento) {
        pila.push(evento);
    }

    public String consultarUltimo() throws Exception {
        if (pila.isEmpty()) {
            throw new Exception("La bitácora está vacía. No hay eventos para consultar.");
        }
        return pila.peek();
    }

    public String eliminarUltimo() throws Exception {
        if (pila.isEmpty()) {
            throw new Exception("La bitácora está vacía. No hay eventos para eliminar.");
        }
        return pila.pop();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

    public int totalEventos() {
        return pila.size();
    }
}
