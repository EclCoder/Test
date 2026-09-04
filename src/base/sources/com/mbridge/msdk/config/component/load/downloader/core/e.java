package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f28855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.b f28856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f28857c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.f f28858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Map<String, String> f28859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    HashMap<String, List<String>> f28860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f28861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f28862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f28863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f28864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f28865k;

    public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        this.f28856b = bVar;
    }

    public e a(long j10) {
        this.f28855a = j10;
        return this;
    }

    public e b(long j10) {
        this.f28861g = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d build() {
        return d.a(this);
    }

    public p c(long j10) {
        this.f28865k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p withTimeout(long j10) {
        this.f28863i = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p a(com.mbridge.msdk.config.component.load.downloader.f fVar) {
        this.f28858d = fVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e withHttpRetryCounter(int i10) {
        this.f28862h = i10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p a(int i10) {
        this.f28857c = i10;
        return this;
    }
}
