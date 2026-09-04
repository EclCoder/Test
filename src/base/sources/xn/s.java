package xn;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class s extends n implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56984d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MessageDigest f56985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Mac f56986c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(o0 sink) {
            kotlin.jvm.internal.s.h(sink, "sink");
            return new s(sink, "SHA-256");
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o0 sink, MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.s.h(sink, "sink");
        kotlin.jvm.internal.s.h(digest, "digest");
        this.f56985b = digest;
        this.f56986c = null;
    }

    @Override // xn.n, xn.o0
    public void W(e source, long j10) {
        kotlin.jvm.internal.s.h(source, "source");
        b.b(source.size(), 0L, j10);
        l0 l0Var = source.f56903a;
        kotlin.jvm.internal.s.e(l0Var);
        long j11 = 0;
        while (j11 < j10) {
            int iMin = (int) Math.min(j10 - j11, l0Var.f56954c - l0Var.f56953b);
            MessageDigest messageDigest = this.f56985b;
            if (messageDigest != null) {
                messageDigest.update(l0Var.f56952a, l0Var.f56953b, iMin);
            } else {
                Mac mac = this.f56986c;
                kotlin.jvm.internal.s.e(mac);
                mac.update(l0Var.f56952a, l0Var.f56953b, iMin);
            }
            j11 += (long) iMin;
            l0Var = l0Var.f56957f;
            kotlin.jvm.internal.s.e(l0Var);
        }
        super.W(source, j10);
    }

    public final h d() {
        byte[] bArrDoFinal;
        MessageDigest messageDigest = this.f56985b;
        if (messageDigest != null) {
            bArrDoFinal = messageDigest.digest();
        } else {
            Mac mac = this.f56986c;
            kotlin.jvm.internal.s.e(mac);
            bArrDoFinal = mac.doFinal();
        }
        kotlin.jvm.internal.s.e(bArrDoFinal);
        return new h(bArrDoFinal);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s(o0 sink, String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.s.h(sink, "sink");
        kotlin.jvm.internal.s.h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        kotlin.jvm.internal.s.g(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }
}
