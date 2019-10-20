/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha3_ex6;

/**
 *
 * @author vitor
 */
public class LinkedStack<T> implements StackADT<T> {

    private int count;
    private LinearNode<T> head;

    public LinkedStack() {
        this.count = 0;
        this.head = null;
    }

    @Override
    public void push(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);
        if (this.count == 0) {
            this.head = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;

        }
        this.count++;
    }

    @Override
    public T pop() throws EmptyCollectionException {
        if (this.count == 0) {
            throw new EmptyCollectionException("nao tem");
        } else {
            LinearNode<T> current = this.head;
            this.head = this.head.getNext();
            current.setNext(null);
            this.count--;
            return current.getElement();
        }
    }

    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("nao tem");
        }
        return this.head.getElement();
    }

    @Override
    public boolean isEmpty() {
        if (this.count==0) {
           return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nHead: ");
        str.append(this.head.getElement());
        str.append(" Tamanho:");
        str.append(this.count);
        str.append("\n");

        LinearNode<T> current = this.head;
        while (current != null) {
            str.append(current.getElement());
            str.append("//");
            current = current.getNext();
        }

        return str.toString();
    }

}
