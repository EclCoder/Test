package ej;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f37927b;

    public d(double d10) {
        this.f37927b = d10;
    }

    @Override // ej.b
    public int a() {
        return 8;
    }

    @Override // ej.b
    public k b() {
        return k.DOUBLE;
    }

    @Override // ej.b
    public void c(InputStream input) throws IOException {
        s.h(input, "input");
        byte[] bArr = new byte[a()];
        tj.e.g(input, bArr);
        long j10 = ByteBuffer.wrap(bArr).getLong();
        kotlin.jvm.internal.k kVar = kotlin.jvm.internal.k.f43596a;
        this.f37927b = Double.longBitsToDouble(j10);
    }

    @Override // ej.b
    public void e(OutputStream output) throws IOException {
        s.h(output, "output");
        output.write(ByteBuffer.allocate(a()).putLong(Double.doubleToRawLongBits(this.f37927b)).array());
    }

    public final double g() {
        return this.f37927b;
    }

    public /* synthetic */ d(double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10);
    }
}
