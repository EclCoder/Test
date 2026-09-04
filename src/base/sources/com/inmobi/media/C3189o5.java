package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.inmobi.media.o5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3189o5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f27117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f27119d;

    public C3189o5(Context context, ArrayList tableInfos, int i10, ExecutorService executorService) {
        kotlin.jvm.internal.s.h("com.im_11.2.0.db", "name");
        kotlin.jvm.internal.s.h(tableInfos, "tableInfos");
        this.f27116a = context;
        this.f27117b = tableInfos;
        this.f27118c = i10;
        this.f27119d = executorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3189o5)) {
            return false;
        }
        C3189o5 c3189o5 = (C3189o5) obj;
        return kotlin.jvm.internal.s.c(this.f27116a, c3189o5.f27116a) && kotlin.jvm.internal.s.c("com.im_11.2.0.db", "com.im_11.2.0.db") && kotlin.jvm.internal.s.c(this.f27117b, c3189o5.f27117b) && this.f27118c == c3189o5.f27118c && kotlin.jvm.internal.s.c(this.f27119d, c3189o5.f27119d);
    }

    public final int hashCode() {
        Context context = this.f27116a;
        int iA = AbstractC3305si.a(this.f27118c, (this.f27117b.hashCode() + AbstractC3305si.a(1, (((context == null ? 0 : context.hashCode()) * 31) - 1987683144) * 31, 31)) * 31, 31);
        ExecutorService executorService = this.f27119d;
        return iA + (executorService != null ? executorService.hashCode() : 0);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.f27116a + ", name=com.im_11.2.0.db, version=1, tableInfos=" + this.f27117b + ", journalMode=" + this.f27118c + ", transactionExecutor=" + this.f27119d + ")";
    }
}
