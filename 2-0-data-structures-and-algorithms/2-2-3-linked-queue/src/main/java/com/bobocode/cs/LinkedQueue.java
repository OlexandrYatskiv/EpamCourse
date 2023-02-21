package com.bobocode.cs;

import com.bobocode.util.ExerciseNotCompletedException;
import org.snakeyaml.engine.v2.nodes.Node;

/**
 * {@link LinkedQueue} implements FIFO {@link Queue}, using singly linked nodes. Nodes are stores in instances of nested
 * class Node. In order to perform operations {@link LinkedQueue#add(Object)} and {@link LinkedQueue#poll()}
 * in a constant time, it keeps to references to the head and tail of the queue.
 * <p><p>
 * <strong>TODO: to get the most out of your learning, <a href="https://www.bobocode.com/learn">visit our website</a></strong>
 * <p>
 *
 * @param <T> a generic parameter
 * @author Taras Boychuk
 * @author Ivan Virchenko
 */

public class LinkedQueue<T> implements Queue<T> {
    static class Node<T> {
        // todo:
        T element;
        Node<T> next;

        public Node(T el){
            this.element=el;
        }

    }

    // start
    Node<T> head;

    // end queue
    Node<T> last;
int size = 0;

    /**
     * Adds an element to the end of the queue.
     *
     * @param element the element to add
     */
    public void add(T element) {
// new ExerciseNotCompletedException(); // todo: implement this method
Node<T> newItem = new Node<>(element);
        if(size==0)
        {
            this.head=newItem;
            this.last=newItem;
        }
        else{


            this.last.next =newItem;
            this.last = newItem;


        }

        size++;
    }

    /**
     * Retrieves and removes queue head.
     *
     * @return an element that was retrieved from the head or null if queue is empty
     */
    public T poll() {
        if(size==1){
            T elem= head.element;
            this.head=this.last=null;
            size=0;
            return elem;
        }
        else if(size !=0){
            Node<T> oldHead=this.head;

            this.head=oldHead.next;
            this.last=this.last.next;

            size--;
            return oldHead.element;
        }

        else{
            size=0;
            return null;
        }

    }

    /**
     * Returns a size of the queue.
     *
     * @return an integer value that is a size of queue
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, returns {@code false} if it's not
     */
    public boolean isEmpty() {
        if(head==null && last==null || size==0)
        return true;
        else
            return false;

    }
}
