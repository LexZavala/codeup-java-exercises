public class ExceptionsLecTest {
    public static void main(String[] args) {

//        try {
//            ExceptionsLecture study = new ExceptionsLecture();
//            System.out.println(Integer.parseInt(study.maybeAnInterger));
//            System.out.println(study.definitelyNotAnInterger);
//            System.out.println(Integer.parseInt(study.definitelyNotAnInterger));
//        } catch (NumberFormatException nfe) {
//            System.out.println("I got an exception: " + nfe);
////            System.out.println(nfe.getMessage());
////            nfe.printStackTrace();
//        }
        ExceptionsLecture study = new ExceptionsLecture();
//        study.askForAnInterger();
//        study.aMoreComplexAskForInteger();

        try {
            study.echoWordCustomEx();
        } catch (CusswordException ce) {
            System.out.println("How rude!");
            System.out.println(ce.getMessage());
        }


    }
}
