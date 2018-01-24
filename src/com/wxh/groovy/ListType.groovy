package com.wxh.groovy

/**
 *  泛型类
 * @auther wxh
 * @date 2018/1/19 17:02
 */
class ListType<T> {
    private  T localt;

    public T get(){
        return this.localt;
    }

    public void  set(T plocalt){
        this.localt = plocalt;
    }
}
