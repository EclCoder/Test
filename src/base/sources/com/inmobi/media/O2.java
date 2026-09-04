package com.inmobi.media;

import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoWcdma;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f25380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25382c;

    public O2() {
    }

    public static String a(String mcc, int i10, int i11, int i12) {
        kotlin.jvm.internal.s.h(mcc, "mcc");
        return mcc + "#" + i10 + "#" + i11 + "#" + i12;
    }

    public O2(CellInfo cellInfo, String mcc, String mnc, int i10) {
        kotlin.jvm.internal.s.h(mcc, "mcc");
        kotlin.jvm.internal.s.h(mnc, "mnc");
        if (cellInfo instanceof CellInfoGsm) {
            this.f25382c = i10;
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            this.f25381b = cellInfoGsm.getCellSignalStrength().getDbm();
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            kotlin.jvm.internal.s.g(cellIdentity, "getCellIdentity(...)");
            this.f25380a = a(mcc, mnc, cellIdentity.getLac(), cellIdentity.getCid(), -1, Integer.MAX_VALUE);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.f25382c = i10;
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            this.f25381b = cellInfoCdma.getCellSignalStrength().getDbm();
            CellIdentityCdma cellIdentity2 = cellInfoCdma.getCellIdentity();
            kotlin.jvm.internal.s.g(cellIdentity2, "getCellIdentity(...)");
            this.f25380a = a(mcc, cellIdentity2.getSystemId(), cellIdentity2.getNetworkId(), cellIdentity2.getBasestationId());
            return;
        }
        if (cellInfo instanceof CellInfoWcdma) {
            this.f25382c = i10;
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            this.f25381b = cellInfoWcdma.getCellSignalStrength().getDbm();
            CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
            kotlin.jvm.internal.s.g(cellIdentity3, "getCellIdentity(...)");
            this.f25380a = a(mcc, mnc, cellIdentity3.getLac(), cellIdentity3.getCid(), cellIdentity3.getPsc(), Integer.MAX_VALUE);
        }
    }

    public static String a(String mcc, String mnc, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.h(mcc, "mcc");
        kotlin.jvm.internal.s.h(mnc, "mnc");
        return mcc + "#" + mnc + "#" + i10 + "#" + i11 + "#" + (i12 == -1 ? "" : Integer.valueOf(i12)) + "#" + (i13 != Integer.MAX_VALUE ? Integer.valueOf(i13) : "");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f25380a);
            int i10 = this.f25381b;
            if (i10 != Integer.MAX_VALUE) {
                jSONObject.put("ss", i10);
            }
            jSONObject.put("nt", this.f25382c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
