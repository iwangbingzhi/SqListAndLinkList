package com.linklist;

import java.util.Scanner;

public class TestLinkList {
    public static void main(String[] args) throws Exception {
        TestLinkList testLinkList = new TestLinkList();
        testLinkList.zhijieqianqu();
    }
    private void zhijieqianqu() throws Exception {
        int n = 10;
        LinkList linkList = new LinkList();
        for (int i = 0; i <n ; i++) {
            linkList.insert(i,i);
        }
        for (int j = 0; j <n ; j++) {
            System.out.println(j);
        }
        System.out.println("请输入i的值");
        int i = new Scanner(System.in).nextInt();
        if(i>0 && i<=n){
            System.out.println("第"+i+"个元素的直接前驱是："+linkList.get(i-1));
        }else {
            System.out.println("第"+i+"个元素的直接前驱是不存在");
        }
    }
    public static void removetest() throws Exception {
        System.out.println("请输入单链表中的10个节点值：");
        LinkList linkList = new LinkList(10,true);
        System.out.println("删除重复节点前单链表中的各个节点值：");
        linkList.display();
        removeRepeatElem(linkList);
        System.out.println("删除重复节点前单链表中的各个节点值：");
        linkList.display();
    }
    public static void removeRepeatElem(LinkList linkList) throws Exception {
        Node p = linkList.head.next, q;
        while (p != null){
            int order = linkList.indexOf(p.data);
            q = p.next;
            while(q != null){
                if((p.data).equals(q.data)){
                    linkList.remove(order + 1);
                }else {
                    ++order;
                }
      /*          q = q.next();*/
            }
          /*  p = p.next;*/
        }
    }
}
