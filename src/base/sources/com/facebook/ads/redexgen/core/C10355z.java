package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10355z {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public byte[] A04;
    public byte[] A05;
    public int[] A06;
    public int[] A07;
    public final MediaCodec.CryptoInfo A08 = new MediaCodec.CryptoInfo();
    public final C10345y A09;

    public C10355z() {
        this.A09 = C5C.A02 >= 24 ? new C10345y(this.A08) : null;
    }

    public final MediaCodec.CryptoInfo A00() {
        return this.A08;
    }

    public final void A01(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.A06 == null) {
            this.A06 = new int[1];
            this.A08.numBytesOfClearData = this.A06;
        }
        int[] iArr = this.A06;
        iArr[0] = iArr[0] + i10;
    }

    public final void A02(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.A03 = i10;
        this.A06 = iArr;
        this.A07 = iArr2;
        this.A05 = bArr;
        this.A04 = bArr2;
        this.A02 = i11;
        this.A01 = i12;
        this.A00 = i13;
        this.A08.numSubSamples = i10;
        this.A08.numBytesOfClearData = iArr;
        this.A08.numBytesOfEncryptedData = iArr2;
        this.A08.key = bArr;
        this.A08.iv = bArr2;
        this.A08.mode = i11;
        if (C5C.A02 >= 24) {
            ((C10345y) AbstractC09823y.A01(this.A09)).A00(i12, i13);
        }
    }
}
