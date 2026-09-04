package dj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36949c;

    public e(String value) {
        s.h(value, "value");
        this.f36948b = value;
        byte[] bytes = value.getBytes(bm.d.f9079b);
        s.g(bytes, "getBytes(...)");
        this.f36949c = bytes.length + 4;
    }

    @Override // dj.b
    public int a() {
        return this.f36949c;
    }

    @Override // dj.b
    public l b() {
        return l.LONG_STRING;
    }

    @Override // dj.b
    public void c(InputStream input) throws IOException {
        s.h(input, "input");
        int iE = tj.e.e(input);
        this.f36949c = iE;
        byte[] bArr = new byte[iE];
        this.f36949c = iE + 4;
        tj.e.g(input, bArr);
        this.f36948b = new String(bArr, bm.d.f9079b);
    }

    @Override // dj.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        byte[] bytes = this.f36948b.getBytes(bm.d.f9079b);
        s.g(bytes, "getBytes(...)");
        tj.e.l(output, this.f36949c - 4);
        output.write(bytes);
    }

    public final String g() {
        return this.f36948b;
    }

    public String toString() {
        return "AmfLongString value: " + this.f36948b;
    }

    public /* synthetic */ e(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
