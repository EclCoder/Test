package com.pgl.ssdk;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends t {
        public a(long j10, long j11, int i10, long j12, ByteBuffer byteBuffer) {
            super(j10, j11, i10, j12, byteBuffer);
        }
    }

    public static a a(q qVar) throws s {
        t tVarA = d.a(qVar);
        return new a(tVarA.a(), tVarA.c(), tVarA.b(), tVarA.e(), tVarA.d());
    }
}
