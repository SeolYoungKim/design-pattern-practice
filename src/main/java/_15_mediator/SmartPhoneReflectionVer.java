package _15_mediator;

import com.sun.jdi.VoidType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;

public class SmartPhoneReflectionVer {  // List<Object>와 Reflection을 이용하면 한 메서드로 다 될지도...? 부터 시작해서 그냥 만들어본 클래스
    private final List<App> applications;

    public SmartPhoneReflectionVer(final List<App> applications) {
        this.applications = applications;
    }

    public void invoke(final String name)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for (App app : applications) {
            final Class<? extends App> clazz = app.getClass();
            final Constructor<? extends App> constructor = clazz.getConstructor();
            final App appInstance = constructor.newInstance();

            final Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                final Parameter[] parameters = method.getParameters();
                if (parameters.length == 1
                        && method.getReturnType().getName().equals("void")
                        && method.getParameterTypes()[0] == String.class) {

                    method.invoke(appInstance, name);
                }
            }
        }
    }
}
