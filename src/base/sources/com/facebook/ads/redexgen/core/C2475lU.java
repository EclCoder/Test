package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2475lU implements H9 {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final HD A04 = new HD() { // from class: com.facebook.ads.redexgen.X.lV
        @Override // com.facebook.ads.redexgen.core.HD
        public final H9[] A5N() {
            return C2475lU.A00();
        }

        @Override // com.facebook.ads.redexgen.core.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C2474lT A02 = new C2474lT();
    public final C10054v A01 = new C10054v(16384);

    public static /* synthetic */ H9[] A00() {
        return new H9[]{new C2475lU()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(HA ha2) {
        this.A02.A5c(ha2, new LG(0, 1));
        ha2.A6O();
        ha2.AJ7(new C2544mn(C.TIME_UNSET));
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(InterfaceC2549ms interfaceC2549ms, HV hv) throws IOException {
        int i10 = interfaceC2549ms.read(this.A01.A0l(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i10);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j10, long j11) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(InterfaceC2549ms interfaceC2549ms) throws IOException {
        C10054v c10054v = new C10054v(10);
        int length = 0;
        while (true) {
            byte[] bArrA0l = c10054v.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC2549ms.AGt(bArrA0l, 0, 10);
            c10054v.A0f(0);
            if (c10054v.A0K() != 4801587) {
                interfaceC2549ms.AIl();
                interfaceC2549ms.A47(length);
                int i10 = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC2549ms.AGt(c10054v.A0l(), 0, 7);
                    c10054v.A0f(0);
                    int headerPosition = c10054v.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC2549ms.AIl();
                        i10++;
                        if (i10 - length >= 8192) {
                            return false;
                        }
                        interfaceC2549ms.A47(i10);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = AbstractC1296Gu.A02(c10054v.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC2549ms.A47(headerPosition2 - 7);
                    }
                }
            } else {
                c10054v.A0g(3);
                int iA0H = c10054v.A0H();
                length += iA0H + 10;
                interfaceC2549ms.A47(iA0H);
            }
        }
    }
}
