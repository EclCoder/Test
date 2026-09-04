package j3;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;
import o2.q;
import o2.s;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f41951a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f41952b = new u(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41953c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41955e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f41954d = 0;
        do {
            int i13 = this.f41954d;
            int i14 = i10 + i13;
            f fVar = this.f41951a;
            if (i14 >= fVar.f41962g) {
                break;
            }
            int[] iArr = fVar.f41965j;
            this.f41954d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f41951a;
    }

    public u c() {
        return this.f41952b;
    }

    public boolean d(q qVar) {
        int i10;
        w1.a.g(qVar != null);
        if (this.f41955e) {
            this.f41955e = false;
            this.f41952b.P(0);
        }
        while (!this.f41955e) {
            if (this.f41953c < 0) {
                if (!this.f41951a.c(qVar) || !this.f41951a.a(qVar, true)) {
                    return false;
                }
                f fVar = this.f41951a;
                int iA = fVar.f41963h;
                if ((fVar.f41957b & 1) == 1 && this.f41952b.g() == 0) {
                    iA += a(0);
                    i10 = this.f41954d;
                } else {
                    i10 = 0;
                }
                if (!s.e(qVar, iA)) {
                    return false;
                }
                this.f41953c = i10;
            }
            int iA2 = a(this.f41953c);
            int i11 = this.f41953c + this.f41954d;
            if (iA2 > 0) {
                u uVar = this.f41952b;
                uVar.c(uVar.g() + iA2);
                if (!s.d(qVar, this.f41952b.e(), this.f41952b.g(), iA2)) {
                    return false;
                }
                u uVar2 = this.f41952b;
                uVar2.S(uVar2.g() + iA2);
                this.f41955e = this.f41951a.f41965j[i11 + (-1)] != 255;
            }
            if (i11 == this.f41951a.f41962g) {
                i11 = -1;
            }
            this.f41953c = i11;
        }
        return true;
    }

    public void e() {
        this.f41951a.b();
        this.f41952b.P(0);
        this.f41953c = -1;
        this.f41955e = false;
    }

    public void f() {
        if (this.f41952b.e().length == 65025) {
            return;
        }
        u uVar = this.f41952b;
        uVar.R(Arrays.copyOf(uVar.e(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, this.f41952b.g())), this.f41952b.g());
    }
}
