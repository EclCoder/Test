package dj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36958c;

    public k(String value) {
        s.h(value, "value");
        this.f36957b = value;
        byte[] bytes = value.getBytes(bm.d.f9079b);
        s.g(bytes, "getBytes(...)");
        this.f36958c = bytes.length + 2;
    }

    @Override // dj.b
    public int a() {
        return this.f36958c;
    }

    @Override // dj.b
    public l b() {
        return l.STRING;
    }

    @Override // dj.b
    public void c(InputStream input) throws IOException {
        s.h(input, "input");
        int iC = tj.e.c(input);
        this.f36958c = iC;
        byte[] bArr = new byte[iC];
        this.f36958c = iC + 2;
        tj.e.g(input, bArr);
        this.f36957b = new String(bArr, bm.d.f9079b);
    }

    @Override // dj.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        tj.e.j(output, this.f36958c - 2);
        byte[] bytes = this.f36957b.getBytes(bm.d.f9079b);
        s.g(bytes, "getBytes(...)");
        output.write(bytes);
    }

    public final String g() {
        return this.f36957b;
    }

    public String toString() {
        return "AmfString value: " + this.f36957b;
    }

    public /* synthetic */ k(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
