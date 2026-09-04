package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10727k extends AbstractC2333j0 {
    public static byte[] A03;
    public long A00;
    public View A01;
    public AnonymousClass76 A02;

    static {
        A05();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{20, 23, 38, -15, -16, -3, -3, -12, 1, -18, 1, -12, -11, 1, -12, 2, -9, -18, 3, -8, -4, -12, -5, 0, -7, 1, 6, -9, 8, -7, 10, -7, 5, 11, 38, 55, 27, 40, 40, 37, 40, -42, 45, 30, 31, 34, 27, -42, 38, 23, 40, 41, 31, 36, 29, -42, 25, 30, 23, 31, 36, 27, 26, -42, 23, 26, 41, -42, -8, 23, 36, 36, 27, 40};
    }

    public C10727k(AnonymousClass76 anonymousClass76, O7 o10) {
        super(anonymousClass76, o10);
        this.A00 = 10000L;
        this.A02 = anonymousClass76;
    }

    private C2336j3 A01(Runnable runnable) {
        return new C2336j3(this, runnable);
    }

    private List<JSONObject> A04(O8 o10) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA03 = o10.A03();
        String strA03 = A03(22, 12, 71);
        if (jSONObjectA03.has(strA03)) {
            try {
                this.A00 = jSONObjectA03.getJSONObject(strA03).optInt(A03(3, 19, 62), 10000);
                JSONArray adsArray = jSONObjectA03.getJSONArray(A03(0, 3, 98));
                if (adsArray.length() > 0) {
                    for (int i10 = 0; i10 < adsArray.length(); i10++) {
                        arrayList.add((JSONObject) adsArray.get(i10));
                    }
                }
            } catch (JSONException unused) {
                String strA04 = A03(36, 38, 101);
                this.A02.A0F().A5g(C1670Vm.A01(AdErrorType.UNKNOWN_ERROR, strA04).A03().getErrorCode(), strA04);
                return arrayList;
            }
        } else {
            arrayList.add(jSONObjectA03);
        }
        return arrayList;
    }

    private void A06(InterfaceC2394k8 interfaceC2394k8, JSONObject jSONObject, C1630Tx c1630Tx) {
        this.A0C = false;
        C2335j2 c2335j2 = new C2335j2(this, interfaceC2394k8, AbstractC1709Xd.A02(jSONObject, A03(34, 2, Sdk$SDKError.b.ASSET_WRITE_ERROR_VALUE)));
        A0H().postDelayed(c2335j2, c1630Tx.A05());
        interfaceC2394k8.AAt(this.A02, this.A09, this.A08.A08, A01(c2335j2), jSONObject, c1630Tx);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0P() {
        if (this.A01 != null) {
            this.A02.A0F().A4e();
            this.A07.A0E(this.A01);
        } else {
            this.A02.A0F().A4f();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0R(N1 n10, C1629Tw c1629Tw, C1627Tu c1627Tu, final O8 o10) {
        this.A02.A0F().A4Y();
        final InterfaceC2394k8 interfaceC2394k8 = (InterfaceC2394k8) n10;
        if (interfaceC2394k8.AKL()) {
            final List<JSONObject> listA04 = A04(o10);
            A06(interfaceC2394k8, listA04.get(0), o10.A01());
            if (listA04.size() > 1) {
                A0H().postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.O9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A02.A0a(interfaceC2394k8, listA04, o10);
                    }
                }, this.A00);
                return;
            }
            return;
        }
        A06(interfaceC2394k8, o10.A03(), o10.A01());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0U(String str) {
        this.A02.A0F().A4d(str != null);
        super.A0U(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0Y(boolean z10) {
        super.A0Y(z10);
        this.A01 = null;
    }

    public final /* synthetic */ void A0a(InterfaceC2394k8 interfaceC2394k8, List list, O8 o10) {
        A06(interfaceC2394k8, (JSONObject) list.get(1), o10.A01());
    }
}
