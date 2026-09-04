package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f30581c;

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f30579a = i10;
        this.f30581c = aVar;
    }

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f30579a = i10;
        this.f30581c = aVar;
        this.f30580b = str;
    }
}
