package org.apache.http.message;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e implements co.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final co.d[] f49386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f49387b = b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f49388c;

    public e(co.d[] dVarArr, String str) {
        this.f49386a = (co.d[]) ip.a.h(dVarArr, "Header array");
        this.f49388c = str;
    }

    protected boolean a(int i10) {
        String str = this.f49388c;
        return str == null || str.equalsIgnoreCase(this.f49386a[i10].getName());
    }

    protected int b(int i10) {
        if (i10 < -1) {
            return -1;
        }
        int length = this.f49386a.length - 1;
        boolean zA = false;
        while (!zA && i10 < length) {
            i10++;
            zA = a(i10);
        }
        if (zA) {
            return i10;
        }
        return -1;
    }

    @Override // co.g, java.util.Iterator
    public boolean hasNext() {
        return this.f49387b >= 0;
    }

    @Override // co.g
    public co.d k() {
        int i10 = this.f49387b;
        if (i10 < 0) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.f49387b = b(i10);
        return this.f49386a[i10];
    }

    @Override // java.util.Iterator
    public final Object next() {
        return k();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Removing headers is not supported.");
    }
}
