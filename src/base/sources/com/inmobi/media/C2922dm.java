package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.inmobi.media.dm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2922dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f26419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uc f26420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2896cm f26421c;

    public C2922dm(Bl vastBeaconData, C2874c0 adLifecycleData, C3440xn responseBeaconData) {
        int i10;
        int iA;
        kotlin.jvm.internal.s.h(vastBeaconData, "vastBeaconData");
        kotlin.jvm.internal.s.h(adLifecycleData, "adLifecycleData");
        kotlin.jvm.internal.s.h(responseBeaconData, "responseBeaconData");
        this.f26419a = new AtomicInteger(0);
        this.f26420b = new Uc(adLifecycleData, vastBeaconData.f24562a, vastBeaconData.f24563b, 24);
        ArrayList arrayList = vastBeaconData.f24565d;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            De de2 = (De) obj;
            if (!(de2 instanceof S5)) {
                String type = de2.f24653b;
                kotlin.jvm.internal.s.h(type, "type");
                if (!kotlin.jvm.internal.s.c(type, "Impression") && !kotlin.jvm.internal.s.c(type, CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = vastBeaconData.f24565d;
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            if (obj2 instanceof S5) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(gl.r.v(arrayList4, 10));
        int size3 = arrayList4.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList4.get(i13);
            i13++;
            S5 s10 = (S5) obj3;
            int i14 = vastBeaconData.f24564c;
            kotlin.jvm.internal.s.h(s10, "<this>");
            if (bm.r.z(s10.f25672c, "%", false, 2, null)) {
                try {
                    i10 = Integer.parseInt(bm.r.Z0(s10.f25672c, 1));
                } catch (Exception unused) {
                    i10 = 0;
                }
                iA = (i14 * i10) / 100;
            } else {
                iA = AbstractC2844am.a(s10.f25672c);
            }
            arrayList5.add(new Q5(s10.f24652a, iA));
        }
        this.f26421c = new C2896cm(this.f26420b, new C2947em(responseBeaconData, arrayList2, arrayList5));
    }
}
