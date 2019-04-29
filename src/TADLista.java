public interface TADLista {
    public boolean isEmpty();
    //public boolean isFull();
    public int size();
    public void add(int elemento, int indice) throws IndexOutOfBoundsException;
    public int remove(int indice) throws IndexOutOfBoundsException;
    public int set(int elemento, int indice) throws IndexOutOfBoundsException;
    public int get(int indice) throws IndexOutOfBoundsException;
}