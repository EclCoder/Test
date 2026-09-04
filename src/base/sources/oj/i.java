package oj;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48961b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl.k f48962a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: oj.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class C0755a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f48963a;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.SET_CHUNK_SIZE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.f48934c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f.ACKNOWLEDGEMENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f.USER_CONTROL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[f.WINDOW_ACKNOWLEDGEMENT_SIZE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[f.SET_PEER_BANDWIDTH.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[f.AUDIO.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[f.VIDEO.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[f.DATA_AMF3.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[f.SHARED_OBJECT_AMF3.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[f.COMMAND_AMF3.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[f.DATA_AMF0.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[f.SHARED_OBJECT_AMF0.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[f.COMMAND_AMF0.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[f.AGGREGATE.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                f48963a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final InputStream a(InputStream inputStream, g gVar, int i10, tj.c cVar) throws IOException {
            byte[] bArr;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = 0;
            while (length < gVar.b()) {
                if (gVar.b() - length < i10) {
                    bArr = new byte[gVar.b() - length];
                    tj.e.g(inputStream, bArr);
                } else {
                    bArr = new byte[i10];
                    tj.e.g(inputStream, bArr);
                    g.f48951f.a(inputStream, cVar, gVar.f());
                }
                length += bArr.length;
                byteArrayOutputStream.write(bArr);
            }
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        }

        public final f b(int i10) throws IOException {
            Object next;
            Iterator<E> it = f.g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((f) next).h() != i10);
            f fVar = (f) next;
            if (fVar != null) {
                return fVar;
            }
            throw new IOException("Unknown rtmp message type: " + i10);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
        /* JADX WARN: Multi-variable type inference failed */
        public final i c(InputStream input, int i10, tj.c commandSessionHistory) throws IOException {
            i jVar;
            i cVar;
            InputStream inputStreamA;
            s.h(input, "input");
            s.h(commandSessionHistory, "commandSessionHistory");
            g gVarB = g.a.b(g.f48951f, input, commandSessionHistory, 0, 4, null);
            f fVarD = gVarB.d();
            int i11 = 1;
            int i12 = 3;
            int i13 = 0;
            fj.b bVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            switch (fVarD == null ? -1 : C0755a.f48963a[fVarD.ordinal()]) {
                case 1:
                    jVar = new j(i13, i11, objArr == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 2:
                    jVar = new oj.a(i13, i11, objArr2 == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 3:
                    jVar = new b(i13, i11, objArr3 == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 4:
                    jVar = new qj.c(objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i12, objArr4 == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 5:
                    jVar = new m(i13, i13, i12, objArr7 == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 6:
                    jVar = new k(i13, objArr9 == true ? 1 : 0, i12, objArr8 == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 7:
                    jVar = new d(objArr11 == true ? 1 : 0, i13, i12, objArr10 == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 8:
                    jVar = new l(bVar, i13, i12, objArr12 == true ? 1 : 0);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 9:
                    cVar = new rj.c(null, 0, 0, null, 15, null);
                    jVar = cVar;
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 10:
                    jVar = new sj.c();
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 11:
                    jVar = new pj.c(null, 0, 0, 0, null, 31, null);
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 12:
                    cVar = new rj.b(null, 0, 0, null, 15, null);
                    jVar = cVar;
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 13:
                    jVar = new sj.b();
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 14:
                    cVar = new pj.b(null, 0, 0, 0, null, 31, null);
                    jVar = cVar;
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                case 15:
                    jVar = new c();
                    jVar.h(gVarB);
                    if (gVarB.b() > i10) {
                        inputStreamA = a(input, gVarB, i10, commandSessionHistory);
                    } else {
                        inputStreamA = input;
                    }
                    jVar.f(inputStreamA);
                    return jVar;
                default:
                    throw new IOException("Unimplemented message type: " + gVarB.d());
            }
        }

        private a() {
        }
    }

    public i(final e basicHeader) {
        s.h(basicHeader, "basicHeader");
        this.f48962a = fl.l.b(new tl.a() { // from class: oj.h
            @Override // tl.a
            public final Object invoke() {
                return i.e(basicHeader, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g e(e eVar, i iVar) {
        g gVar = new g(eVar);
        gVar.j(iVar.d());
        gVar.h(iVar.c());
        return gVar;
    }

    public final g b() {
        return (g) this.f48962a.getValue();
    }

    public abstract int c();

    public abstract f d();

    public abstract void f(InputStream inputStream);

    public abstract byte[] g();

    public final void h(g rtmpHeader) {
        s.h(rtmpHeader, "rtmpHeader");
        b().g(rtmpHeader.a());
        b().j(rtmpHeader.d());
        b().h(rtmpHeader.b());
        b().i(rtmpHeader.c());
        b().k(rtmpHeader.f());
    }

    public final void i(OutputStream output) throws IOException {
        s.h(output, "output");
        int iB = tj.d.f53435a.b();
        byte[] bArrG = g();
        int iC = c();
        int i10 = 0;
        while (iC > iB) {
            output.write(bArrG, i10, iB);
            iC -= iB;
            i10 += iB;
            b().m(new e(nj.b.TYPE_3, b().a().a()), output);
        }
        output.write(bArrG, i10, iC);
    }

    public final void j(OutputStream output) throws IOException {
        s.h(output, "output");
        b().l(output);
    }
}
