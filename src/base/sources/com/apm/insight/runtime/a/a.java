package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class a extends c {
    a(Context context, b bVar, d dVar) {
        super(CrashType.ANR, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(aVar);
        Header headerA = Header.a(this.f10946b);
        Header.a(headerA);
        Header.b(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        aVarA.a(headerA);
        aVarA.a("process_name", (Object) com.apm.insight.l.a.b());
        com.apm.insight.a.a(aVarA, headerA, this.f10945a);
        return aVarA;
    }
}
