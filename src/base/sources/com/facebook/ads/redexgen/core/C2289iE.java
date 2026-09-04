package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Parcelable;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2289iE {
    public static byte[] A03;
    public final C1487Of A00;
    public final InterfaceC2083er A01;
    public final List<C2288iD> A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C2289iE(List<AbstractC1485Od> list, Bundle bundle, InterfaceC2083er interfaceC2083er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC2083er;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.A02.add(new C2288iD(list.get(i10), (Bundle) parcelableArrayList.get(i10)));
        }
        this.A00 = (C1487Of) AbstractC1720Xo.A00(bundle.getByteArray(A00(0, 10, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE)));
    }

    public C2289iE(List<AbstractC1485Od> list, InterfaceC2083er interfaceC2083er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC2083er;
        Iterator<AbstractC1485Od> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C2288iD(it.next()));
        }
        this.A00 = new C1487Of();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), AbstractC1720Xo.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C2288iD> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C1487Of A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C2288iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d10, double d11) {
        if (d11 >= 0.0d) {
            this.A00.A05(d10, d11);
        }
        double dA9V = this.A01.A9V();
        this.A00.A04(d10, dA9V);
        Iterator<C2288iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d10, dA9V);
        }
    }
}
