package com.olive.search;

/**
 * @author olive
 * @version 1.0
 * @date Created in 2023/5/17 20:41
 * @modified By
 */
public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12,21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        //创建三个块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        Block[] blocks = {b1, b2, b3};

        int index = findNumber(arr, blocks, 100);
        System.out.println(index);

    }

    private static int findNumber(int[] arr, Block[] blocks, int num) {
        int flag = -1;
        int index = findIndexFromBlocks(blocks, num);
        if (index != -1) {
            Block block = blocks[index];
            int i ;
            for (i = block.getStartIndex(); i <= block.getEndIndex(); i++) {
                if (num == arr[i]) {
                    flag = i;
                    break;
                }
            }
        }
        return flag;
    }

    private static int findIndexFromBlocks(Block[] blocks, int num) {
        int flag = -1;
        for (int i = 0; i < blocks.length; i++) {
            Block block = blocks[i];
            if (num < block.getMax()) {
                flag = i;
                break;
            }
        }
        return flag;
    }
}
