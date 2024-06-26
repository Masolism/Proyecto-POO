package proyecto.oo;

abstract class Conjetura {
    
    abstract boolean probarConjetura();
}

class ConjeturaDeUlam extends Conjetura {
    private int numeroInicial;

    public ConjeturaDeUlam(int numeroInicial) {
        this.numeroInicial = numeroInicial;
    }

    @Override
    public boolean probarConjetura() {
        while (numeroInicial != 1) {
            if (numeroInicial % 2 == 0) {
                numeroInicial /= 2;
            } else {
                numeroInicial = 3 * numeroInicial + 1;
            }
        }
        return true;
    }
}

class ConjeturaDeGilbreath extends Conjetura {
    private int[] primos;

    public ConjeturaDeGilbreath(int[] primos) {
        this.primos = primos;
    }

    @Override
    public boolean probarConjetura() {
        if (primos.length < 2) return false;
        int[] diferencias = new int[primos.length - 1];
        for (int i = 0; i < primos.length - 1; i++) {
            diferencias[i] = Math.abs(primos[i] - primos[i + 1]);
        }
        return diferencias[0] == 1;
    }
}
