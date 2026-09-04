package com.facebook.login;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.a f15616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.facebook.n f15617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f15618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f15619d;

    public h0(com.facebook.a accessToken, com.facebook.n nVar, Set recentlyGrantedPermissions, Set recentlyDeniedPermissions) {
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
        kotlin.jvm.internal.s.h(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        kotlin.jvm.internal.s.h(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.f15616a = accessToken;
        this.f15617b = nVar;
        this.f15618c = recentlyGrantedPermissions;
        this.f15619d = recentlyDeniedPermissions;
    }

    public final Set a() {
        return this.f15618c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.s.c(this.f15616a, h0Var.f15616a) && kotlin.jvm.internal.s.c(this.f15617b, h0Var.f15617b) && kotlin.jvm.internal.s.c(this.f15618c, h0Var.f15618c) && kotlin.jvm.internal.s.c(this.f15619d, h0Var.f15619d);
    }

    public int hashCode() {
        int iHashCode = this.f15616a.hashCode() * 31;
        com.facebook.n nVar = this.f15617b;
        return ((((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.f15618c.hashCode()) * 31) + this.f15619d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f15616a + ", authenticationToken=" + this.f15617b + ", recentlyGrantedPermissions=" + this.f15618c + ", recentlyDeniedPermissions=" + this.f15619d + ')';
    }
}
