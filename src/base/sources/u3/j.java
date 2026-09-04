package u3;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f53856b;

    public j(int i10) {
        this(i10, com.google.common.collect.c0.C());
    }

    private f0 b(k0.b bVar) {
        return new f0(d(bVar));
    }

    private m0 c(k0.b bVar) {
        return new m0(d(bVar));
    }

    private List d(k0.b bVar) {
        String str;
        int i10;
        if (e(32)) {
            return this.f53856b;
        }
        w1.u uVar = new w1.u(bVar.f53909e);
        List arrayList = this.f53856b;
        while (uVar.a() > 0) {
            int iG = uVar.G();
            int iF = uVar.f() + uVar.G();
            if (iG == 134) {
                arrayList = new ArrayList();
                int iG2 = uVar.G() & 31;
                for (int i11 = 0; i11 < iG2; i11++) {
                    String strD = uVar.D(3);
                    int iG3 = uVar.G();
                    boolean z10 = (iG3 & 128) != 0;
                    if (z10) {
                        i10 = iG3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte bG = (byte) uVar.G();
                    uVar.U(1);
                    arrayList.add(new t1.o.b().o0(str).e0(strD).L(i10).b0(z10 ? w1.e.b((bG & 64) != 0) : null).K());
                }
            }
            uVar.T(iF);
        }
        return arrayList;
    }

    private boolean e(int i10) {
        return (i10 & this.f53855a) != 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    @Override // u3.k0.c
    public k0 a(int i10, k0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new y(new t(bVar.f53906b, bVar.a()));
            }
            if (i10 == 21) {
                return new y(new r());
            }
            if (i10 == 27) {
                if (e(4)) {
                    return null;
                }
                return new y(new p(b(bVar), e(1), e(8)));
            }
            if (i10 == 36) {
                return new y(new q(b(bVar)));
            }
            if (i10 == 45) {
                return new y(new u());
            }
            if (i10 == 89) {
                return new y(new l(bVar.f53908d));
            }
            if (i10 == 172) {
                return new y(new f(bVar.f53906b, bVar.a()));
            }
            if (i10 == 257) {
                return new e0(new x("application/vnd.dvb.ait"));
            }
            if (i10 != 138) {
                if (i10 == 139) {
                    return new y(new k(bVar.f53906b, bVar.a(), 5408));
                }
                switch (i10) {
                    case 15:
                        if (e(2)) {
                            return null;
                        }
                        return new y(new i(false, bVar.f53906b, bVar.a()));
                    case 16:
                        return new y(new o(c(bVar)));
                    case 17:
                        if (e(2)) {
                            return null;
                        }
                        return new y(new s(bVar.f53906b, bVar.a()));
                    default:
                        switch (i10) {
                            case 128:
                                break;
                            case 129:
                                return new y(new c(bVar.f53906b, bVar.a()));
                            case 130:
                                if (!e(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i10) {
                                    case 134:
                                        if (e(16)) {
                                            return null;
                                        }
                                        return new e0(new x(MimeTypes.APPLICATION_SCTE35));
                                    case 135:
                                        return new y(new c(bVar.f53906b, bVar.a()));
                                    case PRIVACY_URL_ERROR_VALUE:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new y(new k(bVar.f53906b, bVar.a(), 4096));
        }
        return new y(new n(c(bVar)));
    }

    @Override // u3.k0.c
    public SparseArray createInitialPayloadReaders() {
        return new SparseArray();
    }

    public j(int i10, List list) {
        this.f53855a = i10;
        this.f53856b = list;
    }
}
