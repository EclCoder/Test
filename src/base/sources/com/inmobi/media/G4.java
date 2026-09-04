package com.inmobi.media;

import android.content.ContentValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class G4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3167n9 f24838a;

    public G4(C3167n9 databaseHelper) {
        kotlin.jvm.internal.s.h(databaseHelper, "databaseHelper");
        this.f24838a = databaseHelper;
    }

    public final Object a(int i10, long j10, N4 n10) {
        Object objA = this.f24838a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j10 + " ORDER BY timestamp DESC LIMIT " + i10 + ") foo);", n10);
        return objA == ll.b.f() ? objA : fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kotlin.coroutines.jvm.internal.d dVar) {
        E4 e10;
        if (dVar instanceof E4) {
            e10 = (E4) dVar;
            int i10 = e10.f24696c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e10.f24696c = i10 - Integer.MIN_VALUE;
            } else {
                e10 = new E4(this, dVar);
            }
        } else {
            e10 = new E4(this, dVar);
        }
        Object objA = e10.f24694a;
        Object objF = ll.b.f();
        int i11 = e10.f24696c;
        if (i11 == 0) {
            fl.s.b(objA);
            C3167n9 c3167n9 = this.f24838a;
            e10.f24696c = 1;
            c3167n9.getClass();
            objA = c3167n9.a(new C3063j9(c3167n9, "SELECT * FROM c_data", null), e10);
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
            kotlin.jvm.internal.s.h(contentValues, "<this>");
            String asString = contentValues.getAsString("e_data");
            kotlin.jvm.internal.s.g(asString, "getAsString(...)");
            Long asLong = contentValues.getAsLong(CampaignEx.JSON_KEY_TIMESTAMP);
            kotlin.jvm.internal.s.g(asLong, "getAsLong(...)");
            arrayList.add(new C2828a6(asString, asLong.longValue()));
        }
        return arrayList;
    }
}
