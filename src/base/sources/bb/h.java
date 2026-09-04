package bb;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends s9.h implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8789n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n {
        a() {
        }

        @Override // s9.f
        public void l() {
            h.this.n(this);
        }
    }

    protected h(String str) {
        super(new m[2], new n[2]);
        this.f8789n = str;
        q(UserVerificationMethods.USER_VERIFY_ALL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s9.h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final m c() {
        return new m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s9.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s9.h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException e(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    protected abstract i v(byte[] bArr, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s9.h
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException f(m mVar, n nVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ob.a.e(mVar.f16754c);
            nVar.m(mVar.f16756e, v(byteBuffer.array(), byteBuffer.limit(), z10), mVar.f8803i);
            nVar.c(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    @Override // bb.j
    public void setPositionUs(long j10) {
    }
}
