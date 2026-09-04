package l3;

import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends b2.f implements l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f43853o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends p {
        a() {
        }

        @Override // b2.e
        public void j() {
            j.this.p(this);
        }
    }

    protected j(String str) {
        super(new o[2], new p[2]);
        this.f43853o = str;
        s(UserVerificationMethods.USER_VERIFY_ALL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.f
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final o e() {
        return new o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.f
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final p f() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.f
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException g(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.f
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException h(o oVar, p pVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) w1.a.e(oVar.f4864d);
            pVar.k(oVar.f4866f, y(byteBuffer.array(), byteBuffer.limit(), z10), oVar.f43869j);
            pVar.f8290d = false;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    protected abstract k y(byte[] bArr, int i10, boolean z10);

    @Override // l3.l
    public void setPositionUs(long j10) {
    }
}
