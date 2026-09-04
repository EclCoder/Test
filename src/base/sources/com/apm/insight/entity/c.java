package com.apm.insight.entity;

import com.apm.insight.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10667a;

    private c(String str) {
        this.f10667a = str;
    }

    public static c a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z10, String str4, String str5) {
        c cVar = new c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.a("event_type", (Object) "exception");
        cVar.a("log_type", (Object) str5);
        cVar.a(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        cVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        cVar.a("class_ref", (Object) className);
        cVar.a("method", (Object) methodName);
        cVar.a("line_num", Integer.valueOf(lineNumber));
        cVar.a("stack", (Object) str);
        cVar.a("exception_type", (Object) 1);
        cVar.a("ensure_type", (Object) str4);
        cVar.a("is_core", Integer.valueOf(z10 ? 1 : 0));
        cVar.a(PglCryptUtils.KEY_MESSAGE, (Object) str2);
        e.g();
        cVar.a("process_name", (Object) com.apm.insight.l.a.b());
        cVar.a("crash_thread_name", (Object) str3);
        d.b(cVar.c());
        return cVar;
    }
}
