package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2480lZ implements InterfaceC1362Jj {
    public static String[] A03 = {"LK8mEMUSnifSCT0YT0fQtLG", "zQWICugnqrmXEq8sMdeIuA9JBPwrta0k", "lKxJonOWK2Axk83UnpUnbJJcLxj", "3DYuz", "CNQNHGpRGAv1E31EB6wcq1FAARNpDgXE", "DpJK", "NUJ585yfBdIWgF7XcRLbZeMVqrhzmgk", "1sPINCYISeoO6PXpnzvAKZkikus6bvvY"};
    public final List<C1384Kf> A00;
    public final long[] A01;
    public final long[] A02;

    public C2480lZ(List<C1384Kf> list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
        this.A01 = new long[list.size() * 2];
        for (int i10 = 0; i10 < cueIndex; i10++) {
            C1384Kf c1384Kf = list.get(i10);
            int i11 = i10 * 2;
            this.A01[i11] = c1384Kf.A01;
            int arrayIndex = i11 + 1;
            this.A01[arrayIndex] = c1384Kf.A00;
        }
        this.A02 = Arrays.copyOf(this.A01, this.A01.length);
        Arrays.sort(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final List<C2708pT> A7X(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            if (this.A01[i10 * 2] <= j10) {
                long j11 = this.A01[(i10 * 2) + 1];
                if (A03[2].length() == 27) {
                    A03[5] = "FOcCQTOovqYXamkXPEg";
                    if (j10 < j11) {
                        C1384Kf c1384Kf = this.A00.get(i10);
                        if (c1384Kf.A02.A01 == -3.4028235E38f) {
                            arrayList2.add(c1384Kf);
                        } else {
                            C2708pT c2708pT = c1384Kf.A02;
                            String[] strArr = A03;
                            if (strArr[6].length() != strArr[0].length()) {
                                String[] strArr2 = A03;
                                strArr2[4] = "KriihMM2RWcrEfyoWolOk5PIi1Nv3YmO";
                                strArr2[1] = "gocQSZMmm3PjEWFg0RBonPYHqyNHFxQo";
                                arrayList.add(c2708pT);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                throw new RuntimeException();
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Kp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((C1384Kf) obj).A01, ((C1384Kf) obj2).A01);
            }
        });
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            arrayList.add(((C1384Kf) arrayList2.get(i11)).A02.A02().A07((-1) - i11, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final long A83(int i10) {
        boolean z10 = true;
        AbstractC09823y.A07(i10 >= 0);
        if (i10 >= this.A02.length) {
            z10 = false;
        }
        AbstractC09823y.A07(z10);
        return this.A02[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A84() {
        return this.A02.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A8a(long j10) {
        int iA0K = C5C.A0K(this.A02, j10, false, false);
        int index = this.A02.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
