package com;

import com.linklist.Node;

public class AfterClassWork {
    /*编写一个顺序表类的成员函数，实现对顺序表就地逆置的操作。
    所谓逆置，就是把( a1,a2.,.,an)变成(an,an-1.,.,a1);
    所谓就地，就是指逆置后的数据元素仍存储在原来顺序表的存储空间中，
    即不为逆置后的顺序表另外分配存储空间。
*/
    public void reserve(){
        for (int i = 0,j = curlen-1;i < j; i++,j--) {
            Object temp = ListElem(i);
            listElem[i] = listElem[j];
            listElem[j] = temp;
        }
    }
 /* 编写一个单链表类的成员函数，
    实现在非递诚的有序单链表中插入一个值为x的数据元素，
    并使单链表仍保持有序的操作。*/
    public void insert(int x){
        Node p = head.getNext(); //指向首节点
        Node q = head; //用来记录p的前驱节点
        int temp;
        while(p!=null){
            temp = ((Integer)p.getData()).intValue();
            if(temp<x){
                q = p;
                p = p.getNext();
            }else {
                break;
            }
            Node s = new Node(x);  //生成新节点s
            s.setNext(p); //将s节点插入到单链表的q结点和p节点之间
            q.setNext(s);
        }
    }
/*
    编写一个单链表类的成员函数，实现对带头结点的单链表就地逆置的操作。
    所谓逆置，就是把( a1,a2,.,an)变成(an,an-1,..,a1);所谓就地,
    就是指逆置后的结点仍存储在原来单链表的存储空间中，
    只不过通过修改链来改变单链表中每一个结点之间的逻辑位置关系。
*/

    public void reverse(){  //头插法加入
        Node p = head.getNext();
        head.setNext(null);
        Node q;
        while(p!=null){
            q = p.getNext();
            p.setNext(head.getNext());
            head.setNext(p);
            p = q;
        }
    }
}
