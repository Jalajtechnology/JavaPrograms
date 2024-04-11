
package InnerClass;

public class StaticInner {
    private int outerVar = 10;

    public static class StaticInnerClass {
        public void accessOuterVar() {
            StaticInner outer = new StaticInner();
            System.out.println("Outer variable accessed from inner class: " + outer.outerVar);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass inner = new StaticInnerClass();
        inner.accessOuterVar();
    }
}
