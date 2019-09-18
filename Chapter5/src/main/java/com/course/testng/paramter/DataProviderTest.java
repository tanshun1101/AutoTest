package com.course.testng.paramter;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

/**
 * 参数化测试
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }
    @DataProvider(name="data")
    public Object[][] providerDate(){
           Object[][] o=new Object[][]{
                   {"zhangsan",10},
                   {"lisi",10},
                   {"wangwu",10},
           };
           return o;
    }
    @Test(dataProvider="methodData")
    public void test1(String name,int age){
        System.out.println("test1方法name="+name+";age="+age);
    }
    @Test(dataProvider="methodData")
    public void test2(String name,int age){
        System.out.println("test2方法name="+name+";age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result =new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        } else if (method.getName().equals("test2")) {
          result = new Object[][]{
                  {"wangwu",50},
                  {"zhaoliu",60}
          };
        }
        return result;
    }
    }




