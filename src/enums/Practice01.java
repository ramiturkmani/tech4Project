package enums;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import static enums.Constants.Frequencies.frequency;

public class Practice01 {
    public static void main(String[] args) {
        Constants.Frequencies frequency = Constants.Frequencies.YEARLY;

        switch (frequency){
            case YEARLY:
                System.out.println("$38400");
                break;
            case MONTHLY:
                System.out.println("$3200");
                break;
            case BIWEEKLY:
                System.out.println("$1600");
                break;
            case WEEKLY:
                System.out.println("$800");
                break;
            case DAILY:
                System.out.println("$160");
                break;
            case HOURLY:
                System.out.println("$20");
                break;
            default:
                throw new RuntimeException("There is no such frequency!!!");
        }
    }
}
