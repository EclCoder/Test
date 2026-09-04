package com.inmobi.media;

import android.content.ContentValues;
import com.google.android.gms.measurement.AppMeasurement;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class U9 extends AbstractC3009h6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3167n9 f25816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9(C3167n9 databaseHelper) {
        super(AppMeasurement.CRASH_ORIGIN, databaseHelper);
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f25816c = databaseHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3009h6
    public final Object b(int i10, kotlin.coroutines.jvm.internal.d dVar) {
        T9 t10;
        if (dVar instanceof T9) {
            t10 = (T9) dVar;
            int i11 = t10.f25744c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t10.f25744c = i11 - Integer.MIN_VALUE;
            } else {
                t10 = new T9(this, dVar);
            }
        } else {
            t10 = new T9(this, dVar);
        }
        Object objA = t10.f25742a;
        Object objF = ll.b.f();
        int i12 = t10.f25744c;
        if (i12 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f25816c;
            t10.f25744c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i10, null), t10);
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
            String asString = contentValues.getAsString("eventId");
            String asString2 = contentValues.getAsString("eventType");
            String asString3 = contentValues.getAsString("componentType");
            String asString4 = contentValues.getAsString("payload");
            String asString5 = contentValues.getAsString(CampaignEx.JSON_KEY_ST_TS);
            kotlin.jvm.internal.s.g(asString5, "getAsString(...)");
            long j10 = Long.parseLong(asString5);
            kotlin.jvm.internal.s.e(asString);
            kotlin.jvm.internal.s.e(asString3);
            kotlin.jvm.internal.s.e(asString2);
            X9 x10 = new X9(asString, asString3, asString2, asString4);
            x10.f26769c = j10;
            Integer asInteger = contentValues.getAsInteger("id");
            kotlin.jvm.internal.s.g(asInteger, "getAsInteger(...)");
            x10.f26770d = asInteger.intValue();
            arrayList.add(x10);
        }
        return arrayList;
    }
}
