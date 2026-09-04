package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1670Vm {
    public final AdErrorType A00;
    public final String A01;

    public C1670Vm(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public C1670Vm(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static C1670Vm A00(AdErrorType adErrorType) {
        return new C1670Vm(adErrorType, (String) null);
    }

    public static C1670Vm A01(AdErrorType adErrorType, String str) {
        return new C1670Vm(adErrorType, str);
    }

    public static C1670Vm A02(C1671Vn c1671Vn) {
        return new C1670Vm(c1671Vn.A00(), c1671Vn.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
