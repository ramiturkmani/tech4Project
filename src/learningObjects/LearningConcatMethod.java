package learningObjects;

public class LearningConcatMethod {
    public static void main(String[] args){

        String tech = "Tech";
        String global = "Global";

        String schoolName1 = "Tech" + "Global";
        //String schoolName1 = tech + Global;
        String schoolName2 = tech.concat(global);

        System.out.println(schoolName1 + "\n" + schoolName2);
    }
}
