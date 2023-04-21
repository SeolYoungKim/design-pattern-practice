package _21_visitor.complietest;

import _21_visitor.complietest.A.B;
import _21_visitor.complietest.A.C;

public class Check {
    public static void main(String[] args) {
        final D d = new D();

        final A b = new B();
        final A c = new C();

//        d.print(b);  // 컴파일 에러
//        d.print(c);  // 컴파일 에러
    }
}
