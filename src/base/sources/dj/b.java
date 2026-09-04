package dj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36943a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: dj.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class C0555a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36944a;

            static {
                int[] iArr = new int[l.values().length];
                try {
                    iArr[l.NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.BOOLEAN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[l.STRING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[l.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[l.NULL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[l.UNDEFINED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[l.ECMA_ARRAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[l.STRICT_ARRAY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[l.DATE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[l.LONG_STRING.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[l.UNSUPPORTED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[l.XML_DOCUMENT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                f36944a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(InputStream input) {
            b gVar;
            s.h(input, "input");
            l lVarB = b(input.read());
            switch (C0555a.f36944a[lVarB.ordinal()]) {
                case 1:
                    gVar = new g(0.0d, 1, null);
                    break;
                case 2:
                    gVar = new dj.a(false, 1, null);
                    break;
                case 3:
                    gVar = new k(null, 1, null);
                    break;
                case 4:
                    gVar = new h(null, 1, null);
                    break;
                case 5:
                    gVar = new f();
                    break;
                case 6:
                    gVar = new m();
                    break;
                case 7:
                    gVar = new d(null, 1, null);
                    break;
                case 8:
                    gVar = new j(null, 1, null);
                    break;
                case 9:
                    gVar = new c(0.0d, 1, null);
                    break;
                case 10:
                    gVar = new e(null, 1, null);
                    break;
                case 11:
                    gVar = new n();
                    break;
                case 12:
                    gVar = new o(null, 1, null);
                    break;
                default:
                    throw new IOException("Unimplemented AMF data type: " + lVarB.name());
            }
            gVar.c(input);
            return gVar;
        }

        public final l b(int i10) {
            Object next;
            Iterator<E> it = l.g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((l) next).h() != i10);
            l lVar = (l) next;
            return lVar == null ? l.STRING : lVar;
        }

        private a() {
        }
    }

    public abstract int a();

    public abstract l b();

    public abstract void c(InputStream inputStream);

    public final l d(InputStream input) {
        s.h(input, "input");
        return f36943a.b(input.read());
    }

    public abstract void e(OutputStream outputStream);

    public final void f(OutputStream output) {
        s.h(output, "output");
        output.write(b().h());
    }
}
