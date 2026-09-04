package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h implements r5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f11527a;

    public h(r rVar) {
        this.f11527a = rVar;
    }

    @Override // r5.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t5.c a(ByteBuffer byteBuffer, int i10, int i11, r5.g gVar) {
        return this.f11527a.g(byteBuffer, i10, i11, gVar);
    }

    @Override // r5.i
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, r5.g gVar) {
        return this.f11527a.q(byteBuffer);
    }
}
