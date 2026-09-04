package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t> f33198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g f33199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f33200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c f33201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f33203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f33204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f33205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f33206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f33207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f33208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f33209l;

    public g(List<t> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i10, y yVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, int i11, int i12, int i13) {
        this.f33198a = list;
        this.f33201d = cVar2;
        this.f33199b = gVar;
        this.f33200c = cVar;
        this.f33202e = i10;
        this.f33203f = yVar;
        this.f33204g = dVar;
        this.f33205h = oVar;
        this.f33206i = i11;
        this.f33207j = i12;
        this.f33208k = i13;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int a() {
        return this.f33206i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int b() {
        return this.f33207j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int c() {
        return this.f33208k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public y d() {
        return this.f33203f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.f33204g;
    }

    public com.mbridge.msdk.thrid.okhttp.h f() {
        return this.f33201d;
    }

    public o g() {
        return this.f33205h;
    }

    public c h() {
        return this.f33200c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.f33199b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public a0 a(y yVar) {
        return a(yVar, this.f33199b, this.f33200c, this.f33201d);
    }

    public a0 a(y yVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) {
        if (this.f33202e < this.f33198a.size()) {
            this.f33209l++;
            if (this.f33200c != null && !this.f33201d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.f33198a.get(this.f33202e - 1) + " must retain the same host and port");
            }
            if (this.f33200c != null && this.f33209l > 1) {
                throw new IllegalStateException("network interceptor " + this.f33198a.get(this.f33202e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f33198a, gVar, cVar, cVar2, this.f33202e + 1, yVar, this.f33204g, this.f33205h, this.f33206i, this.f33207j, this.f33208k);
            t tVar = this.f33198a.get(this.f33202e);
            a0 a0VarA = tVar.a(gVar2);
            if (cVar != null && this.f33202e + 1 < this.f33198a.size() && gVar2.f33209l != 1) {
                throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
            }
            if (a0VarA != null) {
                if (a0VarA.d() != null) {
                    return a0VarA;
                }
                throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        throw new AssertionError();
    }
}
