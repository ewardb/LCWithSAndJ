package javatest.huff;

import java.util.*;

/**
 * Created by wq on 16-4-23.
 */
public class Node<E> implements Comparable<Node<E>> {
    E data;
    Node<E> leftNode;
    Node<E> rightNode;
    double weight;

    public Node(E data,double weight){
        this.data = data;
        this.weight = weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public int compare(Node x, Node y) {
        return (x.getWeight() < y.getWeight()) ? -1 : ((x.getWeight() == y.getWeight()) ? 0 : 1);
    }

    public int compareTo(Node node){
        return compare(this,node);
    }

}



