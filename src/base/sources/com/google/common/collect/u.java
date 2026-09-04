package com.google.common.collect;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends x implements Collection {
    protected u() {
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        return f().add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        return f().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        f().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return f().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return f().containsAll(collection);
    }

    protected abstract Collection f();

    protected Object[] g() {
        return toArray(new Object[size()]);
    }

    protected Object[] h(Object[] objArr) {
        return v0.f(this, objArr);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return f().isEmpty();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return f().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return f().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return f().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return f().size();
    }

    public abstract Object[] toArray(Object[] objArr);
}
