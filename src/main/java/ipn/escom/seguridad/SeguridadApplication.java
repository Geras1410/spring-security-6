package ipn.escom.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
Lo comentado solo sirvio para obtener el password hasheado y
actualizarlo en la bd con el ususario con id 1 y contrasenia
to_be_encoded
*/

@SpringBootApplication
@EnableWebSecurity
public class SeguridadApplication /*implements CommandLineRunner */{

    /*
    @Autowired
    PasswordEncoder passwordEncoder;
     */

    public static void main(String[] args) {
        SpringApplication.run(SeguridadApplication.class, args);
        System.out.println("Hello World!");
    }
    /*
    @Override
    public void run(String... args) throws Exception {
        System.out.println(passwordEncoder.encode("to_be_encoded"));
    }
    */
}
