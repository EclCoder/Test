package wa;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.d0;
import ob.n0;
import u9.b0;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements u9.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f56156g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f56157h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f56158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n0 f56159b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u9.m f56161d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f56163f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f56160c = new d0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f56162e = new byte[UserVerificationMethods.USER_VERIFY_ALL];

    public s(String str, n0 n0Var) {
        this.f56158a = str;
        this.f56159b = n0Var;
    }

    private b0 a(long j10) {
        b0 b0VarTrack = this.f56161d.track(0, 3);
        b0VarTrack.e(new v0.b().g0(MimeTypes.TEXT_VTT).X(this.f56158a).k0(j10).G());
        this.f56161d.endTracks();
        return b0VarTrack;
    }

    private void e() throws ParserException {
        d0 d0Var = new d0(this.f56162e);
        kb.i.e(d0Var);
        long jG = 0;
        long jD = 0;
        for (String strS = d0Var.s(); !TextUtils.isEmpty(strS); strS = d0Var.s()) {
            if (strS.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f56156g.matcher(strS);
                if (!matcher.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strS, null);
                }
                Matcher matcher2 = f56157h.matcher(strS);
                if (!matcher2.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strS, null);
                }
                jD = kb.i.d((String) ob.a.e(matcher.group(1)));
                jG = n0.g(Long.parseLong((String) ob.a.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = kb.i.a(d0Var);
        if (matcherA == null) {
            a(0L);
            return;
        }
        long jD2 = kb.i.d((String) ob.a.e(matcherA.group(1)));
        long jB = this.f56159b.b(n0.k((jG + jD2) - jD));
        b0 b0VarA = a(jB - jD2);
        this.f56160c.S(this.f56162e, this.f56163f);
        b0VarA.c(this.f56160c, this.f56163f);
        b0VarA.f(jB, 1, this.f56163f, 0, null);
    }

    @Override // u9.k
    public void b(u9.m mVar) {
        this.f56161d = mVar;
        mVar.c(new z.b(C.TIME_UNSET));
    }

    @Override // u9.k
    public int c(u9.l lVar, y yVar) throws ParserException {
        ob.a.e(this.f56161d);
        int length = (int) lVar.getLength();
        int i10 = this.f56163f;
        byte[] bArr = this.f56162e;
        if (i10 == bArr.length) {
            this.f56162e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f56162e;
        int i11 = this.f56163f;
        int i12 = lVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f56163f + i12;
            this.f56163f = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // u9.k
    public boolean d(u9.l lVar) {
        lVar.peekFully(this.f56162e, 0, 6, false);
        this.f56160c.S(this.f56162e, 6);
        if (kb.i.b(this.f56160c)) {
            return true;
        }
        lVar.peekFully(this.f56162e, 6, 3, false);
        this.f56160c.S(this.f56162e, 9);
        return kb.i.b(this.f56160c);
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // u9.k
    public void release() {
    }
}
