package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC09693l {
    public final C11259y A00;
    public final C2636oJ A01;
    public final InterfaceC09683k[] A02;

    public A4(InterfaceC09683k... interfaceC09683kArr) {
        this(interfaceC09683kArr, new C11259y(), new C2636oJ());
    }

    public A4(InterfaceC09683k[] interfaceC09683kArr, C11259y c11259y, C2636oJ c2636oJ) {
        this.A02 = new InterfaceC09683k[interfaceC09683kArr.length + 2];
        System.arraycopy(interfaceC09683kArr, 0, this.A02, 0, interfaceC09683kArr.length);
        this.A00 = c11259y;
        this.A01 = c2636oJ;
        this.A02[interfaceC09683kArr.length] = c11259y;
        this.A02[interfaceC09683kArr.length + 1] = c2636oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09693l
    public final C2737px A4F(C2737px c2737px) {
        this.A01.A02(c2737px.A01);
        this.A01.A01(c2737px.A00);
        return c2737px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09693l
    public final boolean A4G(boolean z10) {
        this.A00.A0D(z10);
        return z10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09693l
    public final InterfaceC09683k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09693l
    public final long A8U(long j10) {
        return this.A01.A00(j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09693l
    public final long A98() {
        return this.A00.A0C();
    }
}
