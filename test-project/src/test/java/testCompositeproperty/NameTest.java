package testCompositeproperty;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description :
 * @Project : collections
 * @Program Name  : testCompositeproperty.NameTest
 * @Author : zhongpingtang@yiruntz.com 唐忠平
 */
public class NameTest {

    @Test
    public void testNames() {
        List<Object> collect = Arrays.asList(1, 2, 3, 4).stream().map((e) -> {

            return null;
        }).collect(Collectors.toList());

        System.out.println(collect);


    }

    public static void main(String[] args) {

    }


}
