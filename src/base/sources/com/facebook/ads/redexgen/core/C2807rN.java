package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2807rN<ModelType, StateType> {
    public static byte[] A0A;
    public static final C2807rN A0B;
    public EnumC2808rO A00;
    public EnumC2799rE A01;
    public String A02;
    public boolean A03;
    public final boolean A04;
    public final C2807rN A05;
    public final ModelType A06;
    public final StateType A07;
    public final String A08;
    public final List<ViewpointAction<ModelType, StateType>> A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A03(InterfaceC2798rD interfaceC2798rD) {
        Iterator<ViewpointAction<ModelType, StateType>> it = this.A09.iterator();
        while (it.hasNext()) {
            it.next().A6R(this, interfaceC2798rD);
        }
        EnumC2799rE enumC2799rEA9U = interfaceC2798rD.A9U(this);
        this.A01 = enumC2799rEA9U;
        if (enumC2799rEA9U == EnumC2799rE.A02) {
            this.A03 = true;
        }
    }

    static {
        A02();
        A0B = new C2807rN(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A0B, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rP != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    public C2807rN(C2809rP<ModelType, StateType> c2809rP) {
        List listEmptyList;
        Object obj = c2809rP.A03;
        Object obj2 = c2809rP.A04;
        String str = c2809rP.A06;
        String str2 = c2809rP.A06;
        if (c2809rP.A01 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = c2809rP.A01;
        }
        this(obj, obj2, str, str2, listEmptyList, c2809rP.A00, c2809rP.A02);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C2807rN(ModelType modeltype, StateType statetype, String str, String str2, List<ViewpointAction<ModelType, StateType>> list, C2807rN c2807rN, boolean z10) {
        this.A00 = EnumC2808rO.A02;
        if (!(modeltype instanceof View)) {
            this.A06 = modeltype;
            this.A07 = statetype;
            this.A08 = str;
            this.A02 = str2;
            this.A05 = c2807rN;
            this.A03 = false;
            this.A09 = list;
            this.A04 = z10;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C2809rP<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C2809rP<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A03;
    }
}
