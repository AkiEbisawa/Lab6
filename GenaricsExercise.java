

public class GenaricsExercise {
    public static <T extends Comparable<T>> T max(T[] list) {
    
        T num = list[0];
    
        for (T x : list) {
            if (num.compareTo(x) < 0) {
                num = x;
            }
        }
        return num;
    }
        public static void main(String[] args) {
            
          Integer[] ints = {3, 4, 5};
            
          Double[] doubles = {6.6, 8.8, 7.7};

          System.out.println("Max of 3,4 and 5 is "+ max(ints));
          System.out.println("Max of 6.6,8.8 and 7.7 is " +max(doubles));
        }
    }