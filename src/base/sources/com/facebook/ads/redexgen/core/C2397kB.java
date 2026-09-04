package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2397kB extends AbstractRunnableC1685Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C2397kB(N8 n10, String str) {
        this.A00 = n10;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                try {
                    Iterator<String> itKeys = this.A00.A02.A05().keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.A00.A0J(this.A01)) {
                            this.A00.A0E((C1461Nf) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                        }
                    }
                    this.A00.A02.A06();
                    this.A00.A08();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (InterruptedException e10) {
            InterfaceC1609Tc interfaceC1609TcA08 = this.A00.A03.A08();
            String encryptedId = A00(0, 17, 22);
            interfaceC1609TcA08.ABC(encryptedId, AbstractC1610Td.A1B, new C1611Te(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            InterfaceC1609Tc interfaceC1609TcA09 = this.A00.A03.A08();
            String encryptedId2 = A00(0, 17, 22);
            interfaceC1609TcA09.ABC(encryptedId2, AbstractC1610Td.A1A, new C1611Te(e11));
        }
    }
}
