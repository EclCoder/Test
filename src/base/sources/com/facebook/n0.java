package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends AbstractList {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f15936g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicInteger f15937h = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f15938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f15941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f15942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15943f;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(n0 n0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    public n0(Collection requests) {
        kotlin.jvm.internal.s.h(requests, "requests");
        this.f15940c = String.valueOf(Integer.valueOf(f15937h.incrementAndGet()));
        this.f15942e = new ArrayList();
        this.f15941d = new ArrayList(requests);
    }

    private final List g() {
        return j0.f15486n.i(this);
    }

    private final m0 k() {
        return j0.f15486n.l(this);
    }

    public /* bridge */ boolean A(j0 j0Var) {
        return super.remove(j0Var);
    }

    public j0 B(int i10) {
        return (j0) this.f15941d.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public j0 set(int i10, j0 element) {
        kotlin.jvm.internal.s.h(element, "element");
        return (j0) this.f15941d.set(i10, element);
    }

    public final void D(Handler handler) {
        this.f15938a = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, j0 element) {
        kotlin.jvm.internal.s.h(element, "element");
        this.f15941d.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(j0 element) {
        kotlin.jvm.internal.s.h(element, "element");
        return this.f15941d.add(element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f15941d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return e((j0) obj);
        }
        return false;
    }

    public final void d(a callback) {
        kotlin.jvm.internal.s.h(callback, "callback");
        if (this.f15942e.contains(callback)) {
            return;
        }
        this.f15942e.add(callback);
    }

    public /* bridge */ boolean e(j0 j0Var) {
        return super.contains(j0Var);
    }

    public final List f() {
        return g();
    }

    public final m0 h() {
        return k();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return x((j0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return y((j0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j0 get(int i10) {
        return (j0) this.f15941d.get(i10);
    }

    public final String n() {
        return this.f15943f;
    }

    public final Handler o() {
        return this.f15938a;
    }

    public final List p() {
        return this.f15942e;
    }

    public final String r() {
        return this.f15940c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return v();
    }

    public final List u() {
        return this.f15941d;
    }

    public int v() {
        return this.f15941d.size();
    }

    public final int w() {
        return this.f15939b;
    }

    public /* bridge */ int x(j0 j0Var) {
        return super.indexOf(j0Var);
    }

    public /* bridge */ int y(j0 j0Var) {
        return super.lastIndexOf(j0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final /* bridge */ j0 remove(int i10) {
        return B(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof j0) {
            return A((j0) obj);
        }
        return false;
    }

    public n0(j0... requests) {
        kotlin.jvm.internal.s.h(requests, "requests");
        this.f15940c = String.valueOf(Integer.valueOf(f15937h.incrementAndGet()));
        this.f15942e = new ArrayList();
        this.f15941d = new ArrayList(gl.j.e(requests));
    }
}
