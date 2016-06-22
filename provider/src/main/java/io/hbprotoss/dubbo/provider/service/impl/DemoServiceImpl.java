package io.hbprotoss.dubbo.provider.service.impl;

import io.hbprotoss.dubbo.provider.service.DemoService;

/**
 * Created by hbprotoss on 4/6/16.
 */
public class DemoServiceImpl implements DemoService {
    public String echo(String src) {
        System.out.println("------------" + src + "------------");
        return src;
    }
}
