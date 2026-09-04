package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeCrashCollector;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class l extends c {
    l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
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
        if (i10 != 1) {
            if (i10 != 2) {
                return aVarA;
            }
            Header.a(aVarA.d());
            return aVarA;
        }
        Header headerD = aVarA.d();
        headerD.d();
        headerD.e();
        return aVarA;
    }

    @Override // com.apm.insight.runtime.a.c
    protected final boolean c() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public final int a() {
        return NativeCrashCollector.a();
    }
}
