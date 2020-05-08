package com.jli.designpattern.demo;

import java.util.Scanner;

public class NDemo{

    private static int errorCount = 0;

    private static String getIn(Scanner s){

        if (s.hasNext()) {
            return s.next();
        }
        errorCount ++;
        return "\"请输入“A”或者“B”,你一共只有5次机会再输错\"+(5-this.errorCount)+\"次退出\"";
    }

    public static void main(String[] args){

        Scanner s = new java.util.Scanner(System.in);

        do {
        System.out.println("请输入字母选择人物，A为小小，B为大大");
        //if (s.hasNext()){
        //juese = s.next();
        //}
        //int errorCount1 = 0;
        //int errorCount2 = 0;
        String juese = getIn(s);
        //for(int o = 1; o<5; o++){
            if("A".equals(juese)) {
                //int i =1;
                //for(int i=1;i<5;i++){
                errorCount = 0;
                while (true) {

                    System.out.println("小小想知道什么英雄适合你吗？请输入“1”或者“2”,1为想2为不想");
                    int hero = s.nextInt();
                    if (hero == 1) {
                        System.out.println("想想吧");
                        break;
                    } else if (hero == 2) {
                        System.out.println("好的");
                        break;
                    } else {
                        if (errorCount >=4){
                            break;
                        }
                        errorCount++;
                        System.out.println("\"请输入“1”或者“2”,你一共只有5次机会再输错"+(5-errorCount)+"次退出\"");
                        continue;
                    }
                }
                    //else
                        //break;
                //}break;
            }else if("B".equals(juese)){
                System.out.println("大大适合露露,输入3查看推荐出装");
                int tuijian=s.nextInt();
                if(tuijian==3){
                    System.out.println("香炉，皇冠，暗影，帽子，cd鞋，圣杯");
                }else{
                    System.out.println("请输入3");
                }break;
            }else {
                System.out.println(juese);
                //System.out.println("请输入“1”或者“2”,你一共只有5次机会再输错"+(5-o)+"次退出");
                //errorCount2++;
                //juese = s.nextInt();
            }
        //}
            if (errorCount >=4){
                System.out.println("你输错了五次现在已经自动退出了");
                break;
            }
            break;
        }while (true);
        s.close(); //关闭输入流
    }
}
