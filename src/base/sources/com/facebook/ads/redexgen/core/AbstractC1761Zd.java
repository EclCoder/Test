package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1761Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC1490Oi A02;
    public C1491Oj A03;
    public C1492Ok A04;
    public InterfaceC1760Zc A05;
    public final C1488Og A06;
    public final C2198gi A07;
    public final VA A08;
    public final InterfaceC1739Yh A09;
    public final InterfaceC1740Yi A0A;
    public final String A0B;
    public final C1468Nm A0C;
    public final InterfaceC1763Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C1492Ok c1492Ok, EnumC1490Oi enumC1490Oi);

    public abstract boolean A0S();

    public AbstractC1761Zd(C2198gi c2198gi, VA va2, String str) {
        this(c2198gi, va2, str, null, null, null);
    }

    public AbstractC1761Zd(C2198gi c2198gi, VA va2, String str, C1468Nm c1468Nm, InterfaceC1740Yi interfaceC1740Yi, InterfaceC1739Yh interfaceC1739Yh) {
        super(c2198gi);
        this.A00 = 0;
        this.A02 = EnumC1490Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c2198gi;
        this.A08 = va2;
        this.A0A = interfaceC1740Yi;
        this.A09 = interfaceC1739Yh;
        this.A0B = str;
        this.A0C = c1468Nm;
        this.A06 = AbstractC1489Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC1761Zd abstractC1761Zd) {
        int i10 = abstractC1761Zd.A00;
        abstractC1761Zd.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A03(AbstractC1761Zd abstractC1761Zd) {
        int i10 = abstractC1761Zd.A00;
        abstractC1761Zd.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C1492Ok c1492Ok) {
        this.A03.A08(this.A02);
        A0Q(c1492Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C1492Ok c1492Ok) {
        this.A04 = c1492Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c1492Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C1491Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC1740Yi interfaceC1740Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC1740Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C1492Ok c1492Ok, EnumC1490Oi enumC1490Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC1760Zc interfaceC1760Zc) {
        this.A05 = interfaceC1760Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
