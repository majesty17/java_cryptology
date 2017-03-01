package com.majesty.crypto.other;

public class FindHuman {
    public static void getTotal(String str,int win){
        int len=str.length();
        if(win<1 || win >len){
            System.out.println("win size is illegal");
            return;
        }
        int winspace=1<<win;
        System.out.println("========================================");
        System.out.println("win size is "+win+", winspace is "+winspace);
        
        int[] map=new int[winspace];
        
        for(int i=0;i<len-win+1;i++){
            String substr=str.substring(i, i+win);
            map[Integer.parseInt(substr, 2)]++;
        }
        
        for(int i=0;i<winspace;i++){
            int progressbarlen=100*map[i]/(len-win+1);
            String out=String.format("%"+win+"s\t%d\t%s", Integer.toBinaryString(i),map[i],getProgressBar(progressbarlen));
            
            System.out.println(out);
        }
        
        System.out.println("========================================");
    }
    public static String getProgressBar(int len){
        if(len>0){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<len;i++)
                sb.append("=");
            return sb.toString();
        }
        else
            return "";
    }
}
