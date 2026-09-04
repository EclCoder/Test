package fg;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected MediaCodec f38645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f38646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaCodec.Callback f38647c = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(h hVar, int i10, MediaCodec.BufferInfo bufferInfo);

        void b(h hVar, MediaFormat mediaFormat);

        void onError(Exception exc);
    }

    protected abstract MediaFormat b();

    protected final MediaCodec c() {
        MediaCodec mediaCodec = this.f38645a;
        Objects.requireNonNull(mediaCodec, "doesn't prepare()");
        return mediaCodec;
    }

    public final ByteBuffer d(int i10) {
        return c().getInputBuffer(i10);
    }

    public final ByteBuffer e(int i10) {
        return c().getOutputBuffer(i10);
    }

    public final void g(int i10, int i11, int i12, long j10, int i13) {
        c().queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void h() {
        MediaCodec mediaCodec = this.f38645a;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.f38645a = null;
        }
    }

    public final void i(int i10) {
        c().releaseOutputBuffer(i10, false);
    }

    void j(b bVar) {
        if (this.f38645a != null) {
            throw new IllegalStateException("mEncoder is not null");
        }
        this.f38646b = bVar;
    }

    public void k() throws IOException {
        MediaFormat mediaFormatB = b();
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mediaFormatB.getString("mime"));
        this.f38645a = mediaCodecCreateEncoderByType;
        if (this.f38646b != null) {
            mediaCodecCreateEncoderByType.setCallback(this.f38647c);
        }
        this.f38645a.configure(mediaFormatB, (Surface) null, (MediaCrypto) null, 1);
        f(this.f38645a);
        this.f38645a.start();
    }

    public void l() {
        MediaCodec mediaCodec = this.f38645a;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception unused) {
            }
        }
    }

    protected void f(MediaCodec mediaCodec) {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends MediaCodec.Callback {
        a() {
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            h.this.f38646b.onError(codecException);
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
            h.this.f38646b.a(h.this, i10, bufferInfo);
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            h.this.f38646b.b(h.this, mediaFormat);
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        }
    }
}
