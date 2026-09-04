package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class k extends c {
    k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public final com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a aVarA = super.a(i10, aVar);
        if (i10 == 0) {
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
            try {
                aVarA.d().f().put("launch_did", com.apm.insight.i.a.a(this.f10946b));
            } catch (Throwable unused) {
            }
        } else if (i10 == 5) {
            Header.b(aVarA.d());
            return aVarA;
        }
        return aVarA;
    }
}
