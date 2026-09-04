package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import t1.o;
import t1.v;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i implements DefaultAudioSink.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f5066b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? d.f5015d : new d.b().e(true).g(z10).d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return d.f5015d;
            }
            return new d.b().e(true).f(c0.f55769a > 32 && playbackOffloadSupport == 2).g(z10).d();
        }
    }

    public i(Context context) {
        this.f5065a = context;
    }

    private boolean b(Context context) {
        AudioManager audioManager;
        Boolean bool = this.f5066b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO)) == null) {
            this.f5066b = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters("offloadVariableRateSupported");
            this.f5066b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        return this.f5066b.booleanValue();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.d
    public d a(o oVar, t1.b bVar) {
        w1.a.e(oVar);
        w1.a.e(bVar);
        int i10 = c0.f55769a;
        if (i10 < 29 || oVar.C == -1) {
            return d.f5015d;
        }
        boolean zB = b(this.f5065a);
        int iB = v.b((String) w1.a.e(oVar.f52757n), oVar.f52753j);
        if (iB == 0 || i10 < c0.J(iB)) {
            return d.f5015d;
        }
        int iL = c0.L(oVar.B);
        if (iL == 0) {
            return d.f5015d;
        }
        try {
            AudioFormat audioFormatK = c0.K(oVar.C, iL, iB);
            return i10 >= 31 ? b.a(audioFormatK, bVar.a().f52564a, zB) : a.a(audioFormatK, bVar.a().f52564a, zB);
        } catch (IllegalArgumentException unused) {
            return d.f5015d;
        }
    }
}
