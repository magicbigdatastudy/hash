package net.noyark.hash;

import org.junit.Test;

public class HashSlotTest {

    @Test
    public void testSlot(){
        //假设15整数的二进制，就是某个主节点的位序列
        int slotBinary = 15;
        System.out.println(Integer.toBinaryString(slotBinary));

        int index0 = 0;

        int num0 = (15>>7)&1;

        for(int i =0 ;i<8;i++){
            int index = i;
            int num = (15>>(7-i))&1;//为0就是这个位序列没有1了，为1就是位序列有1
            System.out.print("二进制"+num);
            System.out.println("下标"+index);
        }

        System.out.println(index0);
    }

}
