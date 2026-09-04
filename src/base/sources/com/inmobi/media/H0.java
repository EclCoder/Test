package com.inmobi.media;

import android.content.ContentValues;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.inmobi.adquality.models.AdQualityResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3167n9 f24905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f24906b;

    public H0(C3167n9 databaseHelper) {
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f24905a = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(AdQualityResult adQualityResult, kotlin.coroutines.jvm.internal.d dVar) {
        G0 g10;
        C3467z0 c3467z0;
        if (dVar instanceof G0) {
            g10 = (G0) dVar;
            int i10 = g10.f24827c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g10.f24827c = i10 - Integer.MIN_VALUE;
            } else {
                g10 = new G0(this, dVar);
            }
        } else {
            g10 = new G0(this, dVar);
        }
        Object obj = g10.f24825a;
        Object objF = ll.b.f();
        int i11 = g10.f24827c;
        if (i11 == 0) {
            fl.s.b(obj);
            C3167n9 c3167n9 = this.f24905a;
            kotlin.jvm.internal.s.h(adQualityResult, "<this>");
            ContentValues contentValues = new ContentValues();
            contentValues.put("image_location", adQualityResult.getImageLocation());
            String sdkModelResult = adQualityResult.getSdkModelResult();
            if (sdkModelResult == null) {
                sdkModelResult = "";
            }
            contentValues.put("sdk_model_result", sdkModelResult);
            contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
            contentValues.put("extras", adQualityResult.getExtras());
            g10.f24827c = 1;
            if (c3167n9.a("ad_quality_db", contentValues, 4, g10) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        WeakReference weakReference = this.f24906b;
        if (weakReference != null && (c3467z0 = (C3467z0) weakReference.get()) != null && c3467z0.f27966a.f24426b.get()) {
            c3467z0.f27966a.f24426b.set(false);
            c3467z0.f27966a.a();
        }
        return fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        F0 f10;
        if (dVar instanceof F0) {
            f10 = (F0) dVar;
            int i10 = f10.f24745c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f10.f24745c = i10 - Integer.MIN_VALUE;
            } else {
                f10 = new F0(this, dVar);
            }
        } else {
            f10 = new F0(this, dVar);
        }
        Object objA = f10.f24743a;
        Object objF = ll.b.f();
        int i11 = f10.f24745c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f24905a;
            f10.f24745c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM ad_quality_db", null), f10);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        Iterable<ContentValues> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(iterable, 10));
        for (ContentValues contentValues : iterable) {
            kotlin.jvm.internal.s.h(contentValues, qEagQqzJZsd.paDJg);
            String asString = contentValues.getAsString("image_location");
            kotlin.jvm.internal.s.g(asString, "getAsString(...)");
            String asString2 = contentValues.getAsString("sdk_model_result");
            String asString3 = contentValues.getAsString("beacon_url");
            kotlin.jvm.internal.s.g(asString3, "getAsString(...)");
            arrayList.add(new AdQualityResult(asString, asString2, asString3, contentValues.getAsString("extras")));
        }
        return arrayList;
    }
}
