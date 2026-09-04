package q9;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.w1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface e {
    boolean a(boolean z10);

    w1 b(w1 w1Var);

    AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j10);

    long getSkippedOutputFrameCount();
}
