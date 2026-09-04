package ni;

import android.media.AudioRecord;
import android.os.HandlerThread;
import android.util.Log;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class f extends e implements li.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f47794o;

    public f() {
        super(null);
        this.f47794o = "MicMM";
    }

    @Override // li.f
    public li.e a() {
        return g();
    }

    @Override // ni.e
    public synchronized void h() {
        e();
    }

    @Override // ni.e
    public synchronized void i() {
        this.f47792m = new HandlerThread("nothing");
        super.i();
    }

    public li.f j() {
        return this;
    }

    private void e() {
        AudioRecord audioRecord = this.f47781b;
        if (audioRecord == null) {
            Log.e("MicMM", UoyZyZEcGYBpIg.GTbFZMpEdcrIWp);
            return;
        }
        audioRecord.startRecording();
        this.f47785f = true;
        Log.i("MicMM", "Microphone started");
    }
}
