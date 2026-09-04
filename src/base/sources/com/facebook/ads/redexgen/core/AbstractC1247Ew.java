package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1247Ew {
    public InterfaceC1246Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C1248Ex A0b(InterfaceC10777p[] interfaceC10777pArr, C2588nW c2588nW, C2606no c2606no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC09823y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC1246Ev interfaceC1246Ev, F6 f10) {
        this.A00 = interfaceC1246Ev;
        this.A01 = f10;
    }
}
