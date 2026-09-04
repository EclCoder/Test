package oj;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48964c;

    public /* synthetic */ j(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 128 : i10);
    }

    @Override // oj.i
    public int c() {
        return 4;
    }

    @Override // oj.i
    public f d() {
        return f.SET_CHUNK_SIZE;
    }

    @Override // oj.i
    public void f(InputStream input) {
        s.h(input, "input");
        this.f48964c = tj.e.e(input);
    }

    @Override // oj.i
    public byte[] g() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        tj.e.l(byteArrayOutputStream, this.f48964c);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.g(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final int k() {
        return this.f48964c;
    }

    public String toString() {
        return "SetChunkSize(chunkSize=" + this.f48964c + ")";
    }

    public j(int i10) {
        super(new e(nj.b.TYPE_0, nj.a.PROTOCOL_CONTROL.g()));
        this.f48964c = i10;
    }
}
