package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    return false;
  }

  @Override
  public E peek() {
    if(this.size == 0)
    {
      throw new NoSuchElementException();
    }else {
      return this.data[this.front];
    }
  }

  @Override
  public E poll() {
    if(this.size == 0)
    {
      throw new NoSuchElementException();
    }else if( this.size > 1){
      Object tempObject = this.data[0];
      for(int i = 0; i < this.capacity-1; i++)
      {
        this.data[i] = this.data[i+1];
      }
      this.size -=1;
      return (E)tempObject;

    }else{
      Object tempObject = this.data[0];
      this.size -=1;
      return (E)tempObject;
    }

  }

  @Override
  public boolean isEmpty() {
    // TODO
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public List<E> asList() {
    List<E> list = new ArrayList<>();
    for(int i = 0; i < this.size; i++)
    {
      list.add(this.data[i]);
    }
    return list;
  }
  }
}
