package net.noyark.hash;

import org.junit.Test;

public class HashSlotTest {

    @Test
    public void testSlot(){
        //假设50，16384位的二进制，就是某个主节点的位序列(15相当于16384位的位序列)
        //求15的位序列
        int count = 0;
        int bit = 16384;//二进制位序列的总长
        //50为这个节点控制的槽道
        for(int i =0 ;i<bit;i++){
            int num = (50>>(bit-1-i))&1;
            //为0就是这个位序列没有1了，为1就是位序列有1
            //15>>0 00001111-> (00001111)&1 -> 11111111 - 1
            //15>>1 00001111-> (00000111)&1 -> 11111111 依然有控制权 1
            //15>>2 00001111-> (00000011)&1 -> 11111111 依然有控制权 1
            //15>>3 00001111-> (00000001)&1 -> 11111111 - 1
            //15>>4 00001111-> (00000000)&1 -> 00000000 无控制权 0
            if(num == 1){
                count++;
            }
            System.out.print("二进制"+num);
            System.out.println("下标"+i);
        }
        System.out.println(count);
    }


}
