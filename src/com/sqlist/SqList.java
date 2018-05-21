package com.sqlist;

public class SqList implements IList {
    private Object[] listElem;
    private int curLen;

    public SqList(int maxSize) {
        curLen = 0;
        listElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        curLen = 0;
    }

    @Override
    public boolean imEmpty() {
        return curLen == 0;
    }

    @Override
    public int length() {
        return curLen;
    }

    @Override
    public Object get(int i) throws Exception {
        if(i<0 || i>curLen - 1){
            throw new Exception("第"+i+"个元素不存在");
        }
        return listElem;
    }

    @Override
    public void insert(int i, Object x) throws Exception {
        if(curLen == listElem.length) {
            throw new Exception("顺序表满了");
        }
        if(i<0 || i>curLen) {
            throw new Exception("插入位置不合法");
        }

        for (int j = curLen; j > i ; j--) {
            listElem[j] = listElem[j-1];
        }
            listElem[i] = x;
            curLen ++;
        }


    @Override
    public void remove(int i) throws Exception{
        if(i<0||i>curLen-1) throw new Exception("删除位置不合法");
        for (int j = i; j <curLen-1 ; j++) {
            listElem[j] = listElem[j+1];
            curLen --;
        }
    }

    @Override
    public int indexOf(Object x) {
        int j = 0;
        while (j<curLen && !listElem[j].equals(x))
            j++;
        if (j<curLen) {
            return j;
        }else {
            return -1;
        }//取值为x的元素在顺序表中不存在
    }

    @Override
    public void display() {
        for (int j = 0; j < curLen ; j++) {
            System.out.println(listElem[j] + "");
        }
    }
}
