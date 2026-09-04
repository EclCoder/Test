package l3;

import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43873a = new C0667a();

        /* JADX INFO: renamed from: l3.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0667a implements a {
            C0667a() {
            }

            @Override // l3.r.a
            public boolean a(t1.o oVar) {
                return false;
            }

            @Override // l3.r.a
            public r b(t1.o oVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // l3.r.a
            public int c(t1.o oVar) {
                return 1;
            }
        }

        boolean a(t1.o oVar);

        r b(t1.o oVar);

        int c(t1.o oVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f43874c = new b(C.TIME_UNSET, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f43875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f43876b;

        private b(long j10, boolean z10) {
            this.f43875a = j10;
            this.f43876b = z10;
        }

        public static b b() {
            return f43874c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, w1.h hVar);

    default k b(byte[] bArr, int i10, int i11) {
        final c0.a aVarR = c0.r();
        b bVar = b.f43874c;
        Objects.requireNonNull(aVarR);
        a(bArr, i10, i11, bVar, new w1.h() { // from class: l3.q
            @Override // w1.h
            public final void accept(Object obj) {
                aVarR.a((e) obj);
            }
        });
        return new g(aVarR.m());
    }

    int c();

    default void reset() {
    }
}
