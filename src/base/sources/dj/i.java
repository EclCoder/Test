package dj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f36954c;

    public i(boolean z10) {
        this.f36953b = z10;
        this.f36954c = new byte[]{0, 0, b().h()};
    }

    @Override // dj.b
    public int a() {
        return this.f36954c.length;
    }

    @Override // dj.b
    public l b() {
        return l.OBJECT_END;
    }

    @Override // dj.b
    public void c(InputStream input) throws IOException {
        s.h(input, "input");
        byte[] bArr = new byte[a()];
        tj.e.g(input, bArr);
        this.f36953b = Arrays.equals(bArr, this.f36954c);
    }

    @Override // dj.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        output.write(this.f36954c);
    }

    public final boolean g() {
        return this.f36953b;
    }

    public String toString() {
        return "AmfObjectEnd";
    }

    public /* synthetic */ i(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
