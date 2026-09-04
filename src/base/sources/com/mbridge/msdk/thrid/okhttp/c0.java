package com.mbridge.msdk.thrid.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f33008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Proxy f33009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final InetSocketAddress f33010c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f33008a = aVar;
        this.f33009b = proxy;
        this.f33010c = inetSocketAddress;
    }

    public a a() {
        return this.f33008a;
    }

    public Proxy b() {
        return this.f33009b;
    }

    public boolean c() {
        return this.f33008a.f32953i != null && this.f33009b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f33010c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f33008a.equals(this.f33008a) && c0Var.f33009b.equals(this.f33009b) && c0Var.f33010c.equals(this.f33010c);
    }

    public int hashCode() {
        return ((((this.f33008a.hashCode() + 527) * 31) + this.f33009b.hashCode()) * 31) + this.f33010c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f33010c + "}";
    }
}
