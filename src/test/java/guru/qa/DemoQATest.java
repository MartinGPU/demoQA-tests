package guru.qa;

import org.junit.jupiter.api.*;

public class DemoQATest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Самый первый и единственный в иерархии\n");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Самый последний и единственный в иерархии\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Я первый тест в иерархии\n"); // \n - перенос текста
    }

    @AfterEach
    void afterEach() {
        System.out.println("Я последний тест в иерархии\n");
    }

    @Test
    void firstTest() {
        System.out.println("Я тест первый\n");
    }

    @Test
    void secondTest(){
        System.out.println("Я тест второй\n");
    }
}
