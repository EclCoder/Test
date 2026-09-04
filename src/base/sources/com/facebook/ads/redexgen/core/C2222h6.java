package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2222h6 implements InterfaceC1596Sp {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C2380ju> A00;
    public final /* synthetic */ C2221h5 A01;

    public C2222h6(C2221h5 c2221h5, List<C2380ju> list) {
        this.A01 = c2221h5;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A01.A05(true);
        this.A01.A01.A02();
        this.A01.A01.A03(0);
        Iterator<C2380ju> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (zHasNext) {
                UK uk2 = new UK(this.A01.A02, it.next(), null, UK.A0K(), this.A01.A01.A01());
                if (uk2.A12() != null && uk2.A12().A0F() != null) {
                    ((AbstractC2328iv) uk2.A12().A0F()).A00(uk2);
                }
                this.A01.A01.A04(new NativeAd(this.A01.A02, uk2, this.A01.A00));
            } else {
                WT.A00(new C2223h7(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1596Sp
    public final void ADL() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1596Sp
    public final void ADT() {
        A00();
    }
}
