package PasswordVerify;

public class PasswordVerify {

    public static PasswordResult validaPassword(String cadena) {
        String msjError = "";
        boolean isValid = true;
        int contNumeros = 0;
        boolean tieneMayus = false;
        boolean tieneCaracterSpecial = false;

        if (cadena.length() < 8) {
            msjError += "La contrasenya ha de tenir almenys 8 caràcters\n";
            isValid = false;
        }
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isDigit(caracter)) {
                contNumeros++;
            } else if (Character.isUpperCase(caracter)) {
                tieneMayus = true;
            } else if (!Character.isLetterOrDigit(caracter)) {
                tieneCaracterSpecial = true;
            }
        }
        if (contNumeros < 2) {
            msjError += "La contrasenya ha de contenir almenys 2 números\n";
            isValid = false;
        }
        if (!tieneMayus) {
            msjError += "La contrasenya ha de contenir almenys una lletra majúscula\n";
            isValid = false;
        }

        if (!tieneCaracterSpecial) {
            msjError += "La contrasenya ha de contenir almenys un caràcter especial\n";
            isValid = false;
        }
        return new PasswordResult(isValid, msjError);
    }
}
