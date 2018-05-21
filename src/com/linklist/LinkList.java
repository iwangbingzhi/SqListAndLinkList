package com.linklist;

import java.util.Scanner;

public class LinkList implements IList {
    public Node head;

    public LinkList() {
        head = new Node();
    }
    public LinkList(int n, boolean Order) throws Exception{
        this();
        if(Order){
            create1(n);
        }else {
            create2(n);

        }
    }
    //头插法创建单链表
    private void create1(int n) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j <n ; j++) {
            insert(0,scanner.next());
        }
    }

    //尾插法创建单链表
    private void create2(int n) throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j <n ; j++) {
            insert(length(),scanner.next());
        }
    }

    @Override
    public void clear() throws Exception {
        head.next = null;
        head.data = null;
    }

    @Override
    public boolean imEmpty() throws Exception {
        return head.next == null;
    }

    @Override
    public int length() throws Exception {
        Node p = head.next;
        int length = 0;
        while(p!=null){
            p = p.next;
            ++length;
        }
        return length;
    }


    //带有头结点的单链表的插入
    @Override
    public void insert(int i, Object x) throws Exception {
        Node p = head;
        int j = -1;
        while(p!=null && j<i-1){
            p = p.next;
            ++j;
        }
        if (j>i-1 || p==null){
            throw new Exception("插入位置不合法");
        }
        Node s = new Node(x);
        s.next = p.next;
        p.next = s;
    }

/*    //不带有头结点的单链表的插入
    @Override
    public void insert(int i, Object x) throws Exception {
        Node p = head;
        int j = 0;
        while(p!=null && j<i-1){
            p = p.next;
            ++j;
        }
        if (j>i || p==null){
            throw new Exception("插入位置不合法");
        }
        Node s = new Node(x);
        if (i==0){   //在单链表表头插入
        s.next = head;
        head = s;
        }else {     //在单链表表尾或者中间位置插入
            s.next = p.next;
            p.next = s;
        }
    }*/

    @Override
    public void remove(int i) throws Exception {
        Node p = head;
        int j = -1;
        while (p.next!=null && j<i-1){
            p = p.next;
            ++j;
        }
        if (j>i-1 || p.next == null){
            throw new Exception("删除位置不合法");
        }
        p.next = p.next.next;

    }
    //按照位序号查找
    @Override
    public Object get(int i) throws Exception {
        Node p = head.next;  //初始化，p指向首节点
        int j = 0;
        /*从首节点开始向后查找，直到p指向第i个节点或者p到达表尾的时候*/
        while (p!=null&&j<i){
            p = p.next;
            ++j;
        }
        if (j>i || p==null){
            throw new Exception("第"+i+"个元素不存在！");
        }
        return p.data;
    }

    //按照值查找
    @Override
    public int indexOf(Object x) throws Exception {
        Node p = head.next;  //初始化，p指向首节点
        int j = 0;
        //从首节点开始查找，直到p.data为x的时候或者到达单链表的表尾停止查找
        while(p!=null && !p.data.equals(x)){
            p = p.next;
            ++j;
        }
        if(p!=null){
            return j;
        }else {
            return -1;
        }
    }

    @Override
    public void display() throws Exception {
        Node node = head.next;
        while (node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
