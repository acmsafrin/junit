import org.hamcrest.core.IsEqual;
import org.junit.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class AssertThatTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @Before
    public void beforeEach(){
        System.out.println("Before Each");
    }

    @After
    public void afterEach(){
        System.out.println("After Each");
    }

    @org.junit.Test
    @Ignore("TODO")
    public void test1(){
        System.out.println("Test");
    }


    @org.junit.Test
    public void isTest(){
        //    Assume.assumeTrue(false);
        System.out.println("Test 3");
        assertThat(1, is(1));

    }

    @org.junit.Test
    public void equalToTest(){
        int age = 30;
        assertThat(age, IsEqual.equalTo(30));
        assertThat(age, is(30));
        assertThat(age, not(equalTo(33)));
        assertThat(age, is(not(33)));
    }


    @org.junit.Test
    public void verify_multiple_values() throws Exception {

        double marks = 100.00;
        assertThat(marks, either(is(100.00)).or(is(90.9)));
        assertThat(marks, both(not(99.99)).and(not(60.00)));
        assertThat(marks, anyOf(is(100.00),is(1.00),is(55.00),
                is(88.00),is(67.8)));
        assertThat(marks, not(anyOf(is(0.00),is(200.00))));
        assertThat(marks, not(allOf(is(1.00),is(100.00), is(30.00))));
    }

    @org.junit.Test
    public void verify_collection_values() throws Exception {
        List<Double> salary = Arrays.asList(50.0, 200.0, 500.0);
        assertThat(salary, hasItem(50.00));
        assertThat(salary, hasItems(50.00, 200.00));
        assertThat(salary, not(hasItem(1.00)));
    }

    @org.junit.Test
    public void verify_Strings() throws Exception {
        String name = "John Jr Dale";
        assertThat(name, startsWith("John"));
        assertThat(name, endsWith("Dale"));
        assertThat(name, containsString("Jr"));
    }
}
