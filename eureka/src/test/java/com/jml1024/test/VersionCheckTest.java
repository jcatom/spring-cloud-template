package com.jml1024.test;

import org.junit.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

public class VersionCheckTest {
    @Test
    public void test_printVersion() {
        String springVersion = SpringVersion.getVersion();
        String springBootVersion = SpringBootVersion.getVersion();
        System.out.println(springVersion);
        System.out.println(springBootVersion);
    }
}
