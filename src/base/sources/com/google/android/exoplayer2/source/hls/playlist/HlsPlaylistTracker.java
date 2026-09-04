package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.source.q;
import java.io.IOException;
import wa.g;
import xa.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface HlsPlaylistTracker {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class PlaylistResetException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17730a;

        public PlaylistResetException(Uri uri) {
            this.f17730a = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class PlaylistStuckException extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f17731a;

        public PlaylistStuckException(Uri uri) {
            this.f17731a = uri;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        HlsPlaylistTracker a(g gVar, com.google.android.exoplayer2.upstream.c cVar, e eVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();

        boolean c(Uri uri, com.google.android.exoplayer2.upstream.c.C0294c c0294c, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void g(com.google.android.exoplayer2.source.hls.playlist.c cVar);
    }

    void a(b bVar);

    void b(Uri uri);

    long c();

    d d();

    void f(Uri uri);

    void g(b bVar);

    boolean h(Uri uri);

    boolean j();

    boolean k(Uri uri, long j10);

    void l(Uri uri, q.a aVar, c cVar);

    void m();

    com.google.android.exoplayer2.source.hls.playlist.c o(Uri uri, boolean z10);

    void stop();
}
