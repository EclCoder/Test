package ea;

import android.util.SparseArray;
import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements i0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f37447b;

    public j(int i10) {
        this(i10, com.google.common.collect.c0.C());
    }

    private d0 b(i0.b bVar) {
        return new d0(d(bVar));
    }

    private k0 c(i0.b bVar) {
        return new k0(d(bVar));
    }

    private List d(i0.b bVar) {
        String str;
        int i10;
        if (e(32)) {
            return this.f37447b;
        }
        ob.d0 d0Var = new ob.d0(bVar.f37440d);
        List arrayList = this.f37447b;
        while (d0Var.a() > 0) {
            int iH = d0Var.H();
            int iF = d0Var.f() + d0Var.H();
            if (iH == 134) {
                arrayList = new ArrayList();
                int iH2 = d0Var.H() & 31;
                for (int i11 = 0; i11 < iH2; i11++) {
                    String strE = d0Var.E(3);
                    int iH3 = d0Var.H();
                    boolean z10 = (iH3 & 128) != 0;
                    if (z10) {
                        i10 = iH3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte bH = (byte) d0Var.H();
                    d0Var.V(1);
                    arrayList.add(new v0.b().g0(str).X(strE).H(i10).V(z10 ? ob.e.b((bH & 64) != 0) : null).G());
                }
            }
            d0Var.U(iF);
        }
        return arrayList;
    }

    private boolean e(int i10) {
        return (i10 & this.f37446a) != 0;
    }

    @Override // ea.i0.c
    public i0 a(int i10, i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new w(new t(bVar.f37438b));
            }
            if (i10 == 21) {
                return new w(new r());
            }
            if (i10 == 27) {
                if (e(4)) {
                    return null;
                }
                return new w(new p(b(bVar), e(1), e(8)));
            }
            if (i10 == 36) {
                return new w(new q(b(bVar)));
            }
            if (i10 == 89) {
                return new w(new l(bVar.f37439c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new w(new f(bVar.f37438b));
                }
                if (i10 == 257) {
                    return new c0(new v("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (e(16)) {
                        return null;
                    }
                    return new c0(new v(MimeTypes.APPLICATION_SCTE35));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (e(2)) {
                                return null;
                            }
                            return new w(new i(false, bVar.f37438b));
                        case 16:
                            return new w(new o(c(bVar)));
                        case 17:
                            if (e(2)) {
                                return null;
                            }
                            return new w(new s(bVar.f37438b));
                        default:
                            switch (i10) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!e(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new w(new c(bVar.f37438b));
            }
            return new w(new k(bVar.f37438b));
        }
        return new w(new n(c(bVar)));
    }

    @Override // ea.i0.c
    public SparseArray createInitialPayloadReaders() {
        return new SparseArray();
    }

    public j(int i10, List list) {
        this.f37446a = i10;
        this.f37447b = list;
    }
}
