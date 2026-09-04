package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f10954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<CrashType, c> f10956c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f10957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f10958e;

    /* JADX INFO: renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10959a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f10959a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10959a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10959a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10959a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10959a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10959a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10959a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10959a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(Context context) {
        this.f10955b = context;
        try {
            this.f10957d = b.d();
            this.f10958e = new d(this.f10955b);
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
        }
    }

    public static f a() {
        if (f10954a == null) {
            Context contextG = com.apm.insight.e.g();
            if (contextG == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f10954a = new f(contextG);
        }
        return f10954a;
    }

    private c a(CrashType crashType) {
        c jVar = this.f10956c.get(crashType);
        if (jVar != null) {
            return jVar;
        }
        switch (AnonymousClass1.f10959a[crashType.ordinal()]) {
            case 1:
                jVar = new j(this.f10955b, this.f10957d, this.f10958e);
                break;
            case 2:
                jVar = new k(this.f10955b, this.f10957d, this.f10958e);
                break;
            case 3:
                jVar = new l(this.f10955b, this.f10957d, this.f10958e);
                break;
            case 4:
                jVar = new a(this.f10955b, this.f10957d, this.f10958e);
                break;
            case 5:
                jVar = new h(this.f10955b, this.f10957d, this.f10958e);
                break;
            case 6:
                jVar = new g(this.f10955b, this.f10957d, this.f10958e);
                break;
            case 7:
                jVar = new e(this.f10955b, this.f10957d, this.f10958e);
                break;
            case 8:
                jVar = new i(this.f10955b, this.f10957d, this.f10958e);
                break;
        }
        if (jVar != null) {
            this.f10956c.put(crashType, jVar);
        }
        return jVar;
    }

    public final com.apm.insight.entity.a a(CrashType crashType, c.a aVar) {
        c cVarA;
        if (crashType == null || (cVarA = a(crashType)) == null) {
            return null;
        }
        return cVarA.a(null, aVar, true);
    }

    public final com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c cVarA;
        return (crashType == null || (cVarA = a(crashType)) == null) ? aVar : cVarA.a(aVar, null, false);
    }

    public final com.apm.insight.entity.a a(List<com.apm.insight.entity.a> list, JSONArray jSONArray) {
        if (list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        JSONArray jSONArray2 = new JSONArray();
        Iterator<com.apm.insight.entity.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next().c());
        }
        aVar.a(DataSchemeDataSource.SCHEME_DATA, (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header headerA = Header.a(this.f10955b);
        Header.a(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        Header.b(headerA);
        aVar.a(headerA);
        return aVar;
    }
}
