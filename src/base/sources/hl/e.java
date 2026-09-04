package hl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f40457a;

    public e(d backing) {
        s.h(backing, "backing");
        this.f40457a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        s.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f40457a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        s.h(elements, "elements");
        return this.f40457a.s(elements);
    }

    @Override // gl.g
    public int d() {
        return this.f40457a.size();
    }

    @Override // hl.a
    public boolean h(Map.Entry element) {
        s.h(element, "element");
        return this.f40457a.t(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f40457a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f40457a.x();
    }

    @Override // hl.a
    public boolean k(Map.Entry element) {
        s.h(element, "element");
        return this.f40457a.O(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        s.h(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        s.h(elements, "elements");
        this.f40457a.q();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        s.h(elements, "elements");
        this.f40457a.q();
        return super.retainAll(elements);
    }
}
