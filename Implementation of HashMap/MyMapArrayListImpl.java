package com.jetbrains;

import java.util.ArrayList;
import java.util.List;

public class MyMapArrayListImpl implements MyMap
{
    private List<Pair> pairs;

    public MyMapArrayListImpl()
    {
        pairs = new ArrayList<>();
    }

    @Override
    public void put(String key, String val)
    {
        if (key == null)
        {
            return;
        }

        for (Pair pair: pairs)
        {
            if (key.equals(pair.key))
            {
                pair.value = val;
                return;
            }
        }

        pairs.add(new Pair(key, val)); // add to the ArrayList
    }

    @Override
    public String get(String key)
    {
        if (key == null) {
            return null;
        }

        for (Pair pair: pairs) {
            if (key.equals(pair.key))
            {
                return pair.value;
            }
        }

        return null;
    }
}