package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class j extends c {
    j(Context context, b bVar, d dVar) {
        super(CrashType.JAVA, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(i10, aVar);
        if (i10 == 0) {
            aVarA.a("app_count", (Object) 1);
            aVarA.a("magic_tag", "ss_app_log");
            Header headerA = Header.a(this.f10946b);
            headerA.c();
            aVarA.a(headerA);
            com.apm.insight.a.a(aVarA, headerA, this.f10945a);
            return aVarA;
        }
        if (i10 == 1) {
            Header headerD = aVarA.d();
            headerD.d();
            headerD.e();
            return aVarA;
        }
        if (i10 == 2) {
            Header.a(aVarA.d());
            return aVarA;
        }
        if (i10 != 5) {
            return aVarA;
        }
        Header.b(aVarA.d());
        return aVarA;
    }
}
