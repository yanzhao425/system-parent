package org.lanqiao.domain;

import org.junit.Test;

public class DomainTest {
    @Test
    public void showInfoTest(){
        User user = new User();
        user.showInfo("张三","123456");
    }
}
