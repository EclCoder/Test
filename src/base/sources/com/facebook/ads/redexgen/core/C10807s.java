package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10807s {
    public static final C10807s A01 = new C10807s(false);
    public final boolean A00;

    public C10807s(boolean z10) {
        this.A00 = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C10807s) obj).A00;
    }

    public final int hashCode() {
        return !this.A00 ? 1 : 0;
    }
}
