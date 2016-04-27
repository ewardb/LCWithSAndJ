package javatest;


import java.util.*;

/**
 * Created by wq on 16-4-23.
 */
public class Huffman {
    public static void getHuffanTree(String s){
        String x[] = s.split("");
        TreeMap<String,Integer> treeMap = new TreeMap();
        for(String str:x){
            if(treeMap.containsKey(str)){
                int hz = treeMap.get(str);
                treeMap.put(str,hz+1);
            }else{
                treeMap.put(str,1);
            }
        }

        //Stack用於構建   哈夫曼數的Keys
//        Stack<String> stack = new Stack();
//        for(String keys : treeMap.keySet()){
//            stack.push(keys);
//        }

        //構建哈夫曼數
//        String a = stack.pop();
//        String b = stack.pop();
//        int aValue = treeMap.get(a);
//        int bValue = treeMap.get(b);
//        for(int i =0 ; i<stack.size();i++){
//            int cValue = treeMap.get(stack.pop());
//            int dValue = treeMap.get(stack.pop());
//            if(aValue + bValue > cValue + dValue){
//
//            }
//        }
        List<Map<String,Integer>> list = new ArrayList();
        Iterator iter = treeMap.entrySet().iterator();
        while(iter.hasNext()){

        }

    }
    public static void getHuffanCode(){

    }

    public static void main(String args[]){
        String s = "alibaba";
        getHuffanTree(s);
    }
}

//對於 xxxMap  集合的遍歷！！！！
//        for(String key : treeMap.keySet()){
//            System.out.println(key + "   " + treeMap.get(key));
//        }
//        for(java.util.Map.Entry<String,Integer> entry : treeMap.entrySet()){
//            System.out.println(entry.getKey() +" "+entry.getValue());
//        }
//        Iterator<Map.Entry<String,Integer>> iterator = treeMap.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String,Integer> en = iterator.next();
//            System.out.println(en.getKey() +" "+en.getValue());
//        }