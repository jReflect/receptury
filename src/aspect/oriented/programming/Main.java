package aspect.oriented.programming;

import annotation.practice.Fruit;
import annotation.practice.Hawking;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

/**
 * Created by Adrian on 18.02.2017.
 */
public class Main {
    private Lemon lemon;

    public static String[] getPackageContent(String packageName) throws IOException {
        final String packageAsDirName = packageName.replace(".", "/");
        final List<String> list = new ArrayList<>();
        final Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packageAsDirName);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println("Adres URL = " + url);
            String file = url.getFile();
            switch (url.getProtocol()) {
                case "file":
                    File dir = new File(file);
                    for (File f : dir.listFiles()) {
                        list.add(packageName + "." + f.getName().replace(".class", ""));
                    }
                    break;
                default:
                    throw new IllegalStateException("Nie wiem, co zrobić z adresem URL " + url);
            }
        }
        return list.toArray(new String[]{});
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] names = getPackageContent("aspect.oriented.programming");
        List<Class<?>> classList = new ArrayList<>();
        for (String name : names) {
//            System.out.println(name);
            classList.add(Class.forName(name));
        }

        Map<String, String> classFieldMapping = new HashMap<>();

        for (Class fruit : classList) {
            if (fruit.isAnnotationPresent(Fruit.class))
                for (Method method : fruit.getMethods()) {
                    if (method.isAnnotationPresent(Hawking.class))
//                        classFieldMapping.put(fruit.getSimpleName(), method.getName());
                        System.out.println(fruit.getSimpleName() + " " + method.getAnnotation(Hawking.class).name());
                }
        }

        Class<?> clazz = Class.forName("aspect.oriented.programming.Lemon");

//        System.out.println(classType.getPackage().getImplementationTitle());


    }
}
