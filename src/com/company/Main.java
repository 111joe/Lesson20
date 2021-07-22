package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static House createHouse(){
        Class<House> myHouse = null;
        House house = null;
        try{
            myHouse = House.class;
            house = myHouse.newInstance();
            Field numberHouse = myHouse.getField("numberHouse");
            Field numberRoom = myHouse.getDeclaredField("numberRoom");
            Field numberResident = myHouse.getDeclaredField("numberResident");
            Field nameHouse = myHouse.getDeclaredField("nameHouse");

            numberHouse.setAccessible(true);
            numberRoom.setAccessible(true);
            numberResident.setAccessible(true);
            numberHouse.setAccessible(true);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return house;
    }

    public static void invokeMethod(){
        Class clazz = null;
        House house = null;
        try{
            house = new House();
            clazz = House.class;

   //         Method setNumberResident = clazz.getDeclaredMethod("setNumberResident");
  //          Method setNumberResidentRoom = clazz.getDeclaredMethod("setNumberResidentRoom");
            Method getNameHouse = clazz.getDeclaredMethod("getNameHouse");
            Method toString = clazz.getDeclaredMethod("toString");

  //          setNumberResident.setAccessible(true);
  //          setNumberResidentRoom.setAccessible(true);

  //          setNumberResident.invoke(house);
  //          setNumberResidentRoom.invoke(house);
            getNameHouse.invoke(house);
            toString.invoke(house);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<House> myHouse = House.class;
        Field[] fields = myHouse.getDeclaredFields();
        Method[] fields1 = myHouse.getDeclaredMethods();
        System.out.println(Arrays.toString(fields));
        System.out.println(Arrays.toString(fields1));
        House house = myHouse.newInstance();
        System.out.println(createHouse());
        invokeMethod();
    }
}
