package ni;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47775b = "AudioPostProcessEffect";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AcousticEchoCanceler f47776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AutomaticGainControl f47777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private NoiseSuppressor f47778e;

    public a(int i10) {
        this.f47774a = i10;
    }

    private final void d() {
        AutomaticGainControl automaticGainControl = this.f47777d;
        if (automaticGainControl != null) {
            automaticGainControl.setEnabled(false);
        }
        AutomaticGainControl automaticGainControl2 = this.f47777d;
        if (automaticGainControl2 != null) {
            automaticGainControl2.release();
        }
        this.f47777d = null;
    }

    private final void e() {
        AcousticEchoCanceler acousticEchoCanceler = this.f47776c;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.setEnabled(false);
        }
        AcousticEchoCanceler acousticEchoCanceler2 = this.f47776c;
        if (acousticEchoCanceler2 != null) {
            acousticEchoCanceler2.release();
        }
        this.f47776c = null;
    }

    private final void f() {
        NoiseSuppressor noiseSuppressor = this.f47778e;
        if (noiseSuppressor != null) {
            noiseSuppressor.setEnabled(false);
        }
        NoiseSuppressor noiseSuppressor2 = this.f47778e;
        if (noiseSuppressor2 != null) {
            noiseSuppressor2.release();
        }
        this.f47778e = null;
    }

    public final void a() {
        if (AcousticEchoCanceler.isAvailable() && this.f47776c == null) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(this.f47774a);
            this.f47776c = acousticEchoCancelerCreate;
            if (acousticEchoCancelerCreate == null) {
                Log.e(this.f47775b, "This device doesn't implement EchoCanceler");
            } else {
                acousticEchoCancelerCreate.setEnabled(true);
                Log.i(this.f47775b, "EchoCanceler enabled");
            }
        }
    }

    public final void b() {
        if (NoiseSuppressor.isAvailable() && this.f47778e == null) {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(this.f47774a);
            this.f47778e = noiseSuppressorCreate;
            if (noiseSuppressorCreate == null) {
                Log.e(this.f47775b, "This device doesn't implement NoiseSuppressor");
            } else {
                noiseSuppressorCreate.setEnabled(true);
                Log.i(this.f47775b, "NoiseSuppressor enabled");
            }
        }
    }

    public final void c() {
        d();
        e();
        f();
    }
}
