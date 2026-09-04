package wa;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import nb.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class a implements nb.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nb.j f56015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f56016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f56017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f56018d;

    public a(nb.j jVar, byte[] bArr, byte[] bArr2) {
        this.f56015a = jVar;
        this.f56016b = bArr;
        this.f56017c = bArr2;
    }

    @Override // nb.j
    public void close() {
        if (this.f56018d != null) {
            this.f56018d = null;
            this.f56015a.close();
        }
    }

    @Override // nb.j
    public final void d(a0 a0Var) {
        ob.a.e(a0Var);
        this.f56015a.d(a0Var);
    }

    protected Cipher f() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // nb.j
    public final Map getResponseHeaders() {
        return this.f56015a.getResponseHeaders();
    }

    @Override // nb.j
    public final Uri getUri() {
        return this.f56015a.getUri();
    }

    @Override // nb.j
    public final long h(com.google.android.exoplayer2.upstream.a aVar) {
        try {
            Cipher cipherF = f();
            try {
                cipherF.init(2, new SecretKeySpec(this.f56016b, "AES"), new IvParameterSpec(this.f56017c));
                nb.k kVar = new nb.k(this.f56015a, aVar);
                this.f56018d = new CipherInputStream(kVar, cipherF);
                kVar.h();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // nb.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        ob.a.e(this.f56018d);
        int i12 = this.f56018d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
