package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class RunnableC1666Vh implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ T8 A00;
    public final /* synthetic */ C1669Vk A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC1666Vh(C1669Vk c1669Vk, String str, T8 t10) {
        this.A01 = c1669Vk;
        this.A02 = str;
        this.A00 = t10;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<C1668Vj> arrayList;
        if (WU.A02(this)) {
            return;
        }
        try {
            C1611Te nvl = new C1611Te(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            for (C1668Vj c1668Vj : arrayList) {
                jSONArray.put(A00(0, 0, 23) + c1668Vj.A00 + ';' + c1668Vj.A02 + ';' + c1668Vj.A01);
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().ABD(A00(10, 9, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE_VALUE), AbstractC1610Td.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }
}
