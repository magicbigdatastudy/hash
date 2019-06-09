package net.noyark.hash;

import org.junit.Test;

public class HashSlotTest {

    @Test
    public void testSlot(){
        //假设15整数，8位的二进制，就是某个主节点的位序列(15相当于16384位的位序列)
        //求15的位序列
        int slotBinary = 15;
        System.out.println(Integer.toBinaryString(slotBinary));

        int index0 = 0;

        int num0 = (15>>7)&1;

        int bit = 8;
        for(int i =0 ;i<bit;i++){
            int num = (15>>(bit-1-i))&1;
            //为0就是这个位序列没有1了，为1就是位序列有1
            //15>>0 00001111-> (00001111)&1 -> 11111111 - 1
            //15>>1 00001111-> (00000111)&1 -> 11111111 依然有控制权 1
            //15>>2 00001111-> (00000011)&1 -> 11111111 依然有控制权 1
            //15>>3 00001111-> (00000001)&1 -> 11111111 - 1
            //15>>4 00001111-> (00000000)&1 -> 00000000 无控制权 0
            System.out.print("二进制"+num);
            System.out.println("下标"+i);
        }

        System.out.println(index0);
    }

}
