package da;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;
import ob.d0;
import u9.l;
import u9.n;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f36508a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f36509b = new d0(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36510c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36512e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f36511d = 0;
        do {
            int i13 = this.f36511d;
            int i14 = i10 + i13;
            f fVar = this.f36508a;
            if (i14 >= fVar.f36519g) {
                break;
            }
            int[] iArr = fVar.f36522j;
            this.f36511d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f36508a;
    }

    public d0 c() {
        return this.f36509b;
    }

    public boolean d(l lVar) {
        int i10;
        ob.a.g(lVar != null);
        if (this.f36512e) {
            this.f36512e = false;
            this.f36509b.Q(0);
        }
        while (!this.f36512e) {
            if (this.f36510c < 0) {
                if (!this.f36508a.c(lVar) || !this.f36508a.a(lVar, true)) {
                    return false;
                }
                f fVar = this.f36508a;
                int iA = fVar.f36520h;
                if ((fVar.f36514b & 1) == 1 && this.f36509b.g() == 0) {
                    iA += a(0);
                    i10 = this.f36511d;
                } else {
                    i10 = 0;
                }
                if (!n.e(lVar, iA)) {
                    return false;
                }
                this.f36510c = i10;
            }
            int iA2 = a(this.f36510c);
            int i11 = this.f36510c + this.f36511d;
            if (iA2 > 0) {
                d0 d0Var = this.f36509b;
                d0Var.c(d0Var.g() + iA2);
                if (!n.d(lVar, this.f36509b.e(), this.f36509b.g(), iA2)) {
                    return false;
                }
                d0 d0Var2 = this.f36509b;
                d0Var2.T(d0Var2.g() + iA2);
                this.f36512e = this.f36508a.f36522j[i11 + (-1)] != 255;
            }
            if (i11 == this.f36508a.f36519g) {
                i11 = -1;
            }
            this.f36510c = i11;
        }
        return true;
    }

    public void e() {
        this.f36508a.b();
        this.f36509b.Q(0);
        this.f36510c = -1;
        this.f36512e = false;
    }

    public void f() {
        if (this.f36509b.e().length == 65025) {
            return;
        }
        d0 d0Var = this.f36509b;
        d0Var.S(Arrays.copyOf(d0Var.e(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.f36509b.g())), this.f36509b.g());
    }
}
