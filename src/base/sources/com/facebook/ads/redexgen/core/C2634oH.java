package com.facebook.ads.redexgen.core;

import android.os.Looper;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2634oH implements A6 {
    @Override // com.facebook.ads.redexgen.core.A6
    public final /* synthetic */ A5 AH3(A1 a10, C2758qI c2758qI) {
        return A3.A00(this, a10, c2758qI);
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final /* synthetic */ void AH4() {
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final InterfaceC11249s A3C(A1 a10, C2758qI c2758qI) {
        if (c2758qI.A0O == null) {
            return null;
        }
        return new C2632oF(new C11229q(new C1127Ab(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final int A7W(C2758qI c2758qI) {
        return c2758qI.A0O != null ? 1 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.A6
    public final void AJe(Looper looper, C8O c8o) {
    }
}
