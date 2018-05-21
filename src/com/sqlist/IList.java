package com.sqlist;

public interface IList {
    public void clear()throws Exception;
    public boolean imEmpty() throws Exception;
    public int length()throws Exception;
    public Object get(int i) throws Exception;
    public void insert(int i, Object x) throws Exception;
    public void remove(int i) throws Exception;
    public int indexOf(Object x)throws Exception;
    public void display()throws Exception;
}
