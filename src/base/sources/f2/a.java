package f2;

import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.g2;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import t1.o;
import t1.v;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b2.f implements f2.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f38219o;

    /* JADX INFO: renamed from: f2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0570a extends e {
        C0570a() {
        }

        @Override // b2.e
        public void j() {
            a.this.p(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        Bitmap a(byte[] bArr, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements f2.c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f38221b = new b() { // from class: f2.b
            @Override // f2.a.b
            public final Bitmap a(byte[] bArr, int i10) {
                return a.x(bArr, i10);
            }
        };

        @Override // f2.c.a
        public int a(o oVar) {
            String str = oVar.f52757n;
            if (str == null || !v.i(str)) {
                return g2.h(0);
            }
            return c0.u0(oVar.f52757n) ? g2.h(4) : g2.h(1);
        }

        @Override // f2.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a(this.f38221b, null);
        }
    }

    /* synthetic */ a(b bVar, C0570a c0570a) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap x(byte[] bArr, int i10) throws ImageDecoderException {
        try {
            return z1.b.a(bArr, i10, null);
        } catch (ParserException e10) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new ImageDecoderException(e11);
        }
    }

    @Override // b2.f, b2.d
    public /* bridge */ /* synthetic */ e dequeueOutputBuffer() {
        return (e) super.dequeueOutputBuffer();
    }

    @Override // b2.f
    protected DecoderInputBuffer e() {
        return new DecoderInputBuffer(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.f
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public e f() {
        return new C0570a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.f
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException g(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException h(DecoderInputBuffer decoderInputBuffer, e eVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(decoderInputBuffer.f4864d);
            w1.a.g(byteBuffer.hasArray());
            w1.a.a(byteBuffer.arrayOffset() == 0);
            eVar.f38224e = this.f38219o.a(byteBuffer.array(), byteBuffer.remaining());
            eVar.f8288b = decoderInputBuffer.f4866f;
            return null;
        } catch (ImageDecoderException e10) {
            return e10;
        }
    }

    private a(b bVar) {
        super(new DecoderInputBuffer[1], new e[1]);
        this.f38219o = bVar;
    }
}
