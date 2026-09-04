package com.facebook.ads.redexgen.core;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2436kq implements InterfaceC1416Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C2436kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1416Ll
    public final void AGj(int i10) throws C2433kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1416Ll
    public final void close() throws C2433kn {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1416Ll
    public final int length() throws C2433kn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1416Ll
    public final int read(byte[] bArr) throws C2433kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
