package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.hecorat.screenrecorder.free.models.Ke.Lykgign;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class ChunkedTrackBlacklistUtil {
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    private static final String TAG = "ChunkedTrackBlacklist";

    private ChunkedTrackBlacklistUtil() {
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i10, Exception exc) {
        return maybeBlacklistTrack(trackSelection, i10, exc, DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean shouldBlacklist(Exception exc) {
        if (!(exc instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        return i10 == 404 || i10 == 410;
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i10, Exception exc, long j10) {
        if (!shouldBlacklist(exc)) {
            return false;
        }
        boolean zBlacklist = trackSelection.blacklist(i10, j10);
        int i11 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (!zBlacklist) {
            Log.w(TAG, "Blacklisting failed (cannot blacklist last enabled track): responseCode=" + i11 + ", format=" + trackSelection.getFormat(i10));
            return zBlacklist;
        }
        Log.w(TAG, "Blacklisted: duration=" + j10 + Lykgign.mHsIsR + i11 + ", format=" + trackSelection.getFormat(i10));
        return zBlacklist;
    }
}
