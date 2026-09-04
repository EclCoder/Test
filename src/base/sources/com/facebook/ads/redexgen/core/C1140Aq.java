package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1140Aq implements InterfaceC2810rQ {
    public static byte[] A05;
    public final WeakReference<View> A00;
    public final InterfaceC2814rY A03;
    public final List<Rect> A04 = new ArrayList();
    public final Rect A02 = new Rect();
    public final Rect A01 = new Rect();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-21, -23, -8, -57, -16, -19, -12, -42, -23, -25, -8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A02(List<Rect> list) {
        list.clear();
        this.A04.clear();
        View view = this.A00.get();
        if (view == null || !view.getGlobalVisibleRect(this.A02) || this.A02.isEmpty()) {
            return;
        }
        this.A04.add(this.A02);
        if (0 < this.A03.size()) {
            this.A03.A6i(0);
            throw new NullPointerException(A00(0, 11, 107));
        }
        list.addAll(this.A04);
    }

    public C1140Aq(View view, InterfaceC2814rY interfaceC2814rY) {
        this.A00 = new WeakReference<>(view);
        this.A03 = interfaceC2814rY;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2810rQ
    public final Context A7U() {
        View view = this.A00.get();
        if (view == null) {
            return null;
        }
        return view.getContext();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2810rQ
    public final void A9Z(List<Rect> outList) {
        A02(outList);
    }
}
