public class Crate<T> {
   private T contents;
   public T lookInCrate() {
      return contents;
   }
   public void packCrate(T contents) {
      this.contents = contents;
   }

   public static void main(String[] args) {
   
       Crate<? super Integer> cInt = new Crate<Number>();
       cInt.packCrate(10);
       System.out.println(cInt.lookInCrate());
       Number n = (Number) 10;
       cInt.packCrate(n);
    }
}
