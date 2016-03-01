package com.sist;

/**
 * Created by hojin on 16. 3. 1.
 */
public class Platform<T,M> {
    private T kind;
    private M title;

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public M getTitle() {
        return title;
    }

    public void setTitle(M model) {
        this.title = model;
    }
}
