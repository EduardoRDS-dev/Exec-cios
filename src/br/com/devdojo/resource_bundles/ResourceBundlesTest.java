package br.com.devdojo.resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlesTest {
    public static void main(String[] args) {

        //mensagens em en_US
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message",new Locale("en","US"));
        System.out.println(resourceBundle.getString("hello.world"));
        System.out.println(resourceBundle.getString("welcome"));

        //mensagens em pt_BR
        resourceBundle = ResourceBundle.getBundle("message",new Locale("pt","BR"));
        System.out.println(resourceBundle.getString("hello.world"));
        System.out.println(resourceBundle.getString("welcome"));

    }
}
