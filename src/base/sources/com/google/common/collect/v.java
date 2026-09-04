package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends x implements Map {
    protected v() {
    }

    @Override // java.util.Map
    public void clear() {
        f().clear();
    }

    public boolean containsKey(Object obj) {
        return f().containsKey(obj);
    }

    public Set entrySet() {
        return f().entrySet();
    }

    protected abstract Map f();

    protected boolean g(Object obj) {
        return n0.b(this, obj);
    }

    public Object get(Object obj) {
        return f().get(obj);
    }

    protected boolean h(Object obj) {
        return n0.c(this, obj);
    }

    public boolean isEmpty() {
        return f().isEmpty();
    }

    protected int k() {
        return g1.d(entrySet());
    }

    public Set keySet() {
        return f().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return f().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        f().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return f().remove(obj);
    }

    public int size() {
        return f().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return f().values();
    }
}
