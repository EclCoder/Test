package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import ra.i;
import ra.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18803c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18804d;

        public a(int i10, int i11, int i12, int i13) {
            this.f18801a = i10;
            this.f18802b = i11;
            this.f18803c = i12;
            this.f18804d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                return this.f18801a - this.f18802b > 1;
            }
            return this.f18803c - this.f18804d > 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18806b;

        public b(int i10, long j10) {
            ob.a.a(j10 >= 0);
            this.f18805a = i10;
            this.f18806b = j10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0294c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f18807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f18808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f18809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f18810d;

        public C0294c(i iVar, j jVar, IOException iOException, int i10) {
            this.f18807a = iVar;
            this.f18808b = jVar;
            this.f18809c = iOException;
            this.f18810d = i10;
        }
    }

    int a(int i10);

    long c(C0294c c0294c);

    b d(a aVar, C0294c c0294c);

    default void b(long j10) {
    }
}
