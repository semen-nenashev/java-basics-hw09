import java.util.ArrayList;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        ArrayList<String> res = new ArrayList<>();
// does not work if there is more than one similar element in the one array
//        for (String el:array1) {
//            for (String elem:array2) {
//                if(el.equals(elem)){
//                    res.add(el);
//                    elem = "common el";
//                }
//            }
//        }
        for (int a = 0; a < array1.length; a++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[a].equals(array2[j])) {
                    res.add(array1[a]);
                    array2[j] = "common el";
                }
            }
        }
        String[] final_result = res.toArray(new String[0]);
        return final_result;
    }

}