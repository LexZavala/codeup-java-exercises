public class ServerNameGenerator {

    private static String[] adjArr = {
            "adorable",
            "agreeable",
            "awful",
            "annoying",
            "calm",
            "brekable",
            "charming",
            "bright",
            "cheerful",
            "colorful"
    };

    private static String[] nounArr = {
            "people",
            "history",
            "bird",
            "power",
            "music",
            "community",
            "student",
            "scene",
            "customer",
            "topic"
    };

    private static String getRandomElement (String arr []){
        int randomNum = (int) (Math.random() * arr.length - 1);
        return arr[randomNum];
    }

    public static String makeServerName (String[] arr1, String [] arr2){
        String adj = getRandomElement(arr1);
        String noun = getRandomElement(arr2);
        return adj + "-" +  noun;
    }

    public static void main(String[] args) {

        System.out.print("Here is your server name:\n" + makeServerName(adjArr, nounArr));


    }
}
