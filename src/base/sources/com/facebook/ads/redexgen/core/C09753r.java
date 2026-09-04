package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C09753r extends E2 {
    public static byte[] A01;
    public final /* synthetic */ C09743q A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -43, -60, -55, -49};
    }

    public C09753r(C09743q c09743q) {
        this.A00 = c09743q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(E3 e10) {
        if (this.A00.A00 == null || this.A00.A00.get() == null) {
            this.A00.A00 = new WeakReference(new C2098f6(this));
        }
        ((AudioManager) this.A00.getContext().getApplicationContext().getSystemService(A00(0, 5, 71))).requestAudioFocus((AudioManager.OnAudioFocusChangeListener) this.A00.A00.get(), 3, 1);
    }
}
