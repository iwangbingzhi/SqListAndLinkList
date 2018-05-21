package com.sqlist;

import java.util.Scanner;

public class SearchSqList {
    public static void main(String[] args) throws Exception {
        SearchSqList searchSqList = new SearchSqList();
        searchSqList.searchqianqu();

    }
    private void searchdata() throws Exception {
        SqList list = new SqList(15);
        list.insert(0,'a');
        list.insert(1,'b');
        list.insert(2,'c');
        list.insert(3,'d');
        list.insert(4,'e');
        int order = list.indexOf('a');
        if (order != -1) {
            System.out.println("顺序表中出现值为a的元素的位置为：" + order);
        }else {
            System.out.println("此顺序表不含a的元素");
        }
    }
    private void searchqianqu() throws Exception {
        int n = 10;
        //int sum = 0;
        SqList sqList = new SqList(80);
        for (int i = 0; i <n ; i++) {
            sqList.insert(i,i);
        }
        /*int order = sqList.indexOf(9);
        System.out.println("顺序表中出现值为a的元素的位置为：" + order);*/
        System.out.println("请输入i的值：");
        int i = new Scanner(System.in).nextInt();
        if (i>0&&i<=n){
            System.out.println("第"+i+"个数的直接前驱是:"+sqList.get(i-1));
        }else {
            System.out.println("第"+i+"个数的直接前驱不存在");
        }
      /*  for (int j = 0; j <sqList.length() ; j++) {
            System.out.println(j);
            sum+=j;
        }
        System.out.println(sum);*/
    }
    }

