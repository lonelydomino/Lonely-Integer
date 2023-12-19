// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < a.size(); i++){
            if (set.contains(a.get(i))) {
            set.remove(a.get(i));
         } else {
            set.add(a.get(i));
         }        
        }
        return set.stream().findFirst().get();
    }

}
class Main {
  public static void main(String[] args) {
      List<Integer> str = new ArrayList<Integer>();

    int result = Result.lonelyinteger(str);
    System.out.println(result);
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}