package sourcecode.poly.overriding;

public class OveeridingMain {

    public static void main(String[] args) {

        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();
        System.out.println(" =============================== ");

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println(" =============================== ");

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Poly -> Child");
        System.out.println("value = " + poly.value); // 변수는 오버라이딩x

        // 오버라이딩 된 것을 우선권으로 가져오기 때문에 Child.method가 출력
        poly.method();  // 메서드 오버라이딩o
        System.out.println(" =============================== ");

    }

}
