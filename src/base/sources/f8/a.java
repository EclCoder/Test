package f8;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import g8.f;
import i8.e;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends com.fasterxml.jackson.core.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final int f38336f = (com.fasterxml.jackson.core.c.a.WRITE_NUMBERS_AS_STRINGS.i() | com.fasterxml.jackson.core.c.a.ESCAPE_NON_ASCII.i()) | com.fasterxml.jackson.core.c.a.STRICT_DUPLICATE_DETECTION.i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f38337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f38338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected f f38339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f38340e;

    protected a(int i10, h hVar) {
        this.f38337b = i10;
        this.f38339d = f.l(com.fasterxml.jackson.core.c.a.STRICT_DUPLICATE_DETECTION.h(i10) ? g8.b.e(this) : null);
        this.f38338c = com.fasterxml.jackson.core.c.a.WRITE_NUMBERS_AS_STRINGS.h(i10);
    }

    protected String X0(BigDecimal bigDecimal) throws JsonGenerationException {
        if (!com.fasterxml.jackson.core.c.a.WRITE_BIGDECIMAL_AS_PLAIN.h(this.f38337b)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            c(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    protected i Y0() {
        return new e();
    }

    protected final int Z0(int i10, int i11) {
        if (i11 < 56320 || i11 > 57343) {
            c("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11));
        }
        return ((i10 - 55296) << 10) + C.DEFAULT_BUFFER_SEGMENT_SIZE + (i11 - 56320);
    }

    public com.fasterxml.jackson.core.f a1() {
        return this.f38339d;
    }

    public final boolean b1(com.fasterxml.jackson.core.c.a aVar) {
        return (aVar.i() & this.f38337b) != 0;
    }

    @Override // com.fasterxml.jackson.core.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38340e = true;
    }

    @Override // com.fasterxml.jackson.core.c
    public com.fasterxml.jackson.core.c k() {
        return h() != null ? this : i(Y0());
    }
}
