package reflectdemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        //加载配置文件 系统类加载器以流的形式加载系统资源
        InputStream stream =
                ClassLoader.getSystemClassLoader ().getResourceAsStream ( "obj.properties" );//获取资源根根路径下的资源
        Properties properties = new Properties();
        properties.load(stream);
        //
        String className = properties.getProperty("ClassName");
        String methodName = properties.getProperty("methodName");

        //反射
        Class clazz = Class.forName(className);
        Object obj = clazz.getDeclaredConstructor ().newInstance (  );
        Method method = clazz.getMethod ( methodName,String.class);
        method.invoke ( obj,"tom");
    }
}
