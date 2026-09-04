package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC2667oo, InterfaceC10777p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C10807s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C2758qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC2324ir A0B = EnumC2324ir.A09;
    public final C10616z A0D = new C10616z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j10, boolean z10) throws AD;

    public abstract void A1c(C2758qI[] c2758qIArr, long j10, long j11) throws AD;

    public AE(int i10) {
        this.A0C = i10;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j10, boolean z10) throws AD {
        this.A08 = false;
        this.A02 = j10;
        this.A03 = j10;
        A1a(j10, z10);
    }

    public final int A1Q(long j10) {
        return ((DT) AbstractC09823y.A01(this.A07)).AK2(j10 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C10616z c10616z, C2679p0 c2679p0, int i10) {
        int iAHP = ((DT) AbstractC09823y.A01(this.A07)).AHP(c10616z, c2679p0, i10);
        if (iAHP == -4) {
            if (c2679p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2679p0.A00 = c2679p0.A01;
            c2679p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c2679p0.A01);
        } else if (iAHP == -5) {
            C2758qI c2758qI = (C2758qI) AbstractC09823y.A01(c10616z.A00);
            if (c2758qI.A0M != Long.MAX_VALUE) {
                c10616z.A00 = c2758qI.A07().A0s(c2758qI.A0M + this.A04).A14();
            }
        }
        return iAHP;
    }

    public final AD A1S(Throwable th2, C2758qI c2758qI, int i10) {
        return A1T(th2, c2758qI, false, i10);
    }

    public final AD A1T(Throwable th2, C2758qI c2758qI, boolean z10, int i10) {
        int iA03 = 4;
        if (c2758qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c2758qI);
                iA03 = AbstractC10707i.A03(formatSupport);
            } catch (AD unused) {
            } finally {
                this.A09 = false;
            }
        }
        return AD.A04(th2, getName(), A1O(), c2758qI, iA03, z10, i10);
    }

    public final C10616z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C10807s A1V() {
        return (C10807s) AbstractC09823y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC09823y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z10, boolean z11) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC09823y.A01(this.A07)).AAe();
    }

    public final C2758qI[] A1e() {
        return (C2758qI[]) AbstractC09823y.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void A5x() {
        AbstractC09823y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void A6L(C10807s c10807s, C2758qI[] c2758qIArr, DT dt, long j10, boolean z10, boolean z11, long j11, long j12) throws AD {
        AbstractC09823y.A08(this.A01 == 0);
        this.A05 = c10807s;
        this.A01 = 1;
        A1b(z10, z11);
        AIa(c2758qIArr, dt, j11, j12);
        A1P(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final InterfaceC10777p A7D() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC2324ir A99() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo, com.facebook.ads.redexgen.core.InterfaceC10777p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10647c
    public void A9i(int i10, Object obj) throws AD {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void AA9(int i10, C8O c8o) {
        this.A00 = i10;
        this.A06 = c8o;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void ACU() throws IOException {
        ((DT) AbstractC09823y.A01(this.A07)).ACR();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void AIa(C2758qI[] c2758qIArr, DT dt, long j10, long j11) throws AD {
        AbstractC09823y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j10;
        }
        this.A0A = c2758qIArr;
        this.A04 = j11;
        A1c(c2758qIArr, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void AIm(long j10) throws AD {
        A1P(j10, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void start() throws AD {
        AbstractC09823y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2667oo
    public final void stop() {
        AbstractC09823y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
