package _09_facade.product;

//import _09_facade.user.UserService;  // 퍼사드를 도입하면, ProductService에서 해당 의존성이 사라진다 (정확히는 퍼사드로 옮겨간다)

public class ProductService {
    private static final int PRODUCT_FEE = 10000;

    private final UserServiceFacade userServiceFacade;

    public ProductService(final UserServiceFacade userServiceFacade) {
        this.userServiceFacade = userServiceFacade;
    }

    public void sellProduct() {
        System.out.println("상품을 판매하였습니다.");
        userServiceFacade.increaseMoney(PRODUCT_FEE);
    }

    public void buy() {
        System.out.println("상품을 구매하였습니다.");
        userServiceFacade.decreaseMoney(PRODUCT_FEE);
    }
}
