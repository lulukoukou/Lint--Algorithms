package com.jetbrains;

import java.util.HashMap;

public class MyMapLinearProbingHasingImpl implements MyMap
{
    private int capacity;
    private Pair[] data;

    public MyMapLinearProbingHasingImpl()
    {
        capacity = 16;
        data = new Pair[capacity];

    }

    @Override
    public String get(String key)
    {
        if (key == null)
        {
            return null;
        }

        int index = key.hashCode() % capacity;
        for (int i = 0; i < capacity; i++)
        {
            int curIndex = (index + i) % capacity;
            if (data[curIndex] == null)
            {
                return null;
            }
            else if (data[curIndex].key.equals(key))
            {
                return data[curIndex].value;
            }
        }

        return null;
    }

    @Override
    public void put(String key, String value)
    {
        if (key == null)
        {
            return;
        }
        int index = key.hashCode() % capacity;
        for (int i = 0; i < capacity; i++)
        {
            int curIndex = (index + i) % capacity;
            if (data[curIndex] == null)
            {
                data[curIndex] = new Pair(key, value);
                return;
            }
            else if (data[curIndex].key.equals(key))
            {
                data[curIndex].value = value;
                return;
            }
        }

        throw new IllegalStateException("HashMap is already full");
    }
}
