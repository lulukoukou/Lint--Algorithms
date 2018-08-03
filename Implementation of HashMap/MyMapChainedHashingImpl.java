package com.jetbrains;

public class MyMapChainedHashingImpl implements MyMap
{
    class ListNode
    {
        Pair pair;
        ListNode next;
        public ListNode(Pair pair)
        {
            this.pair = pair;
        }
    }
    private static final float LOAD_FACTOR = 0.75;
    private int capacity; //  length of list
    private int size; // number of pairs
    private ListNode [] data;

    MyMapChainedHashingImpl()
    {
        capacity = 16;
        size = 0;
        data = new ListNode[capacity];

    }

    @Override
    public String get (String key)
    {
        if (key == null)
        {
            return null;
        }

        int index = key.hashCode() % capacity;
        ListNode cur = data[index];

        while (cur != null)
        {
            if (cur.pair.key.equals(key))
            {
                return cur.pair.value;
            }
            cur = cur.next;
        }
        return null;
    }

    @Override
    public void put (String key, String value)
    {
        if (key == null)
        {
            return;
        }
        if (size >= capacity * LOAD_FACTOR)
        {
            doubleSizeAndRehash();
        }
        int index = key.hashCode() % capacity;
        ListNode cur = data[index];

        while (cur != null)
        {
            if (cur.pair.key.equals(key))
            {
                cur.pair.value = value;
                return;
            }

            cur = cur.next;
        }


        ListNode newNode = new ListNode(new Pair(key, value));
        newNode.next = data[index];
        data[index] = newNode;
        size ++;
    }

    private void doubleSizeAndRehash()
    {
        int newCapacity = capacity * 2;
        ListNode[] newData = new ListNode [newCapacity];

        for (int i = 0; i < capacity; i++)
        {
            ListNode cur = data[i];
            while (cur != null)
            {
                int newIndex = cur.pair.key.hashCode() % newCapacity;
                ListNode newCur = newData[newIndex];
                boolean override = false;
                while (newCur != null)
                {
                    if (newCur.pair.key.equals(cur.pair.key))
                    {
                        override = true;
                        newCur.pair.value = cur.pair.value;
                        break;
                    }
                    newCur = newCur.next;
                }

                if (!override)
                {
                    ListNode newNode = new ListNode(cur.pair);
                    newNode.next = newData[newIndex];
                    newData[newIndex] = newNode;

                }
                cur = cur.next;
            }
        }

        capacity = newCapacity;
        data = newData;
    }
}
