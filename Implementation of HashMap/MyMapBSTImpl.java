package com.jetbrains;

public class MyMapBSTImpl implements MyMap
{
    class TreeNode
    {
        Pair pair;
        TreeNode left, right;
        TreeNode(Pair pair) {
            this.pair = pair;
        }
    }

    private TreeNode root;

    @Override
    public void put(String key, String val)
    {
        if (key == null)
        {
            return;
        }
        root = insert(root, new Pair(key, val));
    }

    private TreeNode insert(TreeNode root, Pair pair)
    {
        if (root == null)
        {
            return new TreeNode(pair);
        }

        if (pair.key.compareTo(root.pair.key) < 0)  // compare among String ASCII
        {                                           // recursion + insert
            root.left = insert(root.left, pair);
        }
        else if (pair.key.equals(root.pair.key))
        {
            root.pair = pair;
        }
        else
        {
            root.right = insert(root.left, pair);
        }

        return root;
    }

    @Override
    public String get(String key)
    {
        if (key == null)
        {
            return null;
        }

        return search(root, key);
    }

    private String search(TreeNode root, String key)
    {
        if (root == null)
        {
            return null;
        }

        if (key.equals(root.pair.key))
        {
            return root.pair.value;
        }
        else if(key.compareTo(root.pair.key) < 0)
        {
            return search(root.left, key);
        }
        else
        {
            return search(root.right, key);
        }
    }
}
