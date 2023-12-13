import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertEquals;

/**
 * ?????????????????????
 * ???????????????????????????????????????????????????????????????????????????????????????????????????
 * ???????????????????????????????????????????????????????????????
 * ??????????????????????????????????????????????????????????????????
 * 1. ???????+ or - or 0
 *            ???? or ????
 * 2. ????????+ or -
 * 3. ??????????? or ??????? or ????????
 *            + or -
 * 4. ???????????????????????104????? or ?????????????104?????
 */
public class L2021110706_1_Test {

    /**
     * ????fractionToDecimal????
     */
    @Test
    public void fractionToDecimalTest(){
        Solution1 solution = new Solution1();

        // ???????
        assertEquals("0.5", Solution1.fractionToDecimal(1, 2));
        // ???????
        assertEquals("-0.5", Solution1.fractionToDecimal(-1, 2));

        // ??????
        assertEquals("-0.5", Solution1.fractionToDecimal(-1, 2));
        // ??????
        assertEquals("0.5", Solution1.fractionToDecimal(-1, -2));
        // ????0
        assertEquals("devided by zero", Solution1.fractionToDecimal(-1, 0));

        // ????????
        assertEquals("2", Solution1.fractionToDecimal(2, 1));
        // ????????????
        assertEquals("0.5", Solution1.fractionToDecimal(1, 2));
        // ???????????
        assertEquals("0.(3)", Solution1.fractionToDecimal(1, 3));

        // ??????
        assertEquals("3", Solution1.fractionToDecimal(6, 2));
        // ??????
        assertEquals("3", solution.fractionToDecimal(-6, 2));  //?????????
        //assertEquals("3", Solution1.fractionToDecimal(-6, 2));

        // ???????????????????104?????
        assertEquals("0.(012)", Solution1.fractionToDecimal(4, 333));
        // ?????????????????104?????
        assertEquals("-22.6(66330408357582135001459744612579077084907075062426932178118727867271782450191003164259080434469147", solution.fractionToDecimal(1195314646, -52735252));


    }
}