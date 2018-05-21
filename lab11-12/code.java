package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public  class Box<T>{

    public int i=0;
    private T[] array;

    @SuppressWarnings("unchecked")

    public Box(int sz) {

        array = (T[])new Object[sz];

    }

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[A-Za-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
    public void setData(T data){
        if (checkWithRegExp((String) data))
        {this.array[i]=data;
        i++;}

    }
    public T getData(int key) {

        return (T) array[key];
    }
    public void clear(){
        for(int j=0;j<i;j++) {
            array[j] = null;
        }
    }
    public void delete(int key){
        for(int j=key-1;j<i;j++){
            array[j]=array[j+1];
        }
    }
    public T[] Return() {

    return  array;
    }

}
