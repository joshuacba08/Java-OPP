public class Empresa {
    // Atributos
    private String cuit; // Sin guiones
    private String designacion;

    // Constructor
    public Empresa(String cuit, String designacion) {
        this.cuit = cuit;
        this.designacion = designacion;
    }

    /**
     * Se debe verificar que el "digito verificador" sea correcto, asignar el campo
     * y devolver true. En caso contrario se asigna "" (cadena vacia) y se retorna
     * false.
     */
    public boolean setCuit(String cuit) {

        int digitToVerify = Character.getNumericValue(cuit.charAt(10));
        int SUMA_P = 0;
        int operador = 2;

        for (int i = 9; i >= 0; i--) { //itera de derecha a izquierda
            if (operador == 8) { //si el operador lle a ser 8, entonces vuelve a 2
                operador = 2;
            }
            SUMA_P += (Character.getNumericValue(cuit.charAt(i))) * operador;  //convierte cada caracter de la cadena en un entero para ir sumando
            operador++;  //va sumando el operador
        }

        int SUMA_MOD11 = SUMA_P % 11;
        int ONCEMENOS = 11 - SUMA_MOD11;

        if (ONCEMENOS == 11) {
            if (digitToVerify == 0) {
                this.cuit = cuit;
                return true;
            }
        } else if (ONCEMENOS == 10) {
            this.cuit = "";
            return false;
        } else if (ONCEMENOS == digitToVerify) {
            this.cuit = cuit;
            return true;
        } else if (ONCEMENOS != digitToVerify ) {
            this.cuit = "";
            return false;
        }

        return false;

    }

    /**
     * Retorna el valor de nombre
     */
    public String getCuit() {
        return this.cuit; // no olvide modificar esta linea
    }

    /**
     * Asigna designacion
     */

    public void setDesignacion(String designacion) {
        this.designacion = designacion;
    }

    /**
     * Retorna el valor de designacion
     */
    public String getDesignacion() {
        return this.designacion;
    }
}