package xa;

import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {
    @Override // xa.e
    public com.google.android.exoplayer2.upstream.d.a a() {
        return new HlsPlaylistParser();
    }

    @Override // xa.e
    public com.google.android.exoplayer2.upstream.d.a b(com.google.android.exoplayer2.source.hls.playlist.d dVar, com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        return new HlsPlaylistParser(dVar, cVar);
    }
}
