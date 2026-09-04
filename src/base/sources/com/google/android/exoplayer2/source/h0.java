package com.google.android.exoplayer2.source;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.h f17668c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f17667b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17666a = -1;

    public h0(ob.h hVar) {
        this.f17668c = hVar;
    }

    public void a(int i10, Object obj) {
        if (this.f17666a == -1) {
            ob.a.g(this.f17667b.size() == 0);
            this.f17666a = 0;
        }
        if (this.f17667b.size() > 0) {
            SparseArray sparseArray = this.f17667b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            ob.a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                ob.h hVar = this.f17668c;
                SparseArray sparseArray2 = this.f17667b;
                hVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f17667b.append(i10, obj);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f17667b.size(); i10++) {
            this.f17668c.accept(this.f17667b.valueAt(i10));
        }
        this.f17666a = -1;
        this.f17667b.clear();
    }

    public void c(int i10) {
        for (int size = this.f17667b.size() - 1; size >= 0 && i10 < this.f17667b.keyAt(size); size--) {
            this.f17668c.accept(this.f17667b.valueAt(size));
            this.f17667b.removeAt(size);
        }
        this.f17666a = this.f17667b.size() > 0 ? Math.min(this.f17666a, this.f17667b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f17667b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f17667b.keyAt(i12)) {
                return;
            }
            this.f17668c.accept(this.f17667b.valueAt(i11));
            this.f17667b.removeAt(i11);
            int i13 = this.f17666a;
            if (i13 > 0) {
                this.f17666a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public Object e(int i10) {
        if (this.f17666a == -1) {
            this.f17666a = 0;
        }
        while (true) {
            int i11 = this.f17666a;
            if (i11 <= 0 || i10 >= this.f17667b.keyAt(i11)) {
                break;
            }
            this.f17666a--;
        }
        while (this.f17666a < this.f17667b.size() - 1 && i10 >= this.f17667b.keyAt(this.f17666a + 1)) {
            this.f17666a++;
        }
        return this.f17667b.valueAt(this.f17666a);
    }

    public Object f() {
        SparseArray sparseArray = this.f17667b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f17667b.size() == 0;
    }
}
