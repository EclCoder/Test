package ej;

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
    public static final a f37924a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: ej.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public /* synthetic */ class C0566a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f37925a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.DOUBLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.f37934f.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k.STRING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[k.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[k.NULL.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[k.UNDEFINED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[k.ARRAY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[k.DICTIONARY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[k.TRUE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[k.FALSE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f37925a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(InputStream input) throws IOException {
            b dVar;
            s.h(input, "input");
            k kVarB = b(input.read());
            switch (C0566a.f37925a[kVarB.ordinal()]) {
                case 1:
                    dVar = new d(0.0d, 1, null);
                    break;
                case 2:
                    dVar = new f();
                    break;
                case 3:
                    dVar = new i(null, 1, null);
                    break;
                case 4:
                    dVar = new h(null, 1, null);
                    break;
                case 5:
                    dVar = new g();
                    break;
                case 6:
                    dVar = new l();
                    break;
                case 7:
                    dVar = new ej.a(null, 1, null);
                    break;
                case 8:
                    dVar = new c(null, 1, null);
                    break;
                case 9:
                    dVar = new j();
                    break;
                case 10:
                    dVar = new e();
                    break;
                default:
                    throw new IOException("Unimplemented AMF3 data type: " + kVarB.name());
            }
            dVar.c(input);
            return dVar;
        }

        public final k b(int i10) {
            Object next;
            Iterator<E> it = k.g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((k) next).h() != i10);
            k kVar = (k) next;
            return kVar == null ? k.STRING : kVar;
        }

        private a() {
        }
    }

    public abstract int a();

    public abstract k b();

    public abstract void c(InputStream inputStream);

    public final k d(InputStream input) {
        s.h(input, "input");
        return f37924a.b(input.read());
    }

    public abstract void e(OutputStream outputStream);

    public final void f(OutputStream output) throws IOException {
        s.h(output, "output");
        output.write(b().h());
    }
}
