package jn;

import com.google.api.client.http.HttpMethods;
import gn.d0;
import gn.y;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 b(d0 d0Var) {
        y yVarC = d0Var.c();
        if (yVarC != null) {
            return (mn.f.f46483a.b(d0Var.i()) || s.c(d0Var.i(), HttpMethods.POST)) ? d0Var.j().f().u(yVarC).d(null).b() : d0Var;
        }
        return d0Var;
    }
}
