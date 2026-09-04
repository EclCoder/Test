package l3;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o2.e0;
import o2.i0;
import o2.o0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class n implements o2.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f43856a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t1.o f43858c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f43862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f43863h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f43857b = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f43861f = c0.f55774f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w1.u f43860e = new w1.u();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f43859d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f43864i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f43865j = c0.f55775g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f43866k = C.TIME_UNSET;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f43867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f43868b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f43867a, bVar.f43867a);
        }

        private b(long j10, byte[] bArr) {
            this.f43867a = j10;
            this.f43868b = bArr;
        }
    }

    public n(r rVar, t1.o oVar) {
        this.f43856a = rVar;
        this.f43858c = oVar.a().o0("application/x-media3-cues").O(oVar.f52757n).S(rVar.c()).K();
    }

    public static /* synthetic */ void a(n nVar, e eVar) {
        nVar.getClass();
        b bVar = new b(eVar.f43847b, nVar.f43857b.a(eVar.f43846a, eVar.f43848c));
        nVar.f43859d.add(bVar);
        long j10 = nVar.f43866k;
        if (j10 == C.TIME_UNSET || eVar.f43847b >= j10) {
            nVar.k(bVar);
        }
    }

    private void g() throws ParserException {
        try {
            long j10 = this.f43866k;
            this.f43856a.a(this.f43861f, 0, this.f43863h, j10 != C.TIME_UNSET ? r.b.c(j10) : r.b.b(), new w1.h() { // from class: l3.m
                @Override // w1.h
                public final void accept(Object obj) {
                    n.a(this.f43855a, (e) obj);
                }
            });
            Collections.sort(this.f43859d);
            this.f43865j = new long[this.f43859d.size()];
            for (int i10 = 0; i10 < this.f43859d.size(); i10++) {
                this.f43865j[i10] = ((b) this.f43859d.get(i10)).f43867a;
            }
            this.f43861f = c0.f55774f;
        } catch (RuntimeException e10) {
            throw ParserException.a("SubtitleParser failed.", e10);
        }
    }

    private boolean h(o2.q qVar) {
        byte[] bArr = this.f43861f;
        if (bArr.length == this.f43863h) {
            this.f43861f = Arrays.copyOf(bArr, bArr.length + UserVerificationMethods.USER_VERIFY_ALL);
        }
        byte[] bArr2 = this.f43861f;
        int i10 = this.f43863h;
        int i11 = qVar.read(bArr2, i10, bArr2.length - i10);
        if (i11 != -1) {
            this.f43863h += i11;
        }
        long length = qVar.getLength();
        return (length != -1 && ((long) this.f43863h) == length) || i11 == -1;
    }

    private boolean i(o2.q qVar) {
        return qVar.skip((qVar.getLength() > (-1L) ? 1 : (qVar.getLength() == (-1L) ? 0 : -1)) != 0 ? com.google.common.primitives.g.d(qVar.getLength()) : UserVerificationMethods.USER_VERIFY_ALL) == -1;
    }

    private void j() {
        long j10 = this.f43866k;
        for (int iG = j10 == C.TIME_UNSET ? 0 : c0.g(this.f43865j, j10, true, true); iG < this.f43859d.size(); iG++) {
            k((b) this.f43859d.get(iG));
        }
    }

    private void k(b bVar) {
        w1.a.i(this.f43862g);
        int length = bVar.f43868b.length;
        this.f43860e.Q(bVar.f43868b);
        this.f43862g.c(this.f43860e, length);
        this.f43862g.e(bVar.f43867a, 1, length, 0, null);
    }

    @Override // o2.p
    public int b(o2.q qVar, i0 i0Var) throws ParserException {
        int i10 = this.f43864i;
        w1.a.g((i10 == 0 || i10 == 5) ? false : true);
        if (this.f43864i == 1) {
            int iD = qVar.getLength() != -1 ? com.google.common.primitives.g.d(qVar.getLength()) : UserVerificationMethods.USER_VERIFY_ALL;
            if (iD > this.f43861f.length) {
                this.f43861f = new byte[iD];
            }
            this.f43863h = 0;
            this.f43864i = 2;
        }
        if (this.f43864i == 2 && h(qVar)) {
            g();
            this.f43864i = 4;
        }
        if (this.f43864i == 3 && i(qVar)) {
            j();
            this.f43864i = 4;
        }
        return this.f43864i == 4 ? -1 : 0;
    }

    @Override // o2.p
    public void c(o2.r rVar) {
        w1.a.g(this.f43864i == 0);
        o0 o0VarTrack = rVar.track(0, 3);
        this.f43862g = o0VarTrack;
        o0VarTrack.b(this.f43858c);
        rVar.endTracks();
        rVar.d(new e0(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        this.f43864i = 1;
    }

    @Override // o2.p
    public boolean d(o2.q qVar) {
        return true;
    }

    @Override // o2.p
    public void release() {
        if (this.f43864i == 5) {
            return;
        }
        this.f43856a.reset();
        this.f43864i = 5;
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        int i10 = this.f43864i;
        w1.a.g((i10 == 0 || i10 == 5) ? false : true);
        this.f43866k = j11;
        if (this.f43864i == 2) {
            this.f43864i = 1;
        }
        if (this.f43864i == 4) {
            this.f43864i = 3;
        }
    }
}
