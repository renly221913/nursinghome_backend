package com.neu.nursing_home.vo;

import java.util.List;

/**
 * V-View   O-Object 提供视图层需要的数据
 */
public class ResultVO<T> {

    private String message;

    private int state;

    //列表数据
    private List<T> list;

    //单个数据
    private T object;

    private String keyword;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
