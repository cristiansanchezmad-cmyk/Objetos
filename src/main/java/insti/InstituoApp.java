package insti;

import javax.management.MBeanAttributeInfo;
import java.sql.SQLOutput;

public class InstituoApp {

    public static void main(String[] args) {
        insti instituto = new insti();
        insti mariablasco = new insti("mariablasco","mutxamel");


        mariablasco.setNombre(null);
        System.out.println(instituto);
        System.out.println("-----------------------------------------");
        System.out.println(mariablasco);

    }

}