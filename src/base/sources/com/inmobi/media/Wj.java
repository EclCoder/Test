package com.inmobi.media;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Wj extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Xj f25957a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wj(Xj xj2, int i10) {
        super(i10);
        this.f25957a = xj2;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized String toString() {
        int i10;
        i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0) {
            int i11 = i10 - 1;
            if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                i10 = i11;
            }
        }
        try {
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
        return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f25957a.f26031b.name());
    }
}
