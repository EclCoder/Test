package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
public final class C10155f {
    public static byte[] A0A;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public ML A06;
    public String A07;
    public Map<String, String> A08;
    public byte[] A09;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-35, -15, -18, -87, -2, -5, -14, -87, -10, -2, -4, -3, -87, -21, -18, -87, -4, -18, -3, -73};
    }

    public C10155f() {
        this.A01 = 1;
        this.A08 = Collections.emptyMap();
        this.A02 = -1L;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public C10155f(C10185i c10185i) {
        this.A05 = c10185i.A06;
        this.A04 = c10185i.A05;
        this.A01 = c10185i.A01;
        this.A09 = c10185i.A0A;
        this.A08 = c10185i.A09;
        this.A03 = c10185i.A04;
        this.A02 = c10185i.A03;
        this.A07 = c10185i.A08;
        this.A00 = c10185i.A00;
        this.A06 = c10185i.A07;
    }

    public final C10155f A02(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C10155f A03(long j10) {
        this.A02 = j10;
        return this;
    }

    public final C10155f A04(long j10) {
        this.A03 = j10;
        return this;
    }

    public final C10155f A05(long j10) {
        this.A04 = j10;
        return this;
    }

    public final C10155f A06(Uri uri) {
        this.A05 = uri;
        return this;
    }

    @MetaExoPlayerCustomization("Using fbDataSpecExtension instead of Object")
    public final C10155f A07(ML ml2) {
        this.A06 = ml2;
        return this;
    }

    public final C10155f A08(String str) {
        this.A07 = str;
        return this;
    }

    @MetaExoPlayerCustomization("D50990955; Ensure that fbDataSpecExtension is not null")
    public final C10185i A09() {
        ML ml2;
        AbstractC09823y.A03(this.A05, A00(0, 20, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE));
        Uri uri = this.A05;
        long j10 = this.A04;
        int i10 = this.A01;
        byte[] bArr = this.A09;
        Map<String, String> map = this.A08;
        long j11 = this.A03;
        long j12 = this.A02;
        String str = this.A07;
        int i11 = this.A00;
        if (this.A06 != null) {
            ml2 = this.A06;
        } else {
            ml2 = new ML();
        }
        return new C10185i(uri, j10, i10, bArr, map, j11, j12, str, i11, ml2);
    }
}
