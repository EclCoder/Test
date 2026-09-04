package com.inmobi.media;

import android.content.ContentValues;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3359uk extends AbstractC3009h6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3167n9 f27641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3359uk(C3167n9 databaseHelper) {
        super("telemetry", databaseHelper);
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f27641c = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3009h6
    public final Object b(int i10, kotlin.coroutines.jvm.internal.d dVar) {
        C3333tk c3333tk;
        if (dVar instanceof C3333tk) {
            c3333tk = (C3333tk) dVar;
            int i11 = c3333tk.f27573c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3333tk.f27573c = i11 - Integer.MIN_VALUE;
            } else {
                c3333tk = new C3333tk(this, dVar);
            }
        } else {
            c3333tk = new C3333tk(this, dVar);
        }
        Object objA = c3333tk.f27571a;
        Object objF = ll.b.f();
        int i12 = c3333tk.f27573c;
        if (i12 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f27641c;
            c3333tk.f27573c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i10, null), c3333tk);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(objA);
        }
        List<ContentValues> list = (List) objA;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        for (ContentValues contentValues : list) {
            kotlin.jvm.internal.s.h(contentValues, "contentValues");
            String asString = contentValues.getAsString("eventType");
            String asString2 = contentValues.getAsString("payload");
            String asString3 = contentValues.getAsString("eventSource");
            String asString4 = contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS);
            kotlin.jvm.internal.s.g(asString4, UHbHibBvYxKnPE.XODtclMiUuxu);
            long j10 = Long.parseLong(asString4);
            kotlin.jvm.internal.s.e(asString);
            kotlin.jvm.internal.s.e(asString3);
            C3385vk c3385vk = new C3385vk(asString, asString2, asString3);
            c3385vk.f26769c = j10;
            Integer asInteger = contentValues.getAsInteger("id");
            kotlin.jvm.internal.s.g(asInteger, "getAsInteger(...)");
            c3385vk.f26770d = asInteger.intValue();
            arrayList.add(c3385vk);
        }
        return arrayList;
    }
}
