package ipn.escom.seguridad.Security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/*
Se dejará esta clase como referencia del "propio passwordencoder"
si deseas implemetar esta clase quita los comentarios de esta clase y
en la clase SecurityConfig comenta el password encoder que estes utilizando
probablemente tengas que hacer cambios en tu base dedatos por la forma de
hashear los passwords.
*/

//@Component
public class MyPaswwordEncoder /*implements PasswordEncoder*/ {
    //@Override
    public String encode(CharSequence rawPassword) {
        return String.valueOf(rawPassword.toString().hashCode());
    }

    //@Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        var passwordAsString = String.valueOf(rawPassword.toString().hashCode());
        return encodedPassword.equals(passwordAsString);
    }

   /*@Override
    public boolean upgradeEncoding(String encodedPassword) {
        return PasswordEncoder.super.upgradeEncoding(encodedPassword);
    }
    */
}
