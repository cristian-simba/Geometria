public class figuras2D {
    //Triangulo equilatero y cuadrado
    int nLados; //Número de lados
    float lado; //Longitud de lado

    public figuras2D(int nLados, float lado) {
        this.nLados = nLados;
        this.lado = lado;
    }

    public figuras2D(int nLados) {
        this.nLados = nLados;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public float areaCuadrado(){

    };
    private float perimetroCuadrado(){

    };
}

