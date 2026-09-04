package com.facebook.appevents;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f14927a = new HashMap();

    private final synchronized t0 e(a aVar) {
        Context contextM;
        com.facebook.internal.b bVarE;
        t0 t0Var = (t0) this.f14927a.get(aVar);
        if (t0Var == null && (bVarE = com.facebook.internal.b.f15130f.e((contextM = com.facebook.h0.m()))) != null) {
            t0Var = new t0(bVarE, o.f14964b.b(contextM));
        }
        if (t0Var == null) {
            return null;
        }
        this.f14927a.put(aVar, t0Var);
        return t0Var;
    }

    public final synchronized void a(a accessTokenAppIdPair, d appEvent) {
        kotlin.jvm.internal.s.h(accessTokenAppIdPair, "accessTokenAppIdPair");
        kotlin.jvm.internal.s.h(appEvent, "appEvent");
        t0 t0VarE = e(accessTokenAppIdPair);
        if (t0VarE != null) {
            t0VarE.a(appEvent);
        }
    }

    public final synchronized void b(s0 s0Var) {
        if (s0Var == null) {
            return;
        }
        for (Map.Entry entry : s0Var.d()) {
            t0 t0VarE = e((a) entry.getKey());
            if (t0VarE != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    t0VarE.a((d) it.next());
                }
            }
        }
    }

    public final synchronized t0 c(a accessTokenAppIdPair) {
        kotlin.jvm.internal.s.h(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (t0) this.f14927a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int iC;
        Iterator it = this.f14927a.values().iterator();
        iC = 0;
        while (it.hasNext()) {
            iC += ((t0) it.next()).c();
        }
        return iC;
    }

    public final synchronized Set f() {
        Set setKeySet;
        setKeySet = this.f14927a.keySet();
        kotlin.jvm.internal.s.g(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
