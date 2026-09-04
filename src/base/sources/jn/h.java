package jn;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import xn.n;
import xn.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class h extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f42766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o0 delegate, Function1 onException) {
        super(delegate);
        s.h(delegate, "delegate");
        s.h(onException, "onException");
        this.f42766b = onException;
    }

    @Override // xn.n, xn.o0
    public void W(xn.e source, long j10) throws EOFException {
        s.h(source, "source");
        if (this.f42767c) {
            source.skip(j10);
            return;
        }
        try {
            super.W(source, j10);
        } catch (IOException e10) {
            this.f42767c = true;
            this.f42766b.invoke(e10);
        }
    }

    @Override // xn.n, xn.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f42767c = true;
            this.f42766b.invoke(e10);
        }
    }

    @Override // xn.n, xn.o0, java.io.Flushable
    public void flush() {
        if (this.f42767c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f42767c = true;
            this.f42766b.invoke(e10);
        }
    }
}
