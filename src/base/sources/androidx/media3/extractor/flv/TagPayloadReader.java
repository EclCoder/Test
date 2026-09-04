package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import o2.o0;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o0 f6245a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(o0 o0Var) {
        this.f6245a = o0Var;
    }

    public final boolean a(u uVar, long j10) {
        return b(uVar) && c(uVar, j10);
    }

    protected abstract boolean b(u uVar);

    protected abstract boolean c(u uVar, long j10);
}
