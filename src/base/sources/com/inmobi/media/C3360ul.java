package com.inmobi.media;

import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import java.io.IOException;

/* JADX INFO: renamed from: com.inmobi.media.ul, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3360ul implements gn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ em.q f27642a;

    public C3360ul(em.q qVar) {
        this.f27642a = qVar;
    }

    @Override // gn.f
    public final void onResponse(gn.e call, gn.f0 response) {
        kotlin.jvm.internal.s.h(call, "call");
        kotlin.jvm.internal.s.h(response, "response");
        T4.a(this.f27642a, response);
    }

    @Override // gn.f
    public final void onFailure(gn.e call, IOException e10) {
        kotlin.jvm.internal.s.h(call, "call");
        kotlin.jvm.internal.s.h(e10, "e");
        em.q qVar = this.f27642a;
        kotlin.jvm.internal.s.h(qVar, "<this>");
        kotlin.jvm.internal.s.h(e10, giNWGaNAgVQoO.rEYOFCgzh);
        if (qVar.L()) {
            try {
                fl.r.a aVar = fl.r.f38769b;
                qVar.resumeWith(fl.r.b(fl.s.a(e10)));
            } catch (IllegalStateException unused) {
            }
        }
    }
}
