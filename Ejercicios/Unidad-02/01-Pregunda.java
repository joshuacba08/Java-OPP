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

        for (int i = 0; i <= cuit.length(); i++) {
            if (operador == 8) {
                operador = 2;
            }
            SUMA_P += (Character.getNumericValue(cuit.charAt(10))) * operador;
            operador++;
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
        }

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