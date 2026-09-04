package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17282a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17283b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17284c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f17285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17286e;

    public i() {
        int[] iArr = new int[16];
        this.f17285d = iArr;
        this.f17286e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f17285d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i10 = this.f17282a;
        int i11 = length2 - i10;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
        System.arraycopy(this.f17285d, 0, iArr2, i11, i10);
        this.f17282a = 0;
        this.f17283b = this.f17284c - 1;
        this.f17285d = iArr2;
        this.f17286e = iArr2.length - 1;
    }

    public void a(int i10) {
        if (this.f17284c == this.f17285d.length) {
            c();
        }
        int i11 = (this.f17283b + 1) & this.f17286e;
        this.f17283b = i11;
        this.f17285d[i11] = i10;
        this.f17284c++;
    }

    public void b() {
        this.f17282a = 0;
        this.f17283b = -1;
        this.f17284c = 0;
    }

    public boolean d() {
        return this.f17284c == 0;
    }

    public int e() {
        int i10 = this.f17284c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f17285d;
        int i11 = this.f17282a;
        int i12 = iArr[i11];
        this.f17282a = (i11 + 1) & this.f17286e;
        this.f17284c = i10 - 1;
        return i12;
    }
}
