package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import ob.d0;
import u9.b0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b0 f16898a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(b0 b0Var) {
        this.f16898a = b0Var;
    }

    public final boolean a(d0 d0Var, long j10) {
        return b(d0Var) && c(d0Var, j10);
    }

    protected abstract boolean b(d0 d0Var);

    protected abstract boolean c(d0 d0Var, long j10);
}
