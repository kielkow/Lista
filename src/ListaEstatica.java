public class ListaEstatica implements TADLista {

    private int inicio, fim, quantidade;
    private int lista[];

    public ListaEstatica(int tamanho) {
        lista = new int[tamanho];
        inicio = fim = -1;
        quantidade = 0;
    }

    @Override
    public boolean isEmpty() {
        return quantidade == 0;
    }
    
    public boolean isFull() {
        return quantidade == lista.length;
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public void add(int elemento, int indice) throws IndexOutOfBoundsException {
        if (!isFull() && indice >= 0 && indice <= quantidade) {
            if (quantidade == 0) {
                inicio = 0;
            } else {
                for (int i = fim; i >= indice; i--) {
                    lista[i + 1] = lista[i];
                }
            }
            lista[indice] = elemento;
            quantidade++;
            fim++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int remove(int indice) throws IndexOutOfBoundsException {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
            int aux = lista[indice];
            if (quantidade == 1) {
                inicio--;
            } else {
                for (int i = indice; i < fim; i++) {
                    lista[i] = lista[i + 1];
                }
            }
            fim--;
            quantidade--;
            return aux;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int set(int elemento, int indice) throws IndexOutOfBoundsException {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
            int aux = lista[indice];
            lista[indice] = elemento;
            return aux;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int get(int indice) throws IndexOutOfBoundsException {
        if (!isEmpty() && indice >= 0 && indice < quantidade) {
            return lista[indice];
        }
        throw new IndexOutOfBoundsException();
    }
}