package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2273hw implements QD {
    public final /* synthetic */ C7Q A00;
    public final /* synthetic */ Q8 A01;

    public C2273hw(C7Q c7q, Q8 q10) {
        this.A00 = c7q;
        this.A01 = q10;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final Object A5G(int i10) {
        Q6 compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final List<Object> A6Y(String str, int i10) {
        List<Q6> listA03 = this.A01.A03(str, i10);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(listA03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final Object A6Z(int i10) {
        Q6 compatInfo = this.A01.A01(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.QD
    public final boolean AGv(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
