package rm;

import bm.r;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.google.api.client.auth.openidconnect.SMoW.mDXVAtwcaFMHJ;
import fl.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tm.n2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static final f b(String serialName, e kind) {
        s.h(serialName, "serialName");
        s.h(kind, "kind");
        if (r.h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return n2.a(serialName, kind);
    }

    public static final f c(String serialName, f[] typeParameters, Function1 builderAction) {
        s.h(serialName, "serialName");
        s.h(typeParameters, "typeParameters");
        s.h(builderAction, "builderAction");
        if (r.h0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new i(serialName, n.a.f51421a, aVar.f().size(), gl.j.x0(typeParameters), aVar);
    }

    public static /* synthetic */ f e(String str, m mVar, f[] fVarArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: rm.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return l.f((a) obj2);
                }
            };
        }
        return d(str, mVar, fVarArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 f(a aVar) {
        s.h(aVar, "<this>");
        return g0.f38750a;
    }

    public static final f d(String serialName, m kind, f[] typeParameters, Function1 builder) {
        s.h(serialName, "serialName");
        s.h(kind, "kind");
        s.h(typeParameters, "typeParameters");
        s.h(builder, "builder");
        if (r.h0(serialName)) {
            throw new IllegalArgumentException(mDXVAtwcaFMHJ.SKrd);
        }
        if (s.c(kind, n.a.f51421a)) {
            throw new IllegalArgumentException(vHmGJpUTWNVV.uTZ);
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new i(serialName, kind, aVar.f().size(), gl.j.x0(typeParameters), aVar);
    }
}
