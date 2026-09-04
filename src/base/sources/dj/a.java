package dj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36942b;

    public a(boolean z10) {
        this.f36942b = z10;
    }

    @Override // dj.b
    public int a() {
        return 1;
    }

    @Override // dj.b
    public l b() {
        return l.BOOLEAN;
    }

    @Override // dj.b
    public void c(InputStream input) {
        s.h(input, "input");
        this.f36942b = input.read() != 0;
    }

    @Override // dj.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        output.write(this.f36942b ? 1 : 0);
    }

    public String toString() {
        return "AmfBoolean value: " + this.f36942b;
    }

    public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
