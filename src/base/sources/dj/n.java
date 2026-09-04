package dj;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n extends b {
    @Override // dj.b
    public int a() {
        return 0;
    }

    @Override // dj.b
    public l b() {
        return l.UNSUPPORTED;
    }

    @Override // dj.b
    public void c(InputStream input) {
        s.h(input, "input");
    }

    @Override // dj.b
    public void e(OutputStream output) {
        s.h(output, "output");
    }

    public String toString() {
        return "AmfUnsupported";
    }
}
