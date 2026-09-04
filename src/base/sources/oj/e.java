package oj;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48929c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nj.b f48930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48931b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(InputStream input) throws IOException {
            Object next;
            int i10;
            s.h(input, "input");
            byte b10 = (byte) input.read();
            int i11 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >>> 6;
            Iterator<E> it = nj.b.g().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((nj.b) next).h() != i11);
            nj.b bVar = (nj.b) next;
            if (bVar == null) {
                throw new IOException("Unknown chunk type value: " + i11);
            }
            int i12 = (byte) (b10 & 63);
            if (i12 > 63) {
                throw new IOException("Unknown chunk stream id value: " + i12);
            }
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = ((input.read() & 255) << 8) & input.read();
                }
                return new e(bVar, i12);
            }
            i10 = input.read();
            i12 = i10 - 64;
            return new e(bVar, i12);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48932a;

        static {
            int[] iArr = new int[nj.b.values().length];
            try {
                iArr[nj.b.TYPE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nj.b.TYPE_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nj.b.TYPE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[nj.b.TYPE_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48932a = iArr;
        }
    }

    public e(nj.b chunkType, int i10) {
        s.h(chunkType, "chunkType");
        this.f48930a = chunkType;
        this.f48931b = i10;
    }

    public final int a() {
        return this.f48931b;
    }

    public final nj.b b() {
        return this.f48930a;
    }

    public final int c(int i10) {
        int i11;
        int i12 = b.f48932a[this.f48930a.ordinal()];
        if (i12 == 1) {
            i11 = 12;
        } else if (i12 == 2) {
            i11 = 8;
        } else if (i12 == 3) {
            i11 = 4;
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 0;
        }
        return i10 >= 16777215 ? i11 + 4 : i11;
    }

    public String toString() {
        return "BasicHeader chunkType: " + this.f48930a + ", chunkStreamId: " + this.f48931b;
    }
}
