package com.pgl.ssdk;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        return h.b(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) {
        return h.c(byteBuffer);
    }

    public static i a(q qVar, c.a aVar, int i10) throws a {
        try {
            return h.a(qVar, aVar, i10);
        } catch (j e10) {
            throw new a(e10.getMessage());
        }
    }
}
