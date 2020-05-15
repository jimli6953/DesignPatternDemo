package com.jli.framework.base.object;

/**
 * 用于界面显示对象使用，必须为带有Description属性的对象才可以使用
 * @author Jli
 */
public class UIData {

    public UIData(){}

    private Object key;
    private String description;

    public String toString(){
        return this.description;
    }

    public Object getKey(){
        return key;
    }

    public void  setKey(Object key){
        this.key = key;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
