package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f33857e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f33858a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f33859b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33860c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f33861d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i10) {
        this.f33861d = i10;
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f33859b.size(); i11++) {
            byte[] bArr = this.f33859b.get(i11);
            if (bArr.length >= i10) {
                this.f33860c -= bArr.length;
                this.f33859b.remove(i11);
                this.f33858a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f33861d) {
                this.f33858a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f33859b, bArr, f33857e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f33859b.add(iBinarySearch, bArr);
                this.f33860c += bArr.length;
                a();
            }
        }
    }

    private synchronized void a() {
        while (this.f33860c > this.f33861d) {
            byte[] bArrRemove = this.f33858a.remove(0);
            this.f33859b.remove(bArrRemove);
            this.f33860c -= bArrRemove.length;
        }
    }
}
